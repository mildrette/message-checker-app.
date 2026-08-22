package com.example.messagechecker.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.navigation.NavController

@Composable
fun MessageChecker(navController: NavController){

    var textInput by remember {mutableStateOf(" ")}

    var savedMessage by remember { mutableStateOf<String?>(null)}


    Row(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)
        .background(Color.White)
    ){
        Column( modifier = Modifier
            .padding(20.dp)

        ){

            Text("Message Checker",
                modifier = Modifier.padding(16.dp),
                color = Color.Gray,
                fontSize = 25.sp

            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = textInput,
                onValueChange = {textInput = it},
                label = { Text("Enter Your Message Here")}
            )

            Spacer( modifier = Modifier.height(16.dp))

            Text("Character Left : ${characterLeft(textInput.length)}")
            if(isMessageTooLong(textInput.length)){
                Text("Message Too Long", color = Color.Red)
            }

            Spacer( modifier = Modifier.height(16.dp))

            Text("Saved: ${savedMessage ?: "No Message Saved Yet"}")

            Spacer( modifier = Modifier.height(16.dp))
            OutlinedButton(
                onClick = {savedMessage = textInput},
                modifier = Modifier
                    .padding(16.dp)) { Text("Save Message")
            }

            IconButton(onClick = { navController.popBackStack()})

            Divider(modifier = Modifier.padding(16.dp))

        }
    }
}

fun characterLeft(messageLength: Int): Int {
    return 160 - messageLength
}

fun isMessageTooLong(messageLength: Int) : Boolean{
    return messageLength > 160
}

//@Preview
//@Composable
//fun ViewPreview(){
//    MessageChecker()
//}

