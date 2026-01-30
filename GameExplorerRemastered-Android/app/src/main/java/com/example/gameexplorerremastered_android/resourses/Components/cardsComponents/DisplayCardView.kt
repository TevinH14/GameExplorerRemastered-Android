package com.example.gameexplorerremastered_android.resourses.Components.cardsComponents

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gameexplorerremastered_android.resourses.Components.GameSpace
import com.example.gameexplorerremastered_android.resourses.Components.imagesComponents.DisplayImage
import com.example.gameexplorerremastered_android.resourses.Components.textComponent.GameFont
import com.example.gameexplorerremastered_android.resourses.Components.textComponent.GameText

@Composable
fun DisplayCardView(
    imageUrl: String,
    title: String
) {
    Column(
        modifier = Modifier
            .width(IntrinsicSize.Max)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Card for image
        Box(
            modifier = Modifier
                .height(140.dp)
                .fillMaxWidth()
        ) {
            DisplayImage(url = imageUrl)
        }

        GameSpace(height = 24)

        // Title text
        GameText(
            text = title,
            font = GameFont.KeyTitle,
            alignment = Alignment.Start
        )
    }
}