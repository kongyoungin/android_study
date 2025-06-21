package com.example.foreducationhilt.sheet.factory

import com.example.foreducationhilt.sheet.DocumentSheet
import com.example.foreducationhilt.sheet.theme.Theme

class DocumentSheetFactory {
    fun create(title: String, theme: Theme): DocumentSheet {
        return DocumentSheet(title, theme)
    }
} 