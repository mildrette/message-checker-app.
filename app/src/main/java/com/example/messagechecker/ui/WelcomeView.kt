package com.example.messagechecker.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeView(){

    Row(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.LightGray))
        {

        Column(modifier = Modifier.fillMaxWidth()){

            Spacer(modifier = Modifier.height(30.dp))
            Text("Welcome to My Test Chat",
                color = Color. DarkGray,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(20.dp)
                )

            Spacer(modifier = Modifier.height(30.dp))

            OutlinedButton(
                onClick = {},
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.Yellow)
            ) {
Text("Compose Massage")


            }

//            learning naviagation
        }
    }
}


@Preview
@Composable
fun WelcomeViewPreview(){
    WelcomeView()
}