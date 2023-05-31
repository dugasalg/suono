package com.example.suono.ui.theme

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home")
    object Search : NavRoutes("help")
    object Store : NavRoutes("store")
    object Cart : NavRoutes("cart")
    object Menu : NavRoutes("menu")
}