package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.CapsuleModel

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

fun CapsuleDtoItem.toCapsuleModel(): CapsuleModel {
    return CapsuleModel(
        id = id,
        landLandings = land_landings,
        lastUpdate = last_update,
        launches = launches,
        reuseCount = reuse_count,
        serial = serial,
        status = status,
        type = type,
        waterLandings = water_landings
    )
}