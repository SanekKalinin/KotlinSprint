package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val deposit = 70_000
    val percentage = 16.7
    val period = 20
    val totalSum = deposit * (1 + percentage / 100).pow(period)

    println("Размер вклада через 20 лет ${"%.3f".format(totalSum)}")

}