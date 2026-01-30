package com.example.gameexplorerremastered_android.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DrawerApp() {

    // Controls whether drawer is open or closed
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    // Needed to open/close drawer since drawer operations are suspend functions
    val scope = rememberCoroutineScope()

    // Navigation graph controller
    val navController = rememberNavController()

    // Container that manages the drawer + main app content
    ModalNavigationDrawer(
        drawerState = drawerState,

        // Pass drawer content
        drawerContent = {
            DrawerContent(
                onDestinationClicked = { route ->

                    // Navigate to selected destination route
                    navController.navigate(route) {

                        // Ensures back stack doesn't grow unnecessarily
                        popUpTo(navController.graph.startDestinationId) { saveState = true }

                        // Avoid duplicate destinations
                        launchSingleTop = true

                        // Restores saved state when navigating back
                        restoreState = true
                    }

                    // Close drawer after navigating
                    scope.launch { drawerState.close() }
                }
            )
        }
    ) {

        // App top-level scaffold layout (toolbar + body)
        Scaffold(
            topBar = {

                // Top App Bar with menu icon
                TopAppBar(
                    title = { Text("Game Explorer") },
                    navigationIcon = {

                        // Icon that opens the drawer
                        IconButton(
                            onClick = {
                                scope.launch { drawerState.open() }
                            }
                        ) {
                            Icon(Icons.Default.Menu, contentDescription = "Menu")
                        }
                    }
                )
            }
        ) { innerPadding ->

            // Hosting our navigation graph here
            AppNavHost(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}