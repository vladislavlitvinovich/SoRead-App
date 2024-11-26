package com.example.soread.components.enterScreen

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


@Composable
fun RegistrationButton(email: String, password: String, confirmPassword: String, context: Context) {
    var auth: FirebaseAuth = Firebase.auth
    Button(
        onClick = {
            if (password == confirmPassword) {

            } else {
                Toast.makeText(context, "Введённые пароли не совпадают", Toast.LENGTH_SHORT).show()
            }
            // TODO
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Register")
    }
}