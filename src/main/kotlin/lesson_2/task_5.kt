package org.example.lesson_2

import kotlin.math.pow

const val deposit = 70_000
const val percentage = 16.7
const val period = 20

fun main() {

    val totalSum = deposit * (1 + percentage / 100).pow(period)

    println("Размер вклада через 20 лет ${"%.3f".format(totalSum)}")

}