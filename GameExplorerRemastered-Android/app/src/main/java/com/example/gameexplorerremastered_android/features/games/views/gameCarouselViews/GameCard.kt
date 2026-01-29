package com.example.gameexplorerremastered_android.features.games.views.gameCarouselViews

import androidx.compose.runtime.Composable
import com.example.gameexplorerremastered_android.features.games.model.Game
import com.example.gameexplorerremastered_android.resourses.Components.cardsComponents.DisplayCardView

@Composable
fun GameItemCard(game: Game) {
    DisplayCardView(
        imageUrl = game.backgroundImage ?: "",
        title = game.name ?: "",
    )
}