package org.xtext.example.mydsl.validation.interfaces

import org.xtext.example.mydsl.myDsl.MATHUNIT
import org.xtext.example.mydsl.myDsl.SystemRoot
import org.xtext.example.mydsl.myDsl.Table

interface IVariableValidator {
    def void checkNoDuplicateVarsInTable(Table table)
    def void checkNoDuplicateVarsInRoot(SystemRoot root)
    def void checkNoForwardReferences(MATHUNIT unit)
}
