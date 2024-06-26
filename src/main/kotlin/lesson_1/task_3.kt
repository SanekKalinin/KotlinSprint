package org.example.lesson_1

fun main() {
    val year: String = "1961"
    var hour: String = "09"
    var minute: String = "07"
    println("Год полета: $year")
    println("Вылет: $hour часов")
    println("$minute минут")
    hour = "10"
    minute = "55"
    println("Посадка в $hour:$minute")
}