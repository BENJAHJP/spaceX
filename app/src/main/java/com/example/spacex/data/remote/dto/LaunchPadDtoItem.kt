package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.LaunchModel
import com.example.spacex.domain.model.LaunchPadModel

data class LaunchPadDtoItem(
    val details: String,
    val full_name: String,
    val id: String,
    val images: ImagesX,
    val latitude: Double,
    val launch_attempts: Int,
    val launch_successes: Int,
    val launches: List<String>,
    val locality: String,
    val longitude: Double,
    val name: String,
    val region: String,
    val rockets: List<String>,
    val status: String,
    val timezone: String
)

fun LaunchPadDtoItem.toLaunchModel(): LaunchPadModel {
    return LaunchPadModel(
        details = details,
        fullName = full_name,
        id = id,
        images = images,
        latitude = latitude,
        launchAttempts = launch_attempts,
        launchSuccesses = launch_successes,
        launches = launches,
        locality = locality,
        longitude = longitude,
        name = name,
        region = region,
        rockets = rockets,
        status = status,
        timezone = timezone
    )
}