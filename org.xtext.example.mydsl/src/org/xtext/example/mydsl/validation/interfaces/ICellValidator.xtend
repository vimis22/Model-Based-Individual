package org.xtext.example.mydsl.validation.interfaces

import org.xtext.example.mydsl.myDsl.CELL
import org.xtext.example.mydsl.myDsl.COLUMN

interface ICellValidator {
    def void checkNoDuplicateCellsInColumn(COLUMN column)
    def void checkCellHasValue(CELL cell)
}
