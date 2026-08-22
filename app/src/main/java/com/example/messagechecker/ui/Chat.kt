package com.example.messagechecker.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.messagechecker.ui.component.IconButton
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Chat(
//    navController: NavController
) {
    var textInput by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(20.dp)
            .fillMaxSize()
    ) {

        Text("Chat Screen")

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = textInput,
            onValueChange = { textInput = it },
            label = { Text("enter your message here") }

        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
        ) {

            Button(onClick = {
//            navController.navigate("details")
            }) {
                Text("Send")
            }

            Spacer(modifier = Modifier.padding(10.dp))

            IconButton(onClick = {
//            navController.popBackStack()
            })

        }
    }
}

@Preview
@Composable
fun ChatPreview(){
    Chat(
//        navController = NavController
    )
}