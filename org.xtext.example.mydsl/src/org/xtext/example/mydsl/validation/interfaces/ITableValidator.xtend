package org.xtext.example.mydsl.validation.interfaces

import org.xtext.example.mydsl.myDsl.SYSTEMROOT
import org.xtext.example.mydsl.myDsl.TABLE

interface ITableValidator {
    def void checkTableNameStartsWithCapital(TABLE table)
    def void checkAtLeastOneTable(SYSTEMROOT root)
    def void checkAtLeastOneColumn(TABLE table)
}
