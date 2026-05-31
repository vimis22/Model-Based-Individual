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

    public static val FORWARD_REFERENCE = 'forwardReference'
    public static val DUPLICATE_VAR = 'duplicateVar'
    public static val DUPLICATE_COLUMN = 'duplicateColumn'
    public static val DUPLICATE_CELL = 'duplicateCell'
    public static val INVALID_NAME = 'invalidName'
    public static val TYPE_MISMATCH = 'typeMismatch'
    public static val MISSING_VALUE = 'missingValue'

    // === ROOT ===

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

    // === TABLE ===

    @Check
    override def checkTableNameStartsWithCapital(TABLE table) {
        if (!Character.isUpperCase(table.name.charAt(0))) {
            warning('Table name should start with a capital',
                MyDslPackage.Literals.TABLE__NAME,
                INVALID_NAME)
        }
    }

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

    // === CELL ===

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

    @Check
    override def checkCellHasValue(CELL cell) {
        if (cell.value === null) {
            warning('Cell ' + cell.name + ' has no value defined',
                cell, MyDslPackage.Literals.CELL__VALUE, MISSING_VALUE)
        }
    }

    // === VARIABLE ===

    @Check
    override def checkVariableNameStartsWithLowercase(VARDECLARATION decl) {
        if (!Character.isLowerCase(decl.name.charAt(0))) {
            warning('Variable name "' + decl.name + '" should start with a lowercase letter',
                decl, MyDslPackage.Literals.VARDECLARATION__NAME, INVALID_NAME)
        }
    }

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

    // === REST ===

    // Tillader ikke brug af variable, der er defineret længere nede i koden
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
