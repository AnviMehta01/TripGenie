package com.anvi.tripgenie.model

data class Destination(

    val name: String,
    val country: String,

    val category: String,

    val rating: Double,

    val budget: String,

    val bestTime: String,

    val mustVisit: List<String>,

    val famousFood: List<String>,

    val famousFestival: String,

    val language: String,

    val currency: String,

    val perfectFor: String,

    val funFact: String,

    val tags: List<String>,

    val packingItems: List<String> = emptyList()
)