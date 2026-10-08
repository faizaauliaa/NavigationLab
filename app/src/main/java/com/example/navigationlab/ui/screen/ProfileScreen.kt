package com.example.navigationlab.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6F0FF)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Profile",
            color = Color(0xFF8065A8)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Anindhita Faiza Aulia",
            color = Color(0xFF6E5A8C)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Teknik Informatika",
            color = Color(0xFF7C6D8C)
        )

        Text(
            text = "FILKOM UB",
            color = Color(0xFF7C6D8C)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onBack,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFA78BCB)
            )
        ) {
            Text(
                text = "Kembali",
                color = Color.White
            )
        }
    }
}