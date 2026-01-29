package com.example.gameexplorerremastered_android.resourses.Components

import androidx.compose.runtime.Composable
import com.example.gameexplorerremastered_android.features.games.model.Game
import com.example.gameexplorerremastered_android.resourses.Components.cardsComponents.DisplayCardView

@Composable
fun GameItem(gameItem: Game?) {
    if (gameItem != null) {
        DisplayCardView(
            imageUrl = gameItem.backgroundImage ?: "",
            title = gameItem.name ?: ""
        )
    }
}