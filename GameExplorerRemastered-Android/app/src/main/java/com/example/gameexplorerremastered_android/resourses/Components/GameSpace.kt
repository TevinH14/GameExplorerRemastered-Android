package com.example.gameexplorerremastered_android.resourses.Components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun GameSpace(
    height: Int = 8,
    width: Int = 8
) {
    Spacer(modifier = Modifier
        .height(height.dp)
        .width(width.dp)
    )
}