package com.example.spacex.data.remote.dto

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