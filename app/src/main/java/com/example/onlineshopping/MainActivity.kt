package com.example.onlineshopping

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onlineshopping.config.NavigationRoutes
import com.example.onlineshopping.feature.DashBoardScreen
import com.example.onlineshopping.feature.HomeScreen
import com.example.onlineshopping.feature.LoginScreen
import com.example.onlineshopping.feature.NotificationScreen
import com.example.onlineshopping.feature.OrderScreen
import com.example.onlineshopping.feature.ProfileScreen
import com.example.onlineshopping.ui.theme.OnlineShoppingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OnlineShoppingTheme {
                MainAppRoute()
            }
        }
    }
}

@Composable
fun MainAppRoute() {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = NavigationRoutes.LOGIN.routes) {
        composable(route = NavigationRoutes.DASHBOARD.routes) { DashBoardScreen() }
        composable(route = NavigationRoutes.LOGIN.routes) { LoginScreen(navHostController) }
    }
}

