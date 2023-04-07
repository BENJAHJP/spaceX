package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.ShipModel

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

fun ShipDtoItem.toShipModel(): ShipModel{
    return ShipModel(
        abs = abs,
        active = active,
        classId = `class`,
        courseDeg = course_deg,
        homePort = home_port,
        id = id,
        image = image,
        imo = imo,
        lastAisUpdate = last_ais_update,
        latitude = latitude,
        launches = launches,
        legacyId = legacy_id,
        link = link,
        longitude = longitude,
        massKg = mass_kg,
        massLbs = mass_lbs,
        mmsi = mmsi,
        model = model,
        name = name,
        roles = roles,
        speedKn = speed_kn,
        status = status,
        type = type,
        yearBuilt = year_built
    )
}