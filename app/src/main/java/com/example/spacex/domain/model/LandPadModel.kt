package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.Images

data class LandPadModel(
    val details: String,
    val fullName: String,
    val id: String,
    val images: Images,
    val landingAttempts: Int,
    val landingSuccesses: Int,
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
