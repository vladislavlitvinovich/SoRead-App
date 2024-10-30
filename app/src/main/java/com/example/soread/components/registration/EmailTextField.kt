package com.example.soread.components.registration

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun EmailTextField(email: String, onValueChange: (String) -> Unit){
    OutlinedTextField(
        value = email,
        onValueChange = onValueChange,
        label = { Text("Email") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
    )
}