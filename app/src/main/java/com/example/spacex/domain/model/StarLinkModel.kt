package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.SpaceTrack

data class StarLinkModel(
    val heightKm: Double,
    val id: String,
    val latitude: Double,
    val launch: String,
    val longitude: Double,
    val spaceTrack: SpaceTrack,
    val velocityKms: Double,
    val version: String
)
