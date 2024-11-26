package com.example.soread.components.enterScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AuthenticationButton(email: String, password: String) {
    Button(
        onClick = {
            // TODO
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Register")
    }
}