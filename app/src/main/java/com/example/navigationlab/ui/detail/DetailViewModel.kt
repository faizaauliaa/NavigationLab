package com.example.navigationlab.ui.detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.navigationlab.data.repository.StudentRepository

class DetailViewModel(
    private val repository: StudentRepository
) : ViewModel() {

    var uiState by mutableStateOf(DetailUIState())
        private set

    fun loadStudent(id: Int) {
        val student = repository.getStudentById(id)

        uiState = if (student != null) {
            DetailUIState(student = student)
        } else {
            DetailUIState(
                errorMsg = "Mahasiswa dengan ID $id tidak ditemukan."
            )
        }
    }

    companion object {
        fun factory(
            repository: StudentRepository
        ): ViewModelProvider.Factory =
            object : ViewModelProvider.Factory {

                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(
                    modelClass: Class<T>
                ): T {
                    return DetailViewModel(repository) as T
                }
            }
    }
}