package com.example.soread.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.soread.components.enterScreen.*

@Composable
fun EnterScreen(title: String) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EnterTitleText(title)
        EmailTextField(email = email, onValueChange = { email = it })
        PasswordTextField(password = password, onValueChange = { password = it })
        if (title == "Registration") {
            ConfirmPasswordFiled(
                confirmPassword = confirmPassword,
                onValueChange = { confirmPassword = it })
            RegistrationButton(email, password, confirmPassword)
        } else AuthenticationButton(email, password)
    }
}

@Preview(showBackground = true)
@Composable
fun EnterPreview() {
    EnterScreen("Test 2")
}