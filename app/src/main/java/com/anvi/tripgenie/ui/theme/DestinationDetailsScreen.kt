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
import com.anvi.tripgenie.data.SelectedDestination

@Composable
fun DestinationDetailsScreen() {

    val destination = SelectedDestination.destination ?: return

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        item {

            Text(
                "🌍 ${destination.name}, ${destination.country}",
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Column(
                    modifier = Modifier.padding(16.dp)
                ) {

                    Text("⭐ Rating: ${destination.rating}")

                    Text("💰 Budget: ${destination.budget}")

                    Text("📅 Best Time: ${destination.bestTime}")

                    Spacer(modifier = Modifier.height(12.dp))

                    Text("🏛 Must Visit",
                        style = MaterialTheme.typography.titleMedium)

                    destination.mustVisit.forEach {
                        Text("• $it")
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text("🍜 Famous Food",
                        style = MaterialTheme.typography.titleMedium)

                    destination.famousFood.forEach {
                        Text("• $it")
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text("🎉 ${destination.famousFestival}")

                    Text("🗣 ${destination.language}")

                    Text("💱 ${destination.currency}")

                    Text("❤️ ${destination.perfectFor}")

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        "🧠 Did You Know?",
                        style = MaterialTheme.typography.titleMedium
                    )

                    Text(destination.funFact)

                }

            }

        }

    }

}