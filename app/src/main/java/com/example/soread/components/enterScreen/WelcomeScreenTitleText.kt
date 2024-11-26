package com.example.soread.components.enterScreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EnterTitleText(text: String){
    Text(
        text = text,
        fontSize = 24.sp,
        modifier = Modifier.padding(bottom = 16.dp)
    )
}