package com.example.gameexplorerremastered_android.resourses.Components.textComponent

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.material3.Text

@Composable
    fun GameText(
    text: String,
    font: GameFont,
    alignment: Alignment.Horizontal = Alignment.CenterHorizontally,
    width: Dp? = null
    ) {
        Box(
            modifier = Modifier
                .then(if (width != null) Modifier.width(width) else Modifier.fillMaxWidth()),
            contentAlignment = when (alignment) {
                Alignment.Start -> Alignment.CenterStart
                Alignment.End -> Alignment.CenterEnd
                else -> Alignment.Center
            }
        ) {
            Text(
                text = text,
                style = font.textStyle(),
                color = font.color(),
                textAlign = when (alignment) {
                    Alignment.Start -> TextAlign.Start
                    Alignment.End -> TextAlign.End
                    else -> TextAlign.Center
                }
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GameTextPreview() {
        GameText(
            text = "Upcoming Games",
            font = GameFont.Title
        )
    }