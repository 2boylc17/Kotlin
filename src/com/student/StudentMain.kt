package com.student

fun main() {
    println("What is the Student's mark?")
    val studentName = readln()
    val newStudent1 = Undergraduate("0","Student1","Course",studentName.toDouble())
    println("Mark = ${newStudent1.mark} \n Grade = ${newStudent1.getGrade()} \n " +
            "Passed = ${newStudent1.didPass()}")
    val studentList = mutableListOf<Undergraduate>()
    for (n in 1..5) {
        println("What is the Student's name?")
        val name : String = readlnOrNull().toString()
        println("What is the Student's course?")
        val course : String = readlnOrNull().toString()
        println("What is the Student's mark?")
        val mark : Double = readlnOrNull()?.toDouble()!!
        val new = Undergraduate(n.toString(),name,course,mark)
        studentList.add(new)
    }
    for (s in studentList) {
        println(s)
    }

}