package com.cat

fun main( ) {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    println(binnie)
    println(clyde)
    println("-------")
    binnie.walk(1)
    clyde.walk(1)
    println(binnie)
    println(clyde)
    println("-------------")
    println(flathead)
    println(cupra)
    println("-------")
    flathead.eat(1)
    flathead.eat(1)
    println(flathead)
    cupra.walk(1)
    cupra.walk(1)
    cupra.walk(1)
    cupra.walk(1)
    println(cupra)
}