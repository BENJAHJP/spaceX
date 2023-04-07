package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.LandPadModel

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

fun LandpadDtoItem.toLandPadModel(): LandPadModel{
    return LandPadModel(
        details = details,
        fullName = full_name,
        id = id,
        images = images,
        landingAttempts = landing_attempts,
        landingSuccesses = landing_successes,
        latitude = latitude,
        launches = launches,
        locality = locality,
        longitude = longitude,
        name = name,
        region = region,
        status = status,
        type = type,
        wikipedia = wikipedia
    )
}