package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.PayloadModel

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

fun PayloadDtoItem.toPayloadModel(): PayloadModel{
    return PayloadModel(
        apoapsisKm = apoapsis_km,
        argOfPericenter = arg_of_pericenter,
        customers = customers,
        dragon = dragon,
        eccentricity = eccentricity,
        epoch = epoch,
        id = id,
        inclinationDeg = inclination_deg,
        launch = launch,
        lifespanYears = lifespan_years,
        longitude = longitude,
        manufacturers = manufacturers,
        massKg = mass_kg,
        massLbs = mass_lbs,
        meanAnomaly = mean_anomaly,
        meanMotion = mean_motion,
        name = name,
        nationalities = nationalities,
        noradIds = norad_ids,
        orbit = orbit,
        periapsisKm = periapsis_km,
        periodMin = period_min,
        raan = raan,
        referenceSystem = reference_system,
        regime = regime,
        reused = reused,
        semiMajorAxisKm = semi_major_axis_km,
        type = type
    )
}