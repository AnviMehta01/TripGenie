package com.anvi.tripgenie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Luggage
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.anvi.tripgenie.ui.theme.TripGenieTheme
import androidx.compose.foundation.layout.padding
import com.anvi.tripgenie.ui.theme.HomeScreen
import com.anvi.tripgenie.ui.theme.WeatherScreen
import com.anvi.tripgenie.ui.theme.ExploreScreen
import com.anvi.tripgenie.ui.theme.PackingScreen
import com.anvi.tripgenie.ui.theme.MoreScreen
import com.anvi.tripgenie.ui.theme.DestinationDetailsScreen
import androidx.compose.material.icons.filled.Info

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TripGenieTheme {
                TripGenieApp()
            }
        }
    }
}

@Composable
fun TripGenieApp() {

    var selected by remember { mutableIntStateOf(0) }

    Scaffold(

        bottomBar = {

            NavigationBar {

                NavigationBarItem(
                    selected = selected == 0,
                    onClick = { selected = 0 },
                    icon = { Icon(Icons.Default.Home, null) },
                    label = { Text("Home") }
                )

                NavigationBarItem(
                    selected = selected == 1,
                    onClick = { selected = 1 },
                    icon = { Icon(Icons.Default.Cloud, null) },
                    label = { Text("Weather") }
                )

                NavigationBarItem(
                    selected = selected == 2,
                    onClick = { selected = 2 },
                    icon = { Icon(Icons.Default.Explore, null) },
                    label = { Text("Explore") }
                )

                NavigationBarItem(
                    selected = selected == 3,
                    onClick = { selected = 3 },
                    icon = { Icon(Icons.Default.Luggage, null) },
                    label = { Text("Packing") }
                )

                NavigationBarItem(
                    selected = selected == 4,
                    onClick = { selected = 4 },
                    icon = { Icon(Icons.Default.Person, null) },
                    label = { Text("More") }
                )

            }

        }

    ) { innerPadding ->

        androidx.compose.foundation.layout.Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            when (selected) {

                0 -> HomeScreen()

                1 -> WeatherScreen()

                2 -> ExploreScreen()

                3 -> PackingScreen()

                4 -> MoreScreen()

            }

        }
    }
}