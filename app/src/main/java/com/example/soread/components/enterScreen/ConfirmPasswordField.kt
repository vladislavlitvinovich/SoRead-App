package com.example.soread.components.enterScreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun ConfirmPasswordFiled(confirmPassword: String, onValueChange: (String) -> Unit){
    OutlinedTextField(
        value = confirmPassword,
        onValueChange = onValueChange,
        label = { Text("Confirm Password") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}
