package com.anvi.tripgenie.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {

        Text(
            text = "🌍 TripGenie",
            fontSize = 32.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "✨ Discover your next adventure!",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        CategoryCard(
            "⭐ Popular Destinations",
            "Paris • Tokyo • New York • London • Singapore"
        )

        CategoryCard(
            "🏖 Beach Escapes",
            "Goa • Bali • Santorini • Gokarna"
        )

        CategoryCard(
            "🏔 Mountain Escapes",
            "Kashmir • Munnar • Tawang"
        )

        CategoryCard(
            "🏛 History & Culture",
            "Rome • Kyoto • Agra • Jaipur"
        )

        CategoryCard(
            "🍜 Food Paradise",
            "Bangkok • Seoul"
        )

        CategoryCard(
            "🎉 Festival Destinations",
            "Rio de Janeiro • Munich • Varanasi"
        )

        CategoryCard(
            "💎 Hidden Gems",
            "Hallstatt • Chefchaouen • Lake Bled"
        )

        CategoryCard(
            "💰 Budget Friendly",
            "Hanoi • Kathmandu • Yogyakarta • Pondicherry"
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "👉 Explore tab contains complete destination details, attractions, food, festivals, fun facts and more!",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
fun CategoryCard(
    title: String,
    destinations: String
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = destinations,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}