package com.example.spacex.data.remote.dto

data class Dragon(
    val capsule: String,
    val flight_time_sec: Int,
    val land_landing: Boolean,
    val manifest: String,
    val mass_returned_kg: Double,
    val mass_returned_lbs: Double,
    val water_landing: Boolean
)