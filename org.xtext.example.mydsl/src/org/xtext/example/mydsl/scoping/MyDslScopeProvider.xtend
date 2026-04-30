package org.xtext.example.mydsl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.xtext.example.mydsl.myDsl.Column
import org.xtext.example.mydsl.myDsl.LetDeclaration
import org.xtext.example.mydsl.myDsl.MATHUNIT
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.SystemRoot
import org.xtext.example.mydsl.myDsl.Table

class MyDslScopeProvider extends AbstractMyDslScopeProvider {

    override IScope getScope(EObject context, EReference reference) {
        if (context instanceof MATHUNIT &&
            reference == MyDslPackage.Literals.MATHUNIT__VAR_REF) {
            return buildLetScope(context as MATHUNIT)
        }

        return super.getScope(context, reference)
    }

    def IScope buildLetScope(MATHUNIT unit) {
        val unitOffset = NodeModelUtils.getNode(unit).offset

        val currentLet = EcoreUtil2.getContainerOfType(unit, LetDeclaration)

        val column = EcoreUtil2.getContainerOfType(unit, Column)
        val table  = EcoreUtil2.getContainerOfType(unit, Table)
        val root   = EcoreUtil2.getContainerOfType(unit, SystemRoot)

        val globalDefs = root?.vars
            .filter[isVisibleBefore(it, unitOffset, currentLet)]
            .toList ?: #[]

        val tableDefs = table?.vars
            .filter[isVisibleBefore(it, unitOffset, currentLet)]
            .toList ?: #[]

        val colDefs = column?.vars
            .filter[isVisibleBefore(it, unitOffset, currentLet)]
            .toList ?: #[]

        val globalScope = Scopes.scopeFor(globalDefs, IScope.NULLSCOPE)
        val tableScope  = Scopes.scopeFor(tableDefs, globalScope)
        val columnScope = Scopes.scopeFor(colDefs, tableScope)

        return columnScope
    }

    def boolean isVisibleBefore(LetDeclaration declaration, int unitOffset, LetDeclaration currentLet) {
        if (declaration === currentLet) {
            return false
        }

        val declarationNode = NodeModelUtils.getNode(declaration)

        if (declarationNode === null) {
            return false
        }

        return declarationNode.endOffset < unitOffset
    }
}