package com.example.spacex.data.remote.dto

data class CoreDtoItem(
    val asds_attempts: Int,
    val asds_landings: Int,
    val block: Int,
    val id: String,
    val last_update: String,
    val launches: List<String>,
    val reuse_count: Int,
    val rtls_attempts: Int,
    val rtls_landings: Int,
    val serial: String,
    val status: String
)