package com.example.gameexplorerremastered_android.features.games.views.gameCarouselViews

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.gameexplorerremastered_android.features.games.model.Game
import com.example.gameexplorerremastered_android.resourses.Components.GameSpace
import com.example.gameexplorerremastered_android.resourses.Components.textComponent.GameFont
import com.example.gameexplorerremastered_android.resourses.Components.textComponent.GameText


@Composable
fun GameCarousel(
    header: String,
    gameList: List<Game>,
    navController: NavController
) {
    //stack views on top of each other
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {

        // Top space
        GameSpace(height = 24)

        //header text view
        GameText(
            text = header,
            font = GameFont.Title,
            alignment = Alignment.Start
        )

        //space to separate header and list
        GameSpace(height = 16)

        // Horizontal list of cards to display games
        Row(
            modifier = Modifier
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            gameList.forEach { gameItem ->
                GameItemCard(game = gameItem)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GameCarouselPreview() {
    val navController = rememberNavController()
    GameCarousel(
        header = "Trending",
        gameList = listOf(
            Game.preview(),
            Game.preview()
        ),
        navController = navController
    )
}