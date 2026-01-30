package com.example.gameexplorerremastered_android.features.Home.Views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.gameexplorerremastered_android.features.games.viewModels.GamesViewModel
import com.example.gameexplorerremastered_android.features.games.views.gameCarouselViews.GameCarousel

@Composable
fun HomeScreen(navController: NavController) {

    // Retrieve the ViewModel scoped to the current navigation graph
    val viewModel: GamesViewModel = viewModel()

    // Convert LiveData to Compose State so UI updates auto-magically
    val games by viewModel.recentReleasedGames.observeAsState(emptyList())

    // Ensures fetchGames() runs *only once* when screen loads
    LaunchedEffect(Unit) {
        viewModel.fetchRecentReleasedGames()
    }

    // Main UI for Home Screen
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier.fillMaxSize()
    ) {

        // Custom carousel UI component
        GameCarousel(
            header = "games",
            gameList = games,

            // Pass navController so carousel can navigate to game detail screens
            navController = navController
        )
    }
}
    //todo: move to independent views only to fill and test app drawer


    @Composable
    fun ProfileScreen() {
        Surface { Text("👤 Profile Screen") }
    }