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
    //Example taken from the Slide Powerpoint from Lectures
    override IScope getScope(EObject context, EReference reference) {
        if (context instanceof MATHUNIT && reference == MyDslPackage.Literals.MATHUNIT__VAR_REF)
            return buildVarScope(context as MATHUNIT)
        return super.getScope(context, reference)
    }

    def IScope buildVarScope(MATHUNIT unit) {
        //@link https://archive.eclipse.org/modeling/tmf/xtext/javadoc/2.5/org/eclipse/xtext/nodemodel/util/NodeModelUtils.html
        // offset is the position of the cursor in the text, and we want to find all variables that are declared before this position
        val offset = NodeModelUtils.getNode(unit).offset

        // currentVariable is the VARDECLARATION node that contains the current MATHUNIT.
        val currentVariable = EcoreUtil2.getContainerOfType(unit, VARDECLARATION)

        // column is the COLUMN node that contains the current MATHUNIT.
        val column = EcoreUtil2.getContainerOfType(unit, COLUMN)

        // table is the TABLE node that contains the current MATHUNIT.
        val table = EcoreUtil2.getContainerOfType(unit, TABLE)

        // root is the top-level SYSTEMROOT — gives access to global variables
        val root = EcoreUtil2.getContainerOfType(unit, SYSTEMROOT)

        // Collect visible variables per scope level, filtered by position.
        val globalVariables = new ArrayList<VARDECLARATION>()
        val tableVariables = new ArrayList<VARDECLARATION>()
        val columnVariables = new ArrayList<VARDECLARATION>()

        // Only include variables declared before the current offset (no forward references)
        // and exclude the variable currently being defined (no self-reference)
        if (root !== null) {
            for (variable : root.variables) {
                if (variable !== currentVariable && NodeModelUtils.getNode(variable)?.endOffset < offset) {
                    globalVariables.add(variable)
                }
            }
        }

        if (table !== null) {
            for (variable : table.variables) {
                if (variable !== currentVariable && NodeModelUtils.getNode(variable)?.endOffset < offset) {
                    tableVariables.add(variable)
                }
            }
        }

        if (column !== null) {
            for (variable : column.variables) {
                if (variable !== currentVariable && NodeModelUtils.getNode(variable)?.endOffset < offset) {
                    columnVariables.add(variable)
                }
            }
        }

        // Builds a layered scope hiearchy: column > table > global
        // Inner scopes shadow outer ones (column variables take priority)
        val globalScope = Scopes.scopeFor(globalVariables, IScope.NULLSCOPE)
        val tableScope = Scopes.scopeFor(tableVariables, globalScope)
        val columnScope = Scopes.scopeFor(columnVariables, tableScope)
        return columnScope
    }
}
