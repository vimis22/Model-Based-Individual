package org.xtext.example.mydsl.validation.interfaces

import org.xtext.example.mydsl.myDsl.VARDECLARATION

interface ITypeChecker {
    def void checkVarTypeCompatibility(VARDECLARATION decl)
}
