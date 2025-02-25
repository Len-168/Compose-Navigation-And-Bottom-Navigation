package com.example.onlineshopping.feature.LoginRoute

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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.onlineshopping.config.NavigationRoutes

@Composable
fun LoginScreen(navHostController: NavHostController, loginViewModel: LoginVM = viewModel()) {
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = {
                //navHostController.navigate(route = NavigationRoutes.DASHBOARD.routes)
                loginViewModel.Login("Len168")
            }) {
                Text(text = "LOGIN SCREEN", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
        }
    }
}