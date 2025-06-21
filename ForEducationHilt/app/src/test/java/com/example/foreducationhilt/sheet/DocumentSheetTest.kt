package com.example.foreducationhilt.sheet

import com.example.foreducationhilt.sheet.theme.ThemeA
import org.junit.Assert.assertEquals
import org.junit.Test

class DocumentSheetTest {

    @Test
    fun `DocumentSheet는 올바른 제목과 테마를 가져야 한다`() {
        // Given
        val testTitle = "테스트 문서"
        val testTheme = ThemeA()

        // When
        val documentSheet = DocumentSheet(testTitle, testTheme)

        // Then
        assertEquals(testTitle, documentSheet.title)
        assertEquals(testTheme, documentSheet.theme)
        assertEquals("테마 A", documentSheet.theme.name)
    }
} 