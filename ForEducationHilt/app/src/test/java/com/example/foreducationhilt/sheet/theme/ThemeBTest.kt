package com.example.foreducationhilt.sheet.theme

import org.junit.Assert.assertEquals
import org.junit.Test

class ThemeBTest {

    @Test
    fun `ThemeB의 이름은 '테마 B'여야 한다`() {
        // Given
        val themeB = ThemeB()

        // When
        val name = themeB.name

        // Then
        assertEquals("테마 B", name)
    }
} 