package org.day1

import kotlin.math.abs

fun main() {
//    val input = readInput("day1example.txt")
    val input = readInput("day1.txt")
    val left = mutableListOf<Int>()
    val right = mutableListOf<Int>()

    // Part 1
    input
        .lines()
        .map { line -> line.split("\\s+".toRegex())}
        .forEach{(l, r) -> left.add(l.toInt()); right.add(r.toInt())}

    println(left.sorted().zip(right.sorted()).sumOf { (l,r) -> abs(l-r) })

}

fun readInput(fileName: String): String {
    return ClassLoader.getSystemResource(fileName).readText()
}