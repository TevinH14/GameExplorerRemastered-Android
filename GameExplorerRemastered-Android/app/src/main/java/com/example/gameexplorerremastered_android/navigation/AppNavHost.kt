package com.example.gameexplorerremastered_android.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.gameexplorerremastered_android.features.Home.Views.HomeScreen
import com.example.gameexplorerremastered_android.features.settings.views.SettingsScreen


// NavHost manages all your screens and handles what shows on screen.
@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    topBarTitle: MutableState<String>
) {

    NavHost(
        navController = navController,
        startDestination = DrawerScreen.Home.route,
        modifier = modifier
    ) {
        // Home screen entry
        composable(DrawerScreen.Home.route) {
            HomeScreen(navController, topBarTitle)   // Pass navController down to children
        }

        // Settings screen entry
        composable(DrawerScreen.Settings.route) {
            SettingsScreen(navController, topBarTitle)
        }

//        // Profile screen entry
//        composable(Screen.Profile.route) {
//            ProfileScreen()
//        }
    }
}