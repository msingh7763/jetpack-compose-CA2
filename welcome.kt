package com.example.last.neww

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.last.neww.ui.theme.LastTheme

class welcome : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LastTheme {

            }
        }
    }
}
@Composable
fun WelcomeScreen(remember: Boolean) {

    Box(
        modifier = Modifier
            .fillMaxSize().padding(15.dp)
            .background(Color.DarkGray),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = if (remember)
                "Welcome back, msingh7763@gmail.com"
            else
                "Welcome!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF1E88E5)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LastTheme {
    }
}