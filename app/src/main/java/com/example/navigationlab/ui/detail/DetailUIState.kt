package com.example.navigationlab.ui.detail

import com.example.navigationlab.data.model.Student

data class DetailUIState(
    val student: Student? = null,
    val isLoading: Boolean = false,
    val errorMsg: String? = null
)