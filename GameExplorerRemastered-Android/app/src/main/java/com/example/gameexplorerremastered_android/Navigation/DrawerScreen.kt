package com.example.gameexplorerremastered_android.navigation

// Sealed class ensures all routes are typed, discoverable, and impossible to mistype.
// Each screen becomes an object with a unique route string.
sealed class DrawerScreen(val route: String) {
    // Home screen route definition
    data object Home : DrawerScreen("home")

    // Settings screen route definition
    data object Settings : DrawerScreen("settings")

    // Profile screen route definition
    data object Profile : DrawerScreen("profile")
}