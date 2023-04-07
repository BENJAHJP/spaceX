package com.example.spacex.domain.model

data class CapsuleModel(
    val id: String,
    val landLandings: Int,
    val lastUpdate: String,
    val launches: List<String>,
    val reuseCount: Int,
    val serial: String,
    val status: String,
    val type: String,
    val waterLandings: Int
)
