package com.week1

fun main () {
    val artists = arrayOf("a","b","c")
    println("Guess the artists")
    while (true) {
        val n = readlnOrNull()
        if (n in artists){
            return(println("Correct"))
        }
        else {
            println("Try Again")
        }
    }

}