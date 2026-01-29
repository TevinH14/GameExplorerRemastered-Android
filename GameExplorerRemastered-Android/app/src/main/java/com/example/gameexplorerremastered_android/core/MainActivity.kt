package com.example.gameexplorerremastered_android.core

import com.example.gameexplorerremastered_android.ui.theme.GameExplorerRemasteredAndroidTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.gameexplorerremastered_android.navigation.DrawerApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DrawerApp()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GameExplorerRemasteredAndroidTheme {
        DrawerApp()
    }
}