package com.example.messagechecker.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Chat() {
    var textInput by remember {
        mutableStateOf("")
    }

    val artist = Artist(
        name = "Taylor Swift",
        lastSeenOnline = "Online 5 minutes ago"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp)
    ) {

        Text("Chat Screen")

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        TextField(
            value = textInput,
            onValueChange = {
                textInput = it
            },
            label = {
                Text("Enter your message here")
            }
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        ArtistCardRow(
            artist = artist
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Button(
                onClick = {
                }
            ) {
                Text("Send")
            }

            Spacer(
                modifier = Modifier.width(10.dp)
            )

            IconButton(
                onClick = {
                }
            ) {
                Text("Back ")
            }
        }
    }
}


@Composable
fun ArtistCardRow(artist: Artist) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = artist.name
            )

            Text(
                text = artist.lastSeenOnline
            )
        }
    }
}


data class Artist(
    val name: String,
    val lastSeenOnline: String
)


@Preview(showBackground = true)
@Composable
fun ChatPreview() {
    Chat()
}