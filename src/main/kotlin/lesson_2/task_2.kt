package org.example.lesson_2

fun main() {
    val employeesQuantity = 50
    val employeesSalary = 30000
    val internsQuantity = 30
    val internsSalary = 20000
    val employeesPayroll = employeesQuantity * employeesSalary
    val totalPayroll = employeesPayroll + internsQuantity * internsSalary
    val averageSalary = totalPayroll / (employeesQuantity + internsQuantity)

    println("Расходы на выплату зарплаты постоянных сотрудников - $employeesPayroll")
    println("Общие расходы по ЗП после прихода стажеров - $totalPayroll")
    println("Среднюю ЗП одного сотрудника после устройства стажеров - $averageSalary")
}