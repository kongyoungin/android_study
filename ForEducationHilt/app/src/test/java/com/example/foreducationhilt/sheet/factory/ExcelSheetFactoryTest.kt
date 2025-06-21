package com.example.foreducationhilt.sheet.factory

import com.example.foreducationhilt.sheet.theme.ThemeB
import org.junit.Assert.assertEquals
import org.junit.Test

class ExcelSheetFactoryTest {

    @Test
    fun `팩토리는 올바른 제목과 테마로 ExcelSheet를 생성해야 한다`() {
        // Given
        val factory = ExcelSheetFactory()
        val testTitle = "엑셀 팩토리 테스트"
        val testTheme = ThemeB()

        // When
        val excelSheet = factory.create(testTitle, testTheme)

        // Then
        assertEquals(testTitle, excelSheet.title)
        assertEquals(testTheme, excelSheet.theme)
        assertEquals("테마 B", excelSheet.theme.name)
    }
} 