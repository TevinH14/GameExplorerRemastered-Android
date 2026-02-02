package com.example.gameexplorerremastered_android.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gameexplorerremastered_android.R
import com.example.gameexplorerremastered_android.ui.theme.GameExplorerRemasteredAndroidTheme

// Composable that renders the drawer menu items.
// The callback returns the route string when a destination is selected.
@Composable
fun DrawerContent(onDestinationClicked: (String) -> Unit) {
    // Material3 drawer sheet container

    ModalDrawerSheet {
        // Drawer Header Title
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(16.dp)
        )

        HorizontalDivider()

        // navigation items
        NavigationDrawerItem(
            label = { Text("Home") },
            selected = false,
            onClick = { onDestinationClicked(DrawerScreen.Home.route) }
        )
        NavigationDrawerItem(
            label = { Text("Settings") },
            selected = false,
            onClick = { onDestinationClicked(DrawerScreen.Settings.route) }
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