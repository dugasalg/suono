package com.example.suono.ui.theme

import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*

object NavBarItems {
    val BarItems = listOf(
        BarItem(
            title = "Home",
            image = Icons.Filled.Home,
            route = "home"
        ),
        BarItem(
            title = "Help",
            image = Icons.Filled.Search,
            route = "help"
        ),
        BarItem(
            title = "Store",
            image = Icons.Filled.Face,
            route = "store"
        ),
        BarItem(
            title = "Cart",
            image = Icons.Filled.ShoppingCart,
            route = "cart"
        ),
        BarItem(
            title = "Menu",
            image = Icons.Filled.Menu,
            route = "menu"
        )

    )
}