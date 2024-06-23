package org.example.lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7
    println("Год полета: $year")
    //нужно по идее выводить String.format("%02d", hour) на случай ноль впереди, но в задании не указано
    println("Вылет: 0$hour часов")
    // либо minute.toString().padStart(2, '0')
    println("0$minute минут")
    hour = 10
    minute = 55
    println("Посадка в $hour:$minute")
}