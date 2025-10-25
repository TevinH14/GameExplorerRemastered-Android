package com.example.gameexplorerremastered_android.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.gameexplorerremastered_android.Features.Home.Views.*
import com.example.gameexplorerremastered_android.Features.Settings.Views.SettingsScreen

@Composable
fun AppNavGraph(_navController: NavHostController, _modifier: Modifier = Modifier) {
    NavHost(navController = _navController, startDestination = "home", modifier = _modifier ) {
        composable("home") { HomeScreen() }
        composable("SettingsScreen") { SettingsScreen()  }
    }
}