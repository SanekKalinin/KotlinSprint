package org.example.lesson_1

fun main() {
    val totalSeconds: Short = 6480
    val seconds = totalSeconds % 60
    val fullMinutes = totalSeconds / 60
    val minutes = fullMinutes % 60
    val hours = fullMinutes / 60

    println("Гагарин провел в космосе ${String.format("%02d", hours)}:${String.format("%02d", minutes)}:${String.format("%02d", seconds)}")
}