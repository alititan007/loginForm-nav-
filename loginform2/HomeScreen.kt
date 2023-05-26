package com.example.loginform2

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Home(navController:NavController) {
    Row(
        horizontalArrangement = Arrangement.Center ,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    )
    {


        Column(
        ) {

            Greeting(name = "Login Form")
            FormList(navController)
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name!", fontSize = 50.sp , color = Color.Black , modifier = Modifier.padding(30.dp)

    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormList(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var Password by remember { mutableStateOf("") }
    val context = LocalContext.current


    Column (
        modifier = Modifier.background(Color.Transparent)

    ) {

        Text(text = "Enter Your Name :" , color = Color.Gray , fontSize = 20.sp)
        TextField(
            value = name,
            modifier = Modifier.padding(30.dp),
            onValueChange = { value -> name = value }
        )
        Text(text = "Enter Your Password :" , color = Color.Gray , fontSize = 20.sp)

        TextField(
            value = Password,
            modifier = Modifier.padding(30.dp),
            onValueChange = { value -> Password = value },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        )
        Button(
            modifier = Modifier.padding(30.dp),
            onClick = {
                if (name == "ali" && Password == "titan"){

                    Toast.makeText(context, "ok" , Toast.LENGTH_SHORT).show()

                    navController.navigate(Second.Route)
                }
                else{
                    Toast.makeText(context, "test agan" , Toast.LENGTH_SHORT).show()
                }
            } ) {
            Text( modifier = Modifier.padding(horizontal = 15.dp),
                text = "send", fontSize = 25.sp , color = Color.White  ,

                )
        }
    }
}
@Composable
fun Alarm() {
    val context = LocalContext.current
    Toast.makeText(context, "hi " , Toast.LENGTH_SHORT).show()

}