package com.example.onlineshopping.config

import com.example.onlineshopping.R

sealed class BottomNavigationScreen(
    val screenName: String,
    val icons: Int,
    val routes: String,
) {
    data object Home : BottomNavigationScreen(
        screenName = "Home",
        icons = R.drawable.ic_home,
        routes ="Home",
    )
    data object Notification : BottomNavigationScreen(
        screenName = "Notification",
        icons = R.drawable.ic_notification,
        routes = "Notification",
    )
    data object Order : BottomNavigationScreen(
        screenName = "Order",
        icons = R.drawable.ic_receipt,
        routes = "Order",
    )
    data object Profile : BottomNavigationScreen(
        screenName = "Profile",
        icons = R.drawable.ic_profile,
        routes = "Profile",
    )
}