package org.example.lesson_2

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39
    val travelTotalMinutes = 457
    val travelHours = hourDeparture + travelTotalMinutes/60
    val travelMinutes = travelTotalMinutes%60
    var hourArrival:Int = 0
    var minuteArrival:Int = 0

    If ( (minuteDeparture + travelMinutes) >= 60) {
        hourArrival = travelHours + 1
        minuteArrival = (minuteDeparture +  travelMinutes) - 60
    }
    else {
        hourArrival = travelHours
        minuteArrival = minuteDeparture +  travelMinutes
    }

    println("Время прибытия ${"%02d".format(hourArrival)} : ${"%02d".format(minuteArrival)} ")
}