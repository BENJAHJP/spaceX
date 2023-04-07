package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.Core
import com.example.spacex.data.remote.dto.Crew
import com.example.spacex.data.remote.dto.Failure
import com.example.spacex.data.remote.dto.Fairings
import com.example.spacex.data.remote.dto.Links

data class LaunchModel(
    val autoUpdate: Boolean,
    val capsules: List<String>,
    val cores: List<Core>,
    val crew: List<Crew>,
    val dateLocal: String,
    val datePrecision: String,
    val dateUnix: Int,
    val dateUtc: String,
    val details: String,
    val failures: List<Failure>,
    val fairings: Fairings,
    val flightNumber: Int,
    val id: String,
    val launchLibraryId: String,
    val launchpad: String,
    val links: Links,
    val name: String,
    val net: Boolean,
    val payloads: List<String>,
    val rocket: String,
    val ships: List<String>,
    val staticFireDateUnix: Int,
    val staticFireDateUtc: String,
    val success: Boolean,
    val tbd: Boolean,
    val upcoming: Boolean,
    val window: Int
)
