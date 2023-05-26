package com.example.loginform2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Second() {
    Column(modifier = Modifier.fillMaxSize()  , verticalArrangement = Arrangement.Center  , horizontalAlignment = Alignment.CenterHorizontally) {
       Text(modifier = Modifier.fillMaxWidth() , textAlign = TextAlign.Center, text = "welcome to my app ")
    }
}