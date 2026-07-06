package com.anvi.tripgenie.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.anvi.tripgenie.repository.RetrofitInstance
import kotlinx.coroutines.launch

@Composable
fun WeatherScreen() {

    val apiKey = "09d731bbf4fc63d6df764a52cf7622b4"

    var city by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("Enter a city to check the weather.") }

    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "🌦 Weather",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = city,
            onValueChange = { city = it },
            label = { Text("Enter City") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {

                if (city.isBlank()) {
                    result = "Please enter a city."
                    return@Button
                }

                scope.launch {

                    try {

                        val response = RetrofitInstance.api.getWeather(
                            city = city.trim(),
                            apiKey = apiKey
                        )

                        if (response.isSuccessful && response.body() != null) {

                            val data = response.body()!!

                            result =
                                "📍 ${data.name}, ${data.sys.country}\n\n" +
                                        "🌡 Temperature: ${data.main.temp}°C\n\n" +
                                        "🤗 Feels Like: ${data.main.feels_like}°C\n\n" +
                                        "☁ Weather: ${data.weather[0].description}\n\n" +
                                        "💧 Humidity: ${data.main.humidity}%\n\n" +
                                        "🌬 Wind: ${data.wind.speed} m/s"

                        } else {

                            result = "City not found."

                        }

                    } catch (e: Exception) {

                        result = e.message ?: "Something went wrong."

                    }

                }

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Search Weather")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = result,
                modifier = Modifier.padding(16.dp),
                fontSize = 18.sp
            )
        }
    }
}