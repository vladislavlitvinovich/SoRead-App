package com.example.soread.components.webSocket

import okhttp3.*
import java.util.concurrent.TimeUnit

class WebSocketClient(private val url: String, private val listener: ChatWebSocketListener) {

    private val client = OkHttpClient.Builder()
        .readTimeout(10, TimeUnit.SECONDS)
        .build()

    private var webSocket: WebSocket? = null

    fun start() {
        val request = Request.Builder().url(url).build()
        webSocket = client.newWebSocket(request, listener)
    }

    fun sendMessage(message: String) {
        webSocket?.send(message)
    }

    fun close() {
        webSocket?.close(1000, "Closing socket")
    }
}
