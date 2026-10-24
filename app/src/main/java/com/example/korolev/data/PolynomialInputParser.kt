package com.example.korolev.data

object PolynomialInputParser {

    fun parse(text: String): List<List<Double>> {
        val lines = text.lines()
        val notEmptyLines = lines.filter { line -> line.trim().isNotEmpty() }
        return notEmptyLines.map { line -> parseLine(line) }
    }

    fun parseLine(line: String): List<Double> {
        val parts = line.split(",")
        val trimmedParts = parts.map { part -> part.trim() }
        val notEmptyParts = trimmedParts.filter { part -> part.isNotEmpty() }
        return notEmptyParts.mapNotNull { part -> part.toDoubleOrNull() }
    }
}
