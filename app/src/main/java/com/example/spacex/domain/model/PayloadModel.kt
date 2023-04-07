package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.Dragon

data class PayloadModel(
    val apoapsisKm: Double,
    val argOfPericenter: Double,
    val customers: List<String>,
    val dragon: Dragon,
    val eccentricity: Double,
    val epoch: String,
    val id: String,
    val inclinationDeg: Double,
    val launch: String,
    val lifespanYears: Double,
    val longitude: Double,
    val manufacturers: List<String>,
    val massKg: Double,
    val massLbs: Double,
    val meanAnomaly: Double,
    val meanMotion: Double,
    val name: String,
    val nationalities: List<String>,
    val noradIds: List<Int>,
    val orbit: String,
    val periapsisKm: Double,
    val periodMin: Double,
    val raan: Double,
    val referenceSystem: String,
    val regime: String,
    val reused: Boolean,
    val semiMajorAxisKm: Double,
    val type: String
)
