package org.xtext.example.mydsl.validation.interfaces

import org.xtext.example.mydsl.myDsl.MATHUNIT
import org.xtext.example.mydsl.myDsl.SYSTEMROOT
import org.xtext.example.mydsl.myDsl.TABLE
import org.xtext.example.mydsl.myDsl.VARDECLARATION

interface IVariableValidator {
    def void checkNoDuplicateVarsInTable(TABLE table)
    def void checkNoDuplicateVarsInRoot(SYSTEMROOT root)
    def void checkNoForwardReferences(MATHUNIT unit)
    def void checkVariableNameStartsWithLowercase(VARDECLARATION decl)
}
