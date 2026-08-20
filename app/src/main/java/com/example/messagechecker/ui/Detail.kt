package com.example.messagechecker.ui

import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun Details(navController: NavController){
    Text("Details Screen")
    OutlinedButton(onClick = { navController.navigate("playground")}) {
        Text("Go to Details")
    }

}

//@Preview
//@Composable
//fun DetailsPreview(){
//    Details(navController = NavController)
//}