package com.example.korolev

import com.example.korolev.data.PolynomialInputParser
import org.junit.Assert.assertEquals
import org.junit.Test

class PolynomialInputParserTest {

    @Test
    fun testParse() {
        val text = "1, 2, 3\n4, 5, 6"

        val expected = listOf(
            listOf(1.0, 2.0, 3.0),
            listOf(4.0, 5.0, 6.0)
        )

        val result = PolynomialInputParser.parse(text)

        assertEquals(expected, result)
    }
}
