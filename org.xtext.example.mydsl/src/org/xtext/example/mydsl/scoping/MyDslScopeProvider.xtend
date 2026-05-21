package org.xtext.example.mydsl.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.xtext.example.mydsl.myDsl.Column
import org.xtext.example.mydsl.myDsl.MATHUNIT
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.SystemRoot
import org.xtext.example.mydsl.myDsl.Table
import org.xtext.example.mydsl.myDsl.VarDeclaration

class MyDslScopeProvider extends AbstractMyDslScopeProvider {

    override IScope getScope(EObject context, EReference reference) {
        if (context instanceof MATHUNIT &&
            reference == MyDslPackage.Literals.MATHUNIT__VAR_REF) {
            return buildVarScope(context as MATHUNIT)
        }
        return super.getScope(context, reference)
    }

    // Samler alle variabler fra column, table og systemroot som er synlige
    // før den aktuelle deklaration, og bygger indlejrede scopes.
    def IScope buildVarScope(MATHUNIT unit) {
        val offset     = NodeModelUtils.getNode(unit).offset
        val currentVar = EcoreUtil2.getContainerOfType(unit, VarDeclaration)

        val colContainer   = EcoreUtil2.getContainerOfType(unit, Column)
        val tableContainer = EcoreUtil2.getContainerOfType(unit, Table)
        val root           = EcoreUtil2.getContainerOfType(unit, SystemRoot)

        // Kolonne-variabler skygger tabel-variabler, som skygger globale
        val globalScope = Scopes.scopeFor(collectVisible(root?.vars, offset, currentVar), IScope.NULLSCOPE)
        val tableScope  = Scopes.scopeFor(collectVisible(tableContainer?.vars, offset, currentVar), globalScope)
        val columnScope = Scopes.scopeFor(collectVisible(colContainer?.vars, offset, currentVar), tableScope)

        return columnScope
    }

    def private collectVisible(Iterable<VarDeclaration> vars, int offset, VarDeclaration current) {
        if (vars === null) return #[]
        return vars.filter[it !== current && NodeModelUtils.getNode(it)?.endOffset < offset].toList
    }
}
