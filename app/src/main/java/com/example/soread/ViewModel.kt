package com.example.soread

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
/*import com.example.soread.components.webSocket.ChatWebSocketListener
import com.example.soread.components.webSocket.WebSocketClient*/
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ChatViewModel : ViewModel() {

    /*private val _messages = MutableStateFlow<List<String>>(emptyList())
    val messages: StateFlow<List<String>> = _messages

    private val webSocketClient = WebSocketClient("ws://your-websocket-url", ChatWebSocketListener { message ->
        viewModelScope.launch {
            _messages.value = _messages.value + message
        }
    })

    fun sendMessage(message: String) {
        webSocketClient.sendMessage(message)
    }

    fun start() {
        webSocketClient.start()
    }

    fun close() {
        webSocketClient.close()
    }*/
}