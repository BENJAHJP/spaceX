package com.example.spacex.data.remote.dto

data class LandpadDtoItem(
    val details: String,
    val full_name: String,
    val id: String,
    val images: Images,
    val landing_attempts: Int,
    val landing_successes: Int,
    val latitude: Double,
    val launches: List<String>,
    val locality: String,
    val longitude: Double,
    val name: String,
    val region: String,
    val status: String,
    val type: String,
    val wikipedia: String
)