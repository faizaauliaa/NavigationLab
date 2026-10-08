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
fun AboutScreen(
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF2F7)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "About",
            color = Color(0xFFB86687)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Navigation Lab",
            color = Color(0xFFA85D7D)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Jetpack Compose Navigation",
            color = Color(0xFF967482)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onBack,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD995B2)
            )
        ) {
            Text(
                text = "Kembali",
                color = Color.White
            )
        }
    }
}