package com.example.foreducationhilt.sheet

import com.example.foreducationhilt.sheet.theme.Theme
import javax.inject.Inject
import javax.inject.Named

class ExcelSheet @Inject constructor(
    @Named("themeB") override val theme: Theme
) : Sheet {
    override val title: String = "엑셀 시트"
} 