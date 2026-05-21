package org.xtext.example.mydsl.validation.interfaces

import org.xtext.example.mydsl.myDsl.SystemRoot
import org.xtext.example.mydsl.myDsl.Table

interface ITableValidator {
    def void checkTableNameStartsWithCapital(Table table)
    def void checkAtLeastOneTable(SystemRoot root)
    def void checkAtLeastOneColumn(Table table)
}
