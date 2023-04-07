package com.example.spacex.domain.model

data class ShipModel(
    val abs: Int,
    val active: Boolean,
    val classId: Int,
    val courseDeg: Any,
    val homePort: String,
    val id: String,
    val image: String,
    val imo: Int,
    val lastAisUpdate: Any,
    val latitude: Double,
    val launches: List<String>,
    val legacyId: String,
    val link: String,
    val longitude: Double,
    val massKg: Int,
    val massLbs: Int,
    val mmsi: Int,
    val model: String,
    val name: String,
    val roles: List<String>,
    val speedKn: Any,
    val status: String,
    val type: String,
    val yearBuilt: Int
)
