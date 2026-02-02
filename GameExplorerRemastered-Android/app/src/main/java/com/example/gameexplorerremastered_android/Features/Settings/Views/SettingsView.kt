package com.example.gameexplorerremastered_android.features.settings.views

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.navigation.NavController

@Composable
fun SettingsScreen(navController: NavController, topBarTitle: MutableState<String>) {
    Surface {
        topBarTitle.value = "Settings"
        Text("⚙️ Settings Screen")
    }
}