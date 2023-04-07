package com.example.spacex.data.remote.dto

data class CapsuleDtoItem(
    val id: String,
    val land_landings: Int,
    val last_update: String,
    val launches: List<String>,
    val reuse_count: Int,
    val serial: String,
    val status: String,
    val type: String,
    val water_landings: Int
)