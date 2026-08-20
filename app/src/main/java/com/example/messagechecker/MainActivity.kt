package com.example.messagechecker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.messagechecker.ui.Chat
import com.example.messagechecker.ui.CheatSheetApp
import com.example.messagechecker.ui.Details
import com.example.messagechecker.ui.WelcomeView
import com.example.messagechecker.ui.theme.MessageCheckerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MessageCheckerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = "welcome"
                    ) {
                        composable("welcome") { WelcomeView(navController) }
                        composable("chat") { Chat(navController) }
                        composable("details") { Details(navController) }
                        composable("playground") { CheatSheetApp(navController) }
                    }
                }
            }
        }
    }
}
