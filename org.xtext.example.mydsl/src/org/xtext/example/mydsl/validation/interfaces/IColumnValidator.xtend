package org.xtext.example.mydsl.validation.interfaces

import org.xtext.example.mydsl.myDsl.TABLE

interface IColumnValidator {
    def void checkNoDuplicateColumnsInTable(TABLE table)
}
