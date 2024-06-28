package org.example.lesson_3

fun main() {
    val inputData = "D2-D4;0"
    val startPosition = inputData.split("-")[0]
    val endPosition = inputData.split("-")[1].split(";")[0]
    val moveNumber = inputData.split(";")[1]

    println("Откуда $startPosition")
    println("Куда $endPosition")
    println("Номер хода $moveNumber")
}