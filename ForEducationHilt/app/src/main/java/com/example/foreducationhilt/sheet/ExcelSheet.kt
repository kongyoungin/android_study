package com.example.foreducationhilt.sheet

import com.example.foreducationhilt.sheet.theme.Theme
import javax.inject.Inject

class ExcelSheet @Inject constructor(
    override val title: String,
    override val theme: Theme
) : Sheet 