package com.cat

class Cat (nameIn: String, ageIn: Int, weightIn: Int) {

    // Properties (attributes)
    private val name: String = nameIn
    private var age: Int = ageIn
    private var weight: Int = weightIn

    fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    fun eat(amount: Int) {
        weight += amount
    }


    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}
