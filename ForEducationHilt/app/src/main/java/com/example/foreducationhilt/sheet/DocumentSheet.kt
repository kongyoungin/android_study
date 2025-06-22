package com.example.foreducationhilt.sheet

import com.example.foreducationhilt.sheet.theme.Theme
import javax.inject.Inject
import javax.inject.Named

class DocumentSheet @Inject constructor(
    @Named("themeA") override val theme: Theme
) : Sheet {
    override val title: String = "문서 시트"
}