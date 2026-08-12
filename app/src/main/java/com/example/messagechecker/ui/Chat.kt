package com.example.messagechecker.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Chat(){

    Row(modifier = Modifier
        .fillMaxSize()
        .fillMaxWidth()
        .fillMaxHeight()
        .background(Color.LightGray))
    {
    }

    }

@Preview
@Composable
fun ChatPreview(){
    Chat()
}