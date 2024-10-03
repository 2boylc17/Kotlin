package com.cat

class Cat (nameIn: String, ageIn: Int, weightIn: Int) {

    // Properties (attributes)
    private val name: String = nameIn
    private var age: Int = ageIn
    private var weight: Int = weightIn

    fun walk() {
        weight--
    }

    fun eat() {
        weight ++
    }


    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
