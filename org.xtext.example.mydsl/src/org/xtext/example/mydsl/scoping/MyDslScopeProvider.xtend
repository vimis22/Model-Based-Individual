package org.xtext.example.mydsl.scoping

import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.xtext.example.mydsl.myDsl.SYSTEMROOT
import org.xtext.example.mydsl.myDsl.COLUMN
import org.xtext.example.mydsl.myDsl.MATHUNIT
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.TABLE
import org.xtext.example.mydsl.myDsl.VARDECLARATION

class MyDslScopeProvider extends AbstractMyDslScopeProvider {

    override IScope getScope(EObject context, EReference reference) {
        if (context instanceof MATHUNIT && reference == MyDslPackage.Literals.MATHUNIT__VAR_REF)
            return buildVarScope(context as MATHUNIT)
        return super.getScope(context, reference)
    }

    def IScope buildVarScope(MATHUNIT unit) {
        val offset = NodeModelUtils.getNode(unit).offset
        val currentVariable = EcoreUtil2.getContainerOfType(unit, VARDECLARATION)
        val column = EcoreUtil2.getContainerOfType(unit, COLUMN)
        val table = EcoreUtil2.getContainerOfType(unit, TABLE)
        val root = EcoreUtil2.getContainerOfType(unit, SYSTEMROOT)

        val globalVariables = new ArrayList<VARDECLARATION>()
        val tableVariables = new ArrayList<VARDECLARATION>()
        val columnVariables = new ArrayList<VARDECLARATION>()

        if (root != null) {
            for (variable : root.variables) {
                if (variable !== currentVariable && NodeModelUtils.getNode(variable)?.endOffset < offset) {
                    globalVariables.add(variable)
                }
            }
        }

        if (table != null) {
            for (variable : table.variables) {
                if (variable !== currentVariable && NodeModelUtils.getNode(variable)?.endOffset < offset) {
                    tableVariables.add(variable)
                }
            }
        }

        if (column != null) {
            for (variable : column.variables) {
                if (variable !== currentVariable && NodeModelUtils.getNode(variable)?.endOffset < offset) {
                    columnVariables.add(variable)
                }
            }
        }

        val globalScope = Scopes.scopeFor(globalVariables, IScope.NULLSCOPE)
        val tableScope = Scopes.scopeFor(tableVariables, globalScope)
        val columnScope = Scopes.scopeFor(columnVariables, tableScope)
        return columnScope
    }
}
