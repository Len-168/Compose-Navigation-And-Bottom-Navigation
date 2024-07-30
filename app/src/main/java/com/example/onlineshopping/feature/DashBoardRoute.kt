package com.example.onlineshopping.feature

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.navigationBarsPadding
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.BottomNavigation
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.onlineshopping.MainAppRoute
import com.example.onlineshopping.config.BottomNavigationScreen
import com.example.onlineshopping.config.NavigationRoutes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
//                  rootNav from Main App
fun DashBoardScreen(rootNavController:NavHostController) {

    val navHostController = rememberNavController()

    Scaffold(
        modifier = Modifier.navigationBarsPadding(),
        bottomBar = {
            val navBackStackEntry by navHostController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination

            val screenList = listOf(
                BottomNavigationScreen.Home,
                BottomNavigationScreen.Notification,
                BottomNavigationScreen.Order,
                BottomNavigationScreen.Profile,
            )
            BottomNavigation(backgroundColor = Color.White, elevation = 0.dp) {
                screenList.forEach { indexScreen ->
                    NavigationBarItem(
                        selected = currentDestination?.route == indexScreen.routes,
                        onClick = { navHostController.navigate(indexScreen.routes) },
                        icon = {
                            Icon(painter = painterResource(id = indexScreen.icons), contentDescription = "")
                        }
                    )
                }
            }
        },
        contentColor = Color.White,
        containerColor = Color.White
    ) {
        NavHost(
            navController = navHostController, startDestination = BottomNavigationScreen.Home.routes,
        ) {
            composable(route = BottomNavigationScreen.Home.routes) { HomeScreen(rootNavController) }

            composable(route = BottomNavigationScreen.Notification.routes) { NotificationScreen() }
            composable(route = BottomNavigationScreen.Order.routes) { OrderScreen() }
            composable(route = BottomNavigationScreen.Profile.routes) { ProfileScreen() }
        }
    }
}
