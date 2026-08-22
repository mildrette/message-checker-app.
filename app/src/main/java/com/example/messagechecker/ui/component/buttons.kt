package com.example.messagechecker.ui.component

import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.FloatingActionButton
import androidx.compose.ui.tooling.preview.Preview




@Composable
fun IconButton(onClick: () -> Unit){
    FloatingActionButton(
        onClick = onClick
    ){
        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
    }
}


@Preview
@Composable
fun IconButtonPreview(){
    IconButton(
        onClick = {}
    )
}
