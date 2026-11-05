package com.example.navigationlab.data.repository

import com.example.navigationlab.data.model.Student
import com.example.navigationlab.data.source.StudentLocalDataSource

interface StudentRepository {
    fun getStudents(): List<Student>
    fun getStudentById(id: Int): Student?
}

class DefaultStudentRepository(
    private val dataSource: StudentLocalDataSource
) : StudentRepository {

    override fun getStudents(): List<Student> {
        return dataSource.getStudents()
    }

    override fun getStudentById(id: Int): Student? {
        return dataSource.getStudentById(id)
    }
}