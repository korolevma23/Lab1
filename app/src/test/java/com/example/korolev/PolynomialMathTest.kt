package com.example.korolev

import com.example.korolev.domain.PolynomialMath
import org.junit.Assert.assertEquals
import org.junit.Test

class PolynomialMathTest {

    @Test
    fun testSum() {
        val first = listOf(1.0, 2.0, 3.0)
        val second = listOf(4.0, 5.0, 6.0)

        val result = PolynomialMath.sum(first, second)

        assertEquals(listOf(5.0, 7.0, 9.0), result)
    }
}
