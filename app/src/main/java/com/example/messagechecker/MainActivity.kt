package com.example.messagechecker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.messagechecker.ui.PlayGround
import com.example.messagechecker.ui.WelcomeView
import com.example.messagechecker.ui.theme.MessageCheckerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MessageCheckerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    WelcomeView()

                    PlayGround()
                }
            }
        }
    }
}
