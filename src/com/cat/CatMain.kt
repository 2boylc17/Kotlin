package com.cat

fun main( ) {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)
    println("-------------")
    flathead.eat()
    flathead.eat()
    println(flathead)
    cupra.walk()
    cupra.walk()
    cupra.walk()
    cupra.walk()
    println(cupra)
}