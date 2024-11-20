package com.example.soread.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.soread.components.registration.*

@Composable
fun RegistrationScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RegistrationTitleText()
        EmailTextField(email = email, onValueChange = {email = it})
        PasswordTextField(password = password, onValueChange = {password = it})
        ConfirmPasswordFiled(confirmPassword = confirmPassword, onValueChange = {confirmPassword = it})
        RegistrationButton()

    }
}

@Preview(showBackground = true)
@Composable
fun RegPreview(){
    RegistrationScreen()
}