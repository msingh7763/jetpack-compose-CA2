package com.example.last.neww

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.last.neww.ui.theme.LastTheme

class NavGraph : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LastTheme {
                val navController = rememberNavController()
                AppNavGraph(navController)

            }
        }
    }
}

@Composable
fun AppNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("Login") {
            LoginScreen(navController)
        }

        composable(
            route = "welcome/{remember}",
            arguments = listOf(
                navArgument("remember") {
                    type = NavType.BoolType
                }
            )
        ) { backStackEntry ->

            val remember =
                backStackEntry.arguments?.getBoolean("remember") ?: false

            WelcomeScreen(remember)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    LastTheme {
    }
}