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
fun RegistrationButton(email: String, password: String, confirmPassword: String) {
    /*val auth: FirebaseAuth = Firebase.auth*/

    /*Button(
        onClick = {
            if (password == confirmPassword) {
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener { *//*task ->
                        if (task.isSuccessful) {
                            Toast.makeText(context, "Регистрация успешна", Toast.LENGTH_SHORT)
                                .show()
                        } else {
                            Toast.makeText(
                                context,
                                "Ошибка регистрации: ${task.exception?.message}",
                                Toast.LENGTH_SHORT
                            ).show()
                        }*//*
                    }
            } else {
                Toast.makeText(context, "Введённые пароли не совпадают", Toast.LENGTH_SHORT).show()
            }
        },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text("Register")
    }*/
}