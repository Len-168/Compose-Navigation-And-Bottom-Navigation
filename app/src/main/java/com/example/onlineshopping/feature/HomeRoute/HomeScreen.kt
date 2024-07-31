package com.example.onlineshopping.feature.HomeRoute

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.onlineshopping.config.NavigationRoutes
import kotlin.random.Random

@Composable
fun HomeScreen(navHostController: NavHostController,) {
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = {
                val xx = Random.nextInt(from = 1, until = 10)
                if(xx % 2 == 0){
                    navHostController.navigate(route = NavigationRoutes.LOGIN.routes){
                        popUpTo(navHostController.graph.startDestinationRoute!!){

                        }
                    }
                }
                Log.d("Message",xx.toString())
            }) {

            }

            Text(text = "HOME SCREEN", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        }
    }
}