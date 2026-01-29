package com.example.gameexplorerremastered_android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.gameexplorerremastered_android.Features.Settings.Views.SettingsScreen
import com.example.gameexplorerremastered_android.features.Home.Views.HomeScreen


// NavHost manages all your screens and handles what shows on screen.
@Composable
fun AppNavHost(navController: NavHostController, modifier: Modifier = Modifier) {

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,  // The default screen shown when app starts
        modifier = modifier
    ) {
        // Home screen entry
        composable(Screen.Home.route) {
            HomeScreen(navController)   // Pass navController down to children
        }

        // Settings screen entry
        composable(Screen.Settings.route) {
            SettingsScreen()
        }

//        // Profile screen entry
//        composable(Screen.Profile.route) {
//            ProfileScreen()
//        }
    }
}