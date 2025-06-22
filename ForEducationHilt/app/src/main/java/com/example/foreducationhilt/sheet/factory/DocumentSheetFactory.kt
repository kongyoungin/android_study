package com.example.foreducationhilt.sheet.factory

import com.example.foreducationhilt.sheet.DocumentSheet
import com.example.foreducationhilt.sheet.theme.Theme

class DocumentSheetFactory {
    fun create(theme: Theme): DocumentSheet {
        return DocumentSheet(theme)
    }
} 