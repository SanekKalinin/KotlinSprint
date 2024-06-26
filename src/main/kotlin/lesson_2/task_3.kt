package org.example.lesson_2

const val hourDeparture = 9
const val minuteDeparture = 39
const val travelTotalMinutes = 457

fun main() {

    val travelHours = hourDeparture + travelTotalMinutes / 60
    val travelMinutes = travelTotalMinutes % 60
    val hourArrival = travelHours + (minuteDeparture + travelMinutes) / 60
    val minuteArrival = (minuteDeparture + travelMinutes) % 60

    println("Время прибытия ${"%02d:%02d".format(hourArrival, minuteArrival)}")
}