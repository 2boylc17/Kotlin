package com.aggregation
import com.student.Student
import com.student.Undergraduate
import com.student.Masters

class University(val name: String) {
    private val students = mutableListOf<Student>()

    fun enrolStudent(s: Student) {
       students.add(s)
    }

    fun findStudentById(search: String): Student? {
        for (s in students) {
            if (s.id == search) {
                return s
            }
        }
        return null
    }

    fun findStudentsByName(search: String): MutableList<Student> {
        val nameList = mutableListOf<Student>()
        for (s in students) {
            if (s.name == search) {
                nameList.add(s)
            }
        }
        return nameList
    }

}