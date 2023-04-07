package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.CoreModel

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

fun CoreDtoItem.toCoreModel(): CoreModel{
    return CoreModel(
        asdsAttempts = asds_attempts,
        asdsLandings = asds_landings,
        block = block,
        id = id,
        lastUpdate = last_update,
        launches = launches,
        reuseCount = reuse_count,
        rtlsAttempts = rtls_attempts,
        rtlsLandings = rtls_landings,
        serial = serial,
        status = status
    )
}