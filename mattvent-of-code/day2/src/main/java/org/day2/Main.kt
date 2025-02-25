package org.day2

import kotlin.math.abs

fun main() {
    val input = readInput("day2input.txt")
//    val input = readInput("day2example.txt")
    val lines = input.lines().map({ line -> line.split("\\s+".toRegex()) })
    var count = 0
    // Part 1 - find number of safe rows by:
    //      * row values are all increasing or all decreasing
    //      * adjacent values are different by at least 1 and at most 3
    lines.forEach({ line ->
        if ((isDecreasing(line) || isIncreasing(line)) && smallDifference(line))
            count++
        else
            println(line + " not good")
    })

    println("number of increasing or decreasing: ${count}")
    //part 1 answer: 383
}

fun isIncreasing(line: List<String>): Boolean {
    if (line.size == 1) return true
    return line.windowed(2) { (l, r) -> l.toInt() < r.toInt() }.all { it }
}

fun isDecreasing(line: List<String>): Boolean {
    if (line.size == 1) return true
    return line.windowed(2) { (l, r) -> l.toInt() > r.toInt() }.all { it }
}

fun smallDifference(line: List<String>): Boolean {
    if (line.size <= 1) return false
    return line.windowed(2) { (l, r) -> abs(l.toInt() - r.toInt()) }.all { it in 1..3 }
}

fun readInput(fileName: String): String {
    return ClassLoader.getSystemResource(fileName).readText()
}