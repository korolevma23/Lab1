package com.example.korolev

import com.example.korolev.domain.PolynomialMath
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Test

class PolynomialMathTest {

    @Test
    fun testSum() {
        val first = listOf(1.0, 2.0, 3.0)
        val second = listOf(4.0, 5.0, 6.0)

        val result = PolynomialMath.sum(first, second)

        assertEquals(listOf(5.0, 7.0, 9.0), result)
    }

    @Test
    fun testRandomPolynomials() {
        repeat(100) {
            val polynomials = PolynomialMath.generateRandomPolynomials()

            assertEquals(2, polynomials.size)

            polynomials.forEach { coefficients ->
                assertTrue(coefficients.size in 2..5)
                assertTrue(coefficients.all { it in -9.0..9.0 })
                assertTrue(coefficients.all { it % 1.0 == 0.0 })
            }
        }
    }

    @Test
    fun testSumFromText() {
        val text = "1, 2, 3\n4, 5, 6"
        val expected = "%.2f".format(5.0) + " + " +
                "%.2f".format(7.0) + "x + " +
                "%.2f".format(9.0) + "x^2"

        val result = PolynomialMath.sumFromText(text)

        assertEquals(expected, result)
    }

    @Test
    fun testInvalidInput() {
        val text = "1, 2, 3"

        val result = PolynomialMath.sumFromText(text)

        assertNull(result)
    }
}
