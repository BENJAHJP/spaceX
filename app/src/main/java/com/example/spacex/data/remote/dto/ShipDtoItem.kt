package com.example.spacex.data.remote.dto

data class ShipDtoItem(
    val abs: Int,
    val active: Boolean,
    val `class`: Int,
    val course_deg: Any,
    val home_port: String,
    val id: String,
    val image: String,
    val imo: Int,
    val last_ais_update: Any,
    val latitude: Double,
    val launches: List<String>,
    val legacy_id: String,
    val link: String,
    val longitude: Double,
    val mass_kg: Int,
    val mass_lbs: Int,
    val mmsi: Int,
    val model: String,
    val name: String,
    val roles: List<String>,
    val speed_kn: Any,
    val status: String,
    val type: String,
    val year_built: Int
)