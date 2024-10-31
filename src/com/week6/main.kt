package com.week6

fun main() {
    val string = mutableListOf<String>()
    println("Input 5 Strings")
    for (n in 1..5) {
        string.add(readln())
    }
    val newString = mutableListOf<String>()
    val filter = string.filter { it != "" }
        .forEach { newString.add(it)  }
    println("-------------")
    println(newString)
}

