package com.example.gameexplorerremastered_android.Navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameexplorerremastered_android.ui.theme.GameExplorerRemasteredAndroidTheme


@Composable
fun DrawerContent(onDestinationClicked: (String) -> Unit) {
    ModalDrawerSheet {
        Text(
            text = "Menu",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(16.dp)
        )
        Divider()
        NavigationDrawerItem(
            label = { Text("Home") },
            selected = false,
            onClick = { onDestinationClicked("home") }
        )
        NavigationDrawerItem(
            label = { Text("Settings") },
            selected = false,
            onClick = { onDestinationClicked("settings") }
        )
        NavigationDrawerItem(
            label = { Text("Profile") },
            selected = false,
            onClick = { onDestinationClicked("profile") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DrawerContentPreview() {
    GameExplorerRemasteredAndroidTheme {
        DrawerContent(
            onDestinationClicked = {}
        )
    }
}