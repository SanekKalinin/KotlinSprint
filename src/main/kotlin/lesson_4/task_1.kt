package org.example.lesson_4

const val TABLE_QUANTITY = 13

fun main() {
    val reservedForToday = 13
    val reservedForTomorrow = 9

    println("Доступность столиков на сегодня: ${reservedForToday < TABLE_QUANTITY},\n Доступность столиков на завтра: ${reservedForTomorrow < TABLE_QUANTITY}")
}