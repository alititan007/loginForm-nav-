package com.example.loginform2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.loginform2.ui.theme.LoginForm2Theme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginForm2Theme {
                // A surface container using the 'background' color from the theme

                    myNavigation()


            }
        }
    }


}

@Composable
fun myNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.Route ){
        composable(Home.Route){
            Home(navController)
        }
        composable(Second.Route){
            Second()
        }
    }

}


