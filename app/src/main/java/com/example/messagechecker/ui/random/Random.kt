package com.example.messagechecker.ui.random

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.ui.unit.sp

@Composable
fun Random(){
    val greetings = "Hello Mildred"
    Column(modifier = Modifier.fillMaxSize().background(Color.LightGray).padding(40.dp)) {
        Text(greetings)
        Text(" I am learning JetPack Compose")
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {}){
            Text("Click Here")
        }

        Spacer(modifier = Modifier.padding(10.dp))
//        i showed up

        Row{
            Text("Apple")
            Spacer(modifier = Modifier.weight(16.dp))
            Text("Bananas")
            Spacer(modifier = Modifier.padding(10.dp))
            Text("Pears")
        }
    }
}

@Preview
@Composable
fun RandomPreview(){
    Random()
}