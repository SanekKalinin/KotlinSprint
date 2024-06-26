package org.example.lesson_2

const val crystalOre = 7
const val ironOre = 11
const val buff = 20

fun main() {

    println("Количество бонусной кристалической руды - ${buff * crystalOre / 100}")
    println("Количество бонусной железной руды - ${buff * ironOre / 100}")

}