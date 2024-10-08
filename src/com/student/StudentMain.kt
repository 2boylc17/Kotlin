package com.student

fun main() {
    println("What is the Student's mark?")
    val studentName = readln()
    val newStudent1 = Undergraduate("1","Student","Course",studentName.toDouble())
    println("Mark = ${newStudent1.mark} \n Grade = ${newStudent1.getGrade()} \n " +
            "Passed = ${newStudent1.didPass()}")
}