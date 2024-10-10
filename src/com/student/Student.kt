package com.student

abstract class Student (idIn: String, nameIn: String, courseIn: String, markIn: Double) {
    val id: String = idIn
    val name: String = nameIn
    private val course: String = courseIn
    var mark: Double = 0.00
        set(newMark) {
            if (newMark <= 100 || newMark >= 0) {
                field = newMark
            }
        }
    init {
        mark = markIn
    }

    abstract fun getGrade(): String

    fun didPass(): Boolean {
        return if (mark >= 40) {
            true
        } else {
            false
        }
    }

    override fun toString(): String {
        return "$name is a student, they are on course $course and their mark is $mark"
    }

}

class Undergraduate(idIn : String, nameIn: String, courseIn: String, markIn: Double) : Student(idIn, nameIn, courseIn, markIn) {
    override fun getGrade(): String {
        return if (mark >= 70) {
            "First"
        } else if (mark >= 60.0 && mark < 70.0) {
            "2/1"
        } else if (mark >= 50.0 && mark < 60.0) {
            "2/2"
        } else if (mark >= 40.0 && mark < 50.0) {
            "Third"
        } else {
            "Fail"
        }
    }
}

class Masters(idIn : String, nameIn: String, courseIn: String, markIn: Double) : Student(idIn, nameIn, courseIn, markIn) {
    override fun getGrade(): String {
        return if (mark >= 70) {
            "Distinction"
        } else if (mark >= 60.0 && mark < 70.0) {
            "Merit"
        } else if (mark >= 40.0 && mark < 60.0) {
            "Pass"
        } else {
            "Fail"
        }
    }
}