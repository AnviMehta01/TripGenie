package com.anvi.tripgenie.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MoreScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        item {

            Text(
                text = "🌍 TripGenie",
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Your smart travel companion for exploring destinations, checking weather, and preparing with destination-specific packing lists.",
                style = MaterialTheme.typography.bodyLarge
            )
        }

        item {

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = "💡 Travel Tips",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text("✈️ Book flights early for better prices.")
                    Spacer(modifier = Modifier.height(8.dp))

                    Text("🧳 Pack light and carry only essentials.")
                    Spacer(modifier = Modifier.height(8.dp))

                    Text("🌦 Check the weather before packing.")
                    Spacer(modifier = Modifier.height(8.dp))

                    Text("💳 Carry both cash and a card.")
                    Spacer(modifier = Modifier.height(8.dp))

                    Text("📱 Download offline maps before travelling.")
                    Spacer(modifier = Modifier.height(8.dp))

                    Text("🛂 Keep digital copies of important documents.")
                }
            }
        }

        item {

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text(
                        text = "ℹ️ About TripGenie",
                        style = MaterialTheme.typography.titleLarge
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text("Version 1.0")

                    Spacer(modifier = Modifier.height(12.dp))

                    Text("✅ Explore 30+ destinations")
                    Text("✅ Destination search")
                    Text("✅ Weather information")
                    Text("✅ Smart packing checklists")

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        "\"Travel is the only thing you buy that makes you richer.\" ✨",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}