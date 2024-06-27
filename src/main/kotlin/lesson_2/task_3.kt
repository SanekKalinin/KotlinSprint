package org.example.lesson_2

const val MINUTES_IN_HOURS = 60

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39
    val travelTotalMinutes = 457
    val travelHours = hourDeparture + travelTotalMinutes / MINUTES_IN_HOURS
    val travelMinutes = travelTotalMinutes % MINUTES_IN_HOURS
    val hourArrival = travelHours + (minuteDeparture + travelMinutes) / MINUTES_IN_HOURS
    val minuteArrival = (minuteDeparture + travelMinutes) % MINUTES_IN_HOURS

    println("Время прибытия ${"%02d:%02d".format(hourArrival, minuteArrival)}")
}