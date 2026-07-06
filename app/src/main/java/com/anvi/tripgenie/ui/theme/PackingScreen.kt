package com.anvi.tripgenie.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anvi.tripgenie.data.DestinationData
import com.anvi.tripgenie.data.SelectedDestination

@Composable
fun PackingScreen() {

    val destination = SelectedDestination.destination
        ?: DestinationData.destinations.first()

    val travelEssentials = listOf(
        "🛂 Passport / ID",
        "🎫 Tickets",
        "💳 Wallet",
        "📱 Phone",
        "🔌 Charger",
        "💊 Medicines",
        "💧 Water Bottle"
    )

    val destinationEssentials = when (destination.category) {

        "🏖 Beach Escapes" -> listOf(
            "👙 Swimwear",
            "🩴 Flip-flops",
            "🕶 Sunglasses",
            "🧴 Sunscreen",
            "🏖 Beach Towel"
        )

        "🏔 Mountain Escapes" -> listOf(
            "🧥 Warm Jacket",
            "🧣 Scarf",
            "🧤 Gloves",
            "🥾 Hiking Shoes",
            "🧦 Woollen Socks"
        )

        "🍜 Food Lover's Paradise" -> listOf(
            "💊 Digestive Medicine",
            "📷 Camera",
            "💧 Reusable Water Bottle"
        )

        "🏛 History & Culture" -> listOf(
            "👟 Comfortable Walking Shoes",
            "📷 Camera",
            "🧢 Cap",
            "🧴 Sunscreen"
        )

        "🎉 Festival Destinations" -> listOf(
            "📷 Camera",
            "🔋 Power Bank",
            "👟 Comfortable Shoes"
        )

        "💎 Hidden Gems" -> listOf(
            "🗺 Offline Maps",
            "🔋 Power Bank",
            "🔦 Flashlight"
        )

        else -> emptyList()
    }

    val allItems = travelEssentials + destinationEssentials

    val checked = remember {
        mutableStateListOf<Boolean>().apply {
            repeat(allItems.size) { add(false) }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            "🎒 Smart Packing Checklist",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "📍 ${destination.name}, ${destination.country}",
            fontSize = 18.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {

            item {
                Text(
                    "🛂 Travel Essentials",
                    style = MaterialTheme.typography.titleMedium
                )

                Spacer(modifier = Modifier.height(8.dp))
            }

            items(travelEssentials.size) { index ->

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(travelEssentials[index])

                    Checkbox(
                        checked = checked[index],
                        onCheckedChange = {
                            checked[index] = it
                        }
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))
            }

            if (destinationEssentials.isNotEmpty()) {

                item {

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        "🌍 Destination Essentials",
                        style = MaterialTheme.typography.titleMedium
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                }

                items(destinationEssentials.size) { index ->

                    val actualIndex = index + travelEssentials.size

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(destinationEssentials[index])

                        Checkbox(
                            checked = checked[actualIndex],
                            onCheckedChange = {
                                checked[actualIndex] = it
                            }
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}