package com.example.korolev

import com.example.korolev.data.PolynomialResultFormatter
import org.junit.Assert.assertEquals
import org.junit.Test

class PolynomialResultFormatterTest {

    @Test
    fun testFormatPolynomial() {
        val coefficients = listOf(2.0, 3.0, 4.0)
        val expected = "%.2f".format(2.0) + " + " +
                "%.2f".format(3.0) + "x + " +
                "%.2f".format(4.0) + "x^2"

        val result = PolynomialResultFormatter.formatPolynomial(coefficients)

        assertEquals(expected, result)
    }

    @Test
    fun testZeroPolynomial() {
        val coefficients = listOf(0.0, 0.0, 0.0)

        val result = PolynomialResultFormatter.formatPolynomial(coefficients)

        assertEquals("0", result)
    }
}
