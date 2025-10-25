package com.example.gameexplorerremastered_android.Features.Home.Views

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    Surface {
        Text("🏠 Home Screen", style = MaterialTheme.typography.titleLarge)
    }

    //todo: move to independent views only to fill and test app drawer


    @Composable
    fun ProfileScreen() {
        Surface { Text("👤 Profile Screen") }
    }
}