package org.example.lesson_1

fun main() {
    val totalSeconds: UShort = 6480U
    val seconds = (totalSeconds % 60U).toString().padStart(2, '0')
    val fullMinutes = totalSeconds / 60U
    val minutes = (fullMinutes % 60U).toString().padStart(2, '0')
    val hours = (fullMinutes / 60U).toString().padStart(2, '0')

    println("Гагарин провел в космосе $hours:$minutes:$seconds")
}