package org.day1

import kotlin.math.abs

fun main() {
//    val input = readInput("day1example.txt")
    val input = readInput("day1.txt")
    val left = mutableListOf<Int>()
    val right = mutableListOf<Int>()

    // Part 1 - find the sum of the differences between sorted values
    input
        .lines()
        .map { line -> line.split("\\s+".toRegex())}
        .forEach{(l, r) -> left.add(l.toInt()); right.add(r.toInt())}

    println(left.sorted().zip(right.sorted()).sumOf { (l,r) -> abs(l-r) })
    //my answer: 1258579   result: correct!

    // Part 2 - find the number of occurrences in the right column of each number of the left
    //            sum all the number of occurrences of each number by the value
    val occurrences = right.groupingBy { it }.eachCount()

    println(left.sumOf { l -> l * (occurrences[l] ?: 0)})
    //my answer: 23981443    result: correct!
}


fun readInput(fileName: String): String {
    return ClassLoader.getSystemResource(fileName).readText()
}