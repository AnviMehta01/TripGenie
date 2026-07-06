package com.anvi.tripgenie.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anvi.tripgenie.data.DestinationData
import com.anvi.tripgenie.data.SelectedDestination

@Composable
fun PackingScreen() {

    val destination = SelectedDestination.destination
        ?: DestinationData.destinations.first()

    val allItems = destination.packingItems

    val checked = remember(destination.name) {
        mutableStateListOf<Boolean>().apply {
            repeat(allItems.size) {
                add(false)
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "🎒 Smart Packing Checklist",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "📍 ${destination.name}, ${destination.country}",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {

            item {

                Text(
                    text = "🧳 Smart Travel Essentials",
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(8.dp))
            }

            items(allItems.size) { index ->

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = allItems[index],
                        modifier = Modifier.weight(1f)
                    )

                    Checkbox(
                        checked = checked[index],
                        onCheckedChange = {
                            checked[index] = it
                        }
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}