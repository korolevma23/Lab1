package com.example.korolev.domain

object PolynomialMath {

    fun sum(first: List<Double>, second: List<Double>): List<Double> {
        val size = maxOf(first.size, second.size)
        val indexes = 0 until size
        return indexes.map { index ->
            coefficientAt(first, index) + coefficientAt(second, index)
        }
    }

    private fun coefficientAt(coefficients: List<Double>, index: Int): Double {
        if (index < coefficients.size) {
            return coefficients[index]
        }
        return 0.0
    }
}
