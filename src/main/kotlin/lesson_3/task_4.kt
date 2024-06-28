package org.example.lesson_3

fun main() {
    var startPosition = "E2"
    var endPosition = "E4"
    var moveNumber = "1"
    var move = "[$startPosition - $endPosition; $moveNumber]"

    println(move)

    startPosition = "D2"
    endPosition = "D3"
    moveNumber = "3" //тк после хода белых был ход черных

    move = "[$startPosition - $endPosition; $moveNumber]"
    println(move)
}