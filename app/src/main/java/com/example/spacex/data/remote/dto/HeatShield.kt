package com.example.spacex.data.remote.dto

data class HeatShield(
    val dev_partner: String,
    val material: String,
    val size_meters: Double,
    val temp_degrees: Int
)