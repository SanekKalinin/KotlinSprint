package org.example.lesson_1

fun main() {
    var quantityOfOrders: Int = 75
    var quantityOfEmployees: Int = 2000
    val notificationThanks: String = "Благодарим Вас за заказ"
    println("Кол-во заказов $quantityOfOrders, благодарность $notificationThanks")
    //println("Кол-во работников: $quantityOfEmployees")
    quantityOfEmployees = 1999
    println("Кол-во работников: $quantityOfEmployees")
}