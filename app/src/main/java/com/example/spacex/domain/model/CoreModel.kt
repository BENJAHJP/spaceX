package com.example.spacex.domain.model

data class CoreModel(
    val asdsAttempts: Int,
    val asdsLandings: Int,
    val block: Int,
    val id: String,
    val lastUpdate: String,
    val launches: List<String>,
    val reuseCount: Int,
    val rtlsAttempts: Int,
    val rtlsLandings: Int,
    val serial: String,
    val status: String
)
