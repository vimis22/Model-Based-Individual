package org.xtext.example.mydsl.validation

import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.validation.Check
import org.xtext.example.mydsl.myDsl.MATHUNIT
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.SystemRoot
import org.xtext.example.mydsl.myDsl.Table
import org.xtext.example.mydsl.myDsl.VarDeclaration
import org.xtext.example.mydsl.validation.interfaces.ITableValidator
import org.xtext.example.mydsl.validation.interfaces.ITypeChecker
import org.xtext.example.mydsl.validation.interfaces.IVariableValidator

class MyDslValidator extends AbstractMyDslValidator implements ITableValidator, ITypeChecker, IVariableValidator {

    public static val FORWARD_REFERENCE = 'forwardReference'
    public static val DUPLICATE_VAR = 'duplicateVar'
    public static val INVALID_NAME = 'invalidName'
    public static val MISSING_TABLE = 'missingTable'
    public static val MISSING_COLUMN = 'missingColumn'
    public static val TYPE_MISMATCH = 'typeMismatch'

    @Check
    override def checkTableNameStartsWithCapital(Table table) {
        if (!Character.isUpperCase(table.name.charAt(0))) {
            warning('Table name should start with a capital',
                MyDslPackage.Literals.TABLE__NAME,
                INVALID_NAME)
        }
    }

    @Check
    override def checkNoDuplicateVarsInTable(Table table) {
        val names = newHashSet
        for (v : table.vars) {
            if (!names.add(v.name)) {
                error('Duplicate variable "' + v.name + '" in table',
                    v, MyDslPackage.Literals.VAR_DECLARATION__NAME, DUPLICATE_VAR)
            }
        }
    }

    @Check
    override def checkNoDuplicateVarsInRoot(SystemRoot root) {
        val names = newHashSet
        for (v : root.vars) {
            if (!names.add(v.name)) {
                error('Duplicate variable "' + v.name + '" in global scope',
                    v, MyDslPackage.Literals.VAR_DECLARATION__NAME, DUPLICATE_VAR)
            }
        }
    }

    @Check
    override def checkAtLeastOneTable(SystemRoot root) {
        if (root.tables === null || root.tables.isEmpty) {
            error('A Model must contain at least one table',
                MyDslPackage.Literals.SYSTEM_ROOT__TABLES, MISSING_TABLE)
        }
    }

    @Check
    override def checkAtLeastOneColumn(Table table) {
        if (table.columns === null || table.columns.empty) {
            error('Table "' + table.name + '" must contain at least one column',
                MyDslPackage.Literals.TABLE__COLUMNS, MISSING_COLUMN)
        }
    }

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

    // Tjekker at variablens værdi passer til den angivne type
    @Check
    override def void checkVarTypeCompatibility(VarDeclaration decl) {
        val value = decl.value
        if (value !== null) switch (decl.type) {
            case 'string':
                if (value.strVal === null)
                    error('Expected a string value for "' + decl.name + '"',
                        decl, MyDslPackage.Literals.VAR_DECLARATION__VALUE, TYPE_MISMATCH)
            case 'boolean':
                if (value.boolVal === null)
                    error('Expected true or false for "' + decl.name + '"',
                        decl, MyDslPackage.Literals.VAR_DECLARATION__VALUE, TYPE_MISMATCH)
            case 'int',
            case 'double':
                if (value.numVal === null)
                    error('Expected a numeric value for "' + decl.name + '"',
                        decl, MyDslPackage.Literals.VAR_DECLARATION__VALUE, TYPE_MISMATCH)
        }
    }
}
