package com.example.navigationlab.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
    onOpenDetail: (Long) -> Unit,
    onOpenProfile: () -> Unit,
    onOpenAbout: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEAF6FF)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home",
            color = Color(0xFF4F7899)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                onOpenDetail(245150201111042L)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF7DB7D9)
            )
        ) {
            Text(
                text = "Buka Detail",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(
            onClick = onOpenProfile
        ) {
            Text(
                text = "Buka Profile",
                color = Color(0xFF8B72B8)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onOpenAbout,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD99AB6)
            )
        ) {
            Text(
                text = "Buka About",
                color = Color.White
            )
        }
    }
}