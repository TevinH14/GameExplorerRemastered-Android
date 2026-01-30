package com.example.gameexplorerremastered_android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun currentScreenTitle(navController: NavHostController): String {
    // Observe current back stack entry
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    return when (navBackStackEntry?.destination?.route) {
        DrawerScreen.Home.route -> "Home"
        DrawerScreen.Settings.route -> "Settings"
        DrawerScreen.Profile.route -> "Profile"
        else -> "Game Explorer" // Default title
    }
}