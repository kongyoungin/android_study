package com.example.foreducationhilt.sheet.theme

import org.junit.Assert.assertEquals
import org.junit.Test

class ThemeATest {

    @Test
    fun `ThemeA의 이름은 '테마 A'여야 한다`() {
        // Given
        val themeA = ThemeA()

        // When
        val name = themeA.name

        // Then
        assertEquals("테마 A", name)
    }
} 