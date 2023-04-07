package com.example.spacex.data.remote.dto

data class PayloadDtoItem(
    val apoapsis_km: Double,
    val arg_of_pericenter: Double,
    val customers: List<String>,
    val dragon: Dragon,
    val eccentricity: Double,
    val epoch: String,
    val id: String,
    val inclination_deg: Double,
    val launch: String,
    val lifespan_years: Double,
    val longitude: Double,
    val manufacturers: List<String>,
    val mass_kg: Double,
    val mass_lbs: Double,
    val mean_anomaly: Double,
    val mean_motion: Double,
    val name: String,
    val nationalities: List<String>,
    val norad_ids: List<Int>,
    val orbit: String,
    val periapsis_km: Double,
    val period_min: Double,
    val raan: Double,
    val reference_system: String,
    val regime: String,
    val reused: Boolean,
    val semi_major_axis_km: Double,
    val type: String
)