package com.aggregation
import com.student.Student
import com.student.Undergraduate
import com.student.Masters

class University {
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

    fun findStudentsByCourse(search: String): MutableList<Student> {
        val nameList = mutableListOf<Student>()
        for (s in students) {
            if (s.course == search) {
                nameList.add(s)
            }
        }
        return nameList
    }

    fun passingStudents() : List<Student> {

        val passList = students.filter { it.mark >= 40 }
        return passList
    }

}