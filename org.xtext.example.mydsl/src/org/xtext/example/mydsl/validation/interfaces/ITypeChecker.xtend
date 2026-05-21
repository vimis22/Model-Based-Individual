package org.xtext.example.mydsl.validation.interfaces

import org.xtext.example.mydsl.myDsl.VarDeclaration

interface ITypeChecker {
    def void checkVarTypeCompatibility(VarDeclaration decl)
}
