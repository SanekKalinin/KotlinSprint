package org.example.lesson_2

fun main() {
    val score1 = 3
    val score2 = 4
    val score3 = 3
    val score4 = 5
    val averageScore = (score1 + score2 + score3 + score4).toFloat() / 4

    println("Средний бал по классу ${"%.2f".format(averageScore)}")
}