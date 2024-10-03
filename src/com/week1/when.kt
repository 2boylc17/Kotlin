package com.week1

fun main () {
    println("What is your grade?")
    when (val n = readlnOrNull()) {
        "A" -> println("First")
        "B" -> println("2.1")
        "C" -> println("2.2")
        "D" -> println("Third")
        "F" -> {
            println("Fail")
            println("Please resit in the summer.")
        }
        else -> println("Invalid grade $n.")
    }
}