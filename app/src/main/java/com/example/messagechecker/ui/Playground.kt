package com.example.messagechecker.ui

import android.R.attr.description
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun PlayGround(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(16.dp))
    {
var day by  remember { mutableStateOf("Hello world and work" )}
        var textinput by remember { mutableStateOf("")}

        Text(
            day,
            textAlign = TextAlign.Center,
            fontSize = 30.sp
        )

        OutlinedTextField(
            value = textinput,
            onValueChange = { textinput = it },
            label = {Text("write here")}
        )

        }
}

@Preview
@Composable
fun PlayGroundPreview(){
    PlayGround()
}