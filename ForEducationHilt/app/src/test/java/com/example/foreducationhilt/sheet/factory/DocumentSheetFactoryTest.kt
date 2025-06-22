package com.example.foreducationhilt.sheet.factory

import com.example.foreducationhilt.sheet.theme.ThemeA
import org.junit.Assert.assertEquals
import org.junit.Test

class DocumentSheetFactoryTest {

    @Test
    fun `팩토리는 올바른 제목과 테마로 DocumentSheet를 생성해야 한다`() {
        // Given
        val factory = DocumentSheetFactory()
        val testTheme = ThemeA()

        // When
        val documentSheet = factory.create(testTheme)

        // Then
        assertEquals("문서 시트", documentSheet.title)
        assertEquals(testTheme, documentSheet.theme)
        assertEquals("테마 A", documentSheet.theme.name)
    }
} 