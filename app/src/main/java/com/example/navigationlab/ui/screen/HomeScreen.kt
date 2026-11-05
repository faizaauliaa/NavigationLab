package com.example.navigationlab.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.navigationlab.data.model.Student
import com.example.navigationlab.ui.home.HomeUiState

@Composable
fun HomeScreen(
    uiState: HomeUiState,
    onStudentClick: (Int) -> Unit,
    onOpenProfile: () -> Unit,
    onOpenAbout: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEAF6FF))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "Daftar Mahasiswa",
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF4F7899)
        )

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(
                items = uiState.students,
                key = { student -> student.id }
            ) { student ->
                StudentItem(
                    student = student,
                    onClick = {
                        onStudentClick(student.id)
                    }
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                modifier = Modifier.weight(1f),
                onClick = onOpenProfile,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA78BCB)
                )
            ) {
                Text("Buka Profile")
            }

            Button(
                modifier = Modifier.weight(1f),
                onClick = onOpenAbout,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFD99AB6)
                )
            ) {
                Text("Buka About")
            }
        }
    }
}

@Composable
private fun StudentItem(
    student: Student,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF5FBFF))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "ID: ${student.id}",
                style = MaterialTheme.typography.titleMedium,
                color = Color(0xFF4F7899)
            )

            Text(
                text = student.name,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}