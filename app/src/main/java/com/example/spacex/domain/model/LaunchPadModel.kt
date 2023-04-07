package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.ImagesX

data class LaunchPadModel(
    val details: String,
    val fullName: String,
    val id: String,
    val images: ImagesX,
    val latitude: Double,
    val launchAttempts: Int,
    val launchSuccesses: Int,
    val launches: List<String>,
    val locality: String,
    val longitude: Double,
    val name: String,
    val region: String,
    val rockets: List<String>,
    val status: String,
    val timezone: String
)
