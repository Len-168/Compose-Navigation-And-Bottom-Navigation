package com.example.onlineshopping

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onlineshopping.config.NavigationRoutes
import com.example.onlineshopping.feature.DashBoardScreen
import com.example.onlineshopping.feature.LoginRoute.LoginScreen
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
internal fun MainAppRoute() {

    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = NavigationRoutes.LOGIN.routes) {
        composable(route = NavigationRoutes.DASHBOARD.routes) {
            DashBoardScreen(navHostController)
        }
        composable(route = NavigationRoutes.LOGIN.routes) { LoginScreen(navHostController) }
    }
}

