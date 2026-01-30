package com.example.gameexplorerremastered_android.resourses.Components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.gameexplorerremastered_android.resourses.Components.textComponent.GameFont
import com.example.gameexplorerremastered_android.resourses.Components.textComponent.GameText


@Composable
fun GameEndIconLabel(
    title: String,
    font: GameFont,
    endIcon: String,
    alignment: Alignment.Horizontal = Alignment.Start
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        GameText(
            text = title,
            font = font,
            alignment = alignment
        )
        Text(
            text = endIcon,
            style = font.textStyle(),
            color = font.color(),
            textAlign = TextAlign.End
        )
    }
}