package com.example.last.neww

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        if (remember) {
            Text(
                text = "Welcome back, msingh7763@gmail.com ",
                fontSize = 24.sp
            )
        } else {
            Text(
                text = "Welcome!",
                fontSize = 24.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LastTheme {
    }
}