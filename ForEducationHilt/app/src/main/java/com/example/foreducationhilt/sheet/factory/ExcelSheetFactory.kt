package com.example.foreducationhilt.sheet.factory

import com.example.foreducationhilt.sheet.ExcelSheet
import com.example.foreducationhilt.sheet.theme.Theme

class ExcelSheetFactory {
    fun create(theme: Theme): ExcelSheet {
        return ExcelSheet(theme)
    }
} 