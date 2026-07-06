package com.anvi.tripgenie.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anvi.tripgenie.data.DestinationData
import com.anvi.tripgenie.model.Destination
import com.anvi.tripgenie.data.SelectedDestination

@Composable
fun ExploreScreen() {

    var search by remember { mutableStateOf("") }

    val filteredDestinations = DestinationData.destinations.filter {
        it.name.contains(search, ignoreCase = true) ||
                it.country.contains(search, ignoreCase = true) ||
                it.category.contains(search, ignoreCase = true)
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        item {

            Text(
                text = "🌍 Explore",
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = search,
                onValueChange = { search = it },
                label = { Text("Search Destination") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))
        }

        items(filteredDestinations) { destination ->
            ExpandableDestinationCard(destination)
        }
    }
}

@Composable
fun ExpandableDestinationCard(
    destination: Destination
) {

    var expanded by remember {
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                expanded = !expanded
                SelectedDestination.destination = destination
            }
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "🌍 ${destination.name}, ${destination.country}",
                    fontSize = 22.sp
                )

                Text(
                    if (expanded) "▲" else "▼",
                    fontSize = 20.sp
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text("⭐ Rating: ${destination.rating}")
            Text("📂 Category: ${destination.category}")
            Text("💰 Budget: ${destination.budget}")
            Text("📅 Best Time: ${destination.bestTime}")

            if (expanded) {

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    "🏛 Must Visit",
                    style = MaterialTheme.typography.titleMedium
                )

                destination.mustVisit.forEach {
                    Text("• $it")
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    "🍜 Famous Food",
                    style = MaterialTheme.typography.titleMedium
                )

                destination.famousFood.forEach {
                    Text("• $it")
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text("🎉 Festival: ${destination.famousFestival}")
                Text("🗣 Language: ${destination.language}")
                Text("💱 Currency: ${destination.currency}")
                Text("❤️ Perfect For: ${destination.perfectFor}")

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    "🧠 Fun Fact",
                    style = MaterialTheme.typography.titleMedium
                )

                Text(destination.funFact)

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    "🏷 Tags",
                    style = MaterialTheme.typography.titleMedium
                )

                destination.tags.forEach {
                    AssistChip(
                        onClick = {},
                        label = {
                            Text(it)
                        }
                    )

                    Spacer(modifier = Modifier.height(4.dp))
                }
            }
        }
    }
}