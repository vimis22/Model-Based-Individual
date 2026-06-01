package org.xtext.example.mydsl.validation

import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.CELL
import org.xtext.example.mydsl.myDsl.COLUMN
import org.xtext.example.mydsl.myDsl.MATHUNIT
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.SYSTEMROOT
import org.xtext.example.mydsl.myDsl.TABLE
import org.xtext.example.mydsl.myDsl.VARDECLARATION
import org.xtext.example.mydsl.validation.interfaces.ICellValidator
import org.xtext.example.mydsl.validation.interfaces.IColumnValidator
import org.xtext.example.mydsl.validation.interfaces.ITableValidator
import org.xtext.example.mydsl.validation.interfaces.ITypeChecker
import org.xtext.example.mydsl.validation.interfaces.IVariableValidator

class MyDslValidator extends AbstractMyDslValidator implements ITableValidator, ITypeChecker, IVariableValidator, IColumnValidator, ICellValidator {

    //These are Error/Warning codes that can used to identify validation issues.
    // These can be referenced externally, such sa for quick fixes or tests.
    public static val FORWARD_REFERENCE = 'forwardReference'
    public static val DUPLICATE_VAR = 'duplicateVar'
    public static val DUPLICATE_COLUMN = 'duplicateColumn'
    public static val DUPLICATE_CELL = 'duplicateCell'
    public static val INVALID_NAME = 'invalidName'
    public static val TYPE_MISMATCH = 'typeMismatch'
    public static val MISSING_VALUE = 'missingValue'

    // Checks that no two global variables share the same name.
    // Global variables live in SYSTEMROOT, so duplicates here would cause confusion in terms of references across the entire program.
    @Check
    override def checkNoDuplicateVarsInRoot(SYSTEMROOT root) {
        val names = newHashSet
        for (variable : root.variables) {
            if (!names.add(variable.name)) {
                error('Duplicate variable "' + variable.name + '" in global scope',
                    variable, MyDslPackage.Literals.VARDECLARATION__NAME, DUPLICATE_VAR)
            }
        }
    }

    // Checks that all table names in SYSTEMROOT are unique.
    // Tables are identified by name, so duplicates would make references ambiguous.
    @Check
    override def checkNoDuplicateTableNames(SYSTEMROOT root) {
        val names = newHashSet
        for (table : root.tables) {
            if (!names.add(table.name)) {
                error('Duplicate table name "' + table.name + '"',
                    table, MyDslPackage.Literals.TABLE__NAME, DUPLICATE_VAR)
            }
        }
    }

    // Naming Convention Standard, defined by Vivek & Group: Table names must start with an uppercase letter.
    // This is a design decision to visually distinguish between tables from variables and columns.
    @Check
    override def checkTableNameStartsWithCapital(TABLE table) {
        if (!Character.isUpperCase(table.name.charAt(0))) {
            warning('Table name should start with a capital',
                MyDslPackage.Literals.TABLE__NAME,
                INVALID_NAME)
        }
    }

    // Checks that no two variables within the same table share the same name.
    // Table-scoped variables shadow global ones, in order to avoid duplicates within a table that would create confusion at the scope level.
    @Check
    override def checkNoDuplicateVarsInTable(TABLE table) {
        val names = newHashSet
        for (variable : table.variables) {
            if (!names.add(variable.name)) {
                error('Duplicate variable "' + variable.name + '" in table',
                    variable, MyDslPackage.Literals.VARDECLARATION__NAME, DUPLICATE_VAR)
            }
        }
    }

    // Checks that all column names within the same table dont have the same name.
    // This is a design decision to visually distinguish between columns from variables and tables.
    @Check
    override def checkNoDuplicateColumnsInTable(TABLE table) {
        val names = newHashSet
        for (column : table.columns) {
            if (!names.add(column.name)) {
                error('Duplicate column "' + column.name + '" in table "' + table.name + '"',
                    column, MyDslPackage.Literals.COLUMN__NAME, DUPLICATE_COLUMN)
            }
        }
    }

    // Checks that all cell names within the same column dont have the same Number Index.
    // This is a design decision to visually distinguish between cells from variables and columns.
    @Check
    override def checkNoDuplicateCellsInColumn(COLUMN column) {
        val indices = newHashSet
        for (cell : column.cell) {
            if (!indices.add(cell.name)) {
                error('Duplicate cell index ' + cell.name + ' in column "' + column.name + '"',
                    cell, MyDslPackage.Literals.CELL__NAME, DUPLICATE_CELL)
            }
        }
    }

    // Error if a cell has been declared but has no value assigned.
    // A cell must have a value, otherwise references to it have nothing to resolve.
    @Check
    override def checkCellHasValue(CELL cell) {
        if (cell.value === null) {
            error('Cell ' + cell.name + ' has no value defined',
                cell, MyDslPackage.Literals.CELL__VALUE, MISSING_VALUE)
        }
    }

    // Enforces naming convention: variable names must start with a lowercase letter.
    // This distinguishes variables from tables (uppercase) and improves readability.
    @Check
    override def checkVariableNameStartsWithLowercase(VARDECLARATION decl) {
        if (!Character.isLowerCase(decl.name.charAt(0))) {
            warning('Variable name "' + decl.name + '" should start with a lowercase letter',
                decl, MyDslPackage.Literals.VARDECLARATION__NAME, INVALID_NAME)
        }
    }

    // Checks that the assigned value matches the declared type of the variable.
    // Uses a switch on the declared type (string, boolean, int, double) and validates that the value's corresponding field is non-null.
    // Design decision: type checking at declaration time catches errors early.
    @Check
    override def void checkVarTypeCompatibility(VARDECLARATION decl) {
        val value = decl.value
        if (value !== null) switch (decl.type) {
            case 'string':
                if (value.stringValue === null)
                    error('Expected a string value for "' + decl.name + '"',
                        decl, MyDslPackage.Literals.VARDECLARATION__VALUE, TYPE_MISMATCH)
            case 'boolean':
                if (value.booleanValue === null)
                    error('Expected true or false for "' + decl.name + '"',
                        decl, MyDslPackage.Literals.VARDECLARATION__VALUE, TYPE_MISMATCH)
            case 'int',
            case 'double':
                if (value.numberValue === null)
                    error('Expected a numeric value for "' + decl.name + '"',
                        decl, MyDslPackage.Literals.VARDECLARATION__VALUE, TYPE_MISMATCH)
        }
    }

    // Prevents the use of variables that are declared later in the file (forward references).
    // This method compares the text offset of the reference against the offset of the declaration.
    // Design decision: We want to ensure, that a variable must declared first in order for it to be used. Otherwise Scope Resolution won't work.
    @Check
    override def checkNoForwardReferences(MATHUNIT unit) {
        if (unit.varRef === null) return

        val unitOffset = NodeModelUtils.getNode(unit).offset
        val varOffset  = NodeModelUtils.getNode(unit.varRef).offset

        if (varOffset > unitOffset) {
            error('Forward Reference is not allowed: "' + unit.varRef.name + '" is defined later',
                MyDslPackage.Literals.MATHUNIT__VAR_REF, FORWARD_REFERENCE)
        }
    }
}
