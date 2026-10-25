package com.example.korolev.data

object PolynomialResultFormatter {

    fun formatPolynomial(coefficients: List<Double>): String {
        val powers = coefficients.indices.toList()
        val nonZeroPowers = powers.filter { power -> coefficients[power] != 0.0 }

        if (nonZeroPowers.isEmpty()) {
            return "0"
        }

        val terms = nonZeroPowers.map { power -> formatTerm(coefficients[power], power) }
        return terms.joinToString(separator = " + ")
    }

    fun formatInput(polynomials: List<List<Double>>): String {
        val lines = polynomials.map { coefficients -> formatCoefficientsLine(coefficients) }
        return lines.joinToString(separator = "\n")
    }

    fun formatCoefficientsLine(coefficients: List<Double>): String {
        return coefficients.joinToString(separator = ", ") { value -> "%.2f".format(value) }
    }

    private fun formatTerm(value: Double, power: Int): String {
        return when (power) {
            0 -> "%.2f".format(value)
            1 -> "%.2fx".format(value)
            else -> "%.2fx^%d".format(value, power)
        }
    }
}
