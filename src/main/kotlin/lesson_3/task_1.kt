package org.example.lesson_3

fun main() {
    val dayGreeting = "день, "
    val eveningGreeting = "вечер, "
    val userName = "мр. Симпсон"
    var greeting: String

    greeting = dayGreeting + userName
    println("Добрый $greeting")

    greeting = eveningGreeting + userName
    println("Добрый $greeting")
}