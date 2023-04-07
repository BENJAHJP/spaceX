package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.StarLinkModel

data class StarLinkDtoItem(
    val height_km: Double,
    val id: String,
    val latitude: Double,
    val launch: String,
    val longitude: Double,
    val spaceTrack: SpaceTrack,
    val velocity_kms: Double,
    val version: String
)

fun StarLinkDtoItem.toStarLinkModel(): StarLinkModel{
    return StarLinkModel(
        heightKm = height_km,
        id = id,
        latitude = latitude,
        launch = launch,
        longitude = longitude,
        spaceTrack = spaceTrack,
        velocityKms = velocity_kms,
        version = version
    )
}