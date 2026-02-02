package com.example.gameexplorerremastered_android.resourses.Components

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.gameexplorerremastered_android.resourses.Components.textComponent.GameFont
import com.example.gameexplorerremastered_android.resourses.Components.textComponent.GameText


@Composable
fun GameEndIconLabel(
    title: String,
    font: GameFont,
    endIcon: ImageVector? = null,
    alignment: Alignment.Horizontal = Alignment.Start,
    textWidth: Dp? = null
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.End,
        modifier = Modifier
            .padding(horizontal = 16.dp)
//            .fillMaxWidth()
    ) {
        GameText(
            text = title,
            font = font,
            alignment = alignment,
            modifier = Modifier
        )
        GameSpace(width = 16)
        if (endIcon != null) {
        Icon(
            imageVector = endIcon,
            contentDescription = "Right Arrow",
            tint = font.color(),
            modifier = Modifier
                .size(24.dp)
//                .padding(horizontal = 8.dp)
        )
        }
    }
}

// primary button preview
@Preview(showBackground = true)
@Composable
fun GameTextPreview() {
   GameEndIconLabel(
       title = "See All",
       font = GameFont.PrimaryButton,
       endIcon = Icons.Filled.ChevronRight,
       alignment = Alignment.End,
       textWidth = 100.dp
   )
}