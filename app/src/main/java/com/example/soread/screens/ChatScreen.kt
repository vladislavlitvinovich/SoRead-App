package com.example.soread.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.soread.ChatViewModel
import com.example.soread.ui.theme.SoReadTheme


/*class MainActivity : ComponentActivity() {

    private val chatViewModel: ChatViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatScreen(chatViewModel)
        }
        chatViewModel.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        chatViewModel.close()
    }
}

@Composable
fun ChatScreen(chatViewModel: ChatViewModel) {
    val messages by chatViewModel.messages.collectAsState()
    var input by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.weight(1f)) {
            items(messages) { message ->
                Text(text = message, modifier = Modifier.padding(8.dp))
            }
        }
        Row(modifier = Modifier.padding(8.dp)) {
            TextField(
                value = input,
                onValueChange = { input = it },
                modifier = Modifier.weight(1f)
            )
            Button(onClick = {
                chatViewModel.sendMessage(input)
                input = ""
            }) {
                Text("Send")
            }
        }
    }
}*/

/*
@Preview(showBackground = true)
@Composable
fun TestPreview() {
    SoReadTheme {
        ChatScreen()
    }
}*/
