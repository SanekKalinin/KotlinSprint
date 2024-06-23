package org.example.lesson_1

fun main() {
    val length: ULong = 40_868_600_000U //–расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах;
    val age: UByte = 27U
    val partOfDay: Float = 0.075F
    val seconds: UShort = 6480U
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: UInt = 327000U

    println("расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах $length")
    println("возраст Гагарина на момент полета (целых лет) $age")
    println("какую часть дня Гагарин провел в космосе $partOfDay")
    println("количество секунд которое Гагарин провел в космосе $seconds")
    println("какую часть года Гагарин провел в космосе $partOfYear")
    println("апогей орбиты Гагарина в метрах $apogee")
}