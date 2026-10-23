package com.example.korolev.domain

import kotlin.random.Random

object PolynomialMath {

    private const val MIN_DEGREE = 1
    private const val MAX_DEGREE = 4
    private const val MIN_COEFFICIENT = -9
    private const val MAX_COEFFICIENT = 9

    fun randomDegree(): Int {
        return Random.nextInt(MIN_DEGREE, MAX_DEGREE + 1)
    }

    fun randomCoefficients(degree: Int): List<Double> {
        val size = degree + 1
        return List(size) { randomCoefficient() }
    }

    private fun randomCoefficient(): Double {
        return Random.nextInt(MIN_COEFFICIENT, MAX_COEFFICIENT + 1).toDouble()
    }

    fun generateRandomPolynomials(): List<List<Double>> {
        val first = randomCoefficients(randomDegree())
        val second = randomCoefficients(randomDegree())
        return listOf(first, second)
    }

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
