package com.example.messagechecker.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun Chat(navController: NavController){

    Row(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.LightGray))
    {
        Text("Chat Screen")

        Button(onClick = {navController.navigate("details")}){
            Text("Send")
        }
    }
    }

//@Preview
//@Composable
//fun ChatPreview(){
//    Chat( navController = NavController )
//}