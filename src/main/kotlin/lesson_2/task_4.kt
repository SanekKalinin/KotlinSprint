package org.example.lesson_2

const val BUFF = 20

fun main() {
    val crystalOre = 7
    val ironOre = 11

    println("Количество бонусной кристалической руды - ${BUFF * crystalOre / 100}")
    println("Количество бонусной железной руды - ${BUFF * ironOre / 100}")
}