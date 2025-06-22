package com.example.foreducationhilt.sheet

import com.example.foreducationhilt.sheet.theme.ThemeB
import org.junit.Assert.assertEquals
import org.junit.Test

class ExcelSheetTest {

    @Test
    fun `ExcelSheet는 올바른 제목과 테마를 가져야 한다`() {
        // Given
        val testTheme = ThemeB()

        // When
        val excelSheet = ExcelSheet(testTheme)

        // Then
        assertEquals("엑셀 시트", excelSheet.title)
        assertEquals(testTheme, excelSheet.theme)
        assertEquals("테마 B", excelSheet.theme.name)
    }
} 