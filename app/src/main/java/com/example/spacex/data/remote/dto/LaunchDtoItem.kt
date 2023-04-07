package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.LaunchModel

data class LaunchDtoItem(
    val auto_update: Boolean,
    val capsules: List<String>,
    val cores: List<Core>,
    val crew: List<Crew>,
    val date_local: String,
    val date_precision: String,
    val date_unix: Int,
    val date_utc: String,
    val details: String,
    val failures: List<Failure>,
    val fairings: Fairings,
    val flight_number: Int,
    val id: String,
    val launch_library_id: String,
    val launchpad: String,
    val links: Links,
    val name: String,
    val net: Boolean,
    val payloads: List<String>,
    val rocket: String,
    val ships: List<String>,
    val static_fire_date_unix: Int,
    val static_fire_date_utc: String,
    val success: Boolean,
    val tbd: Boolean,
    val upcoming: Boolean,
    val window: Int
)

fun LaunchDtoItem.toLaunchModel(): LaunchModel{
    return LaunchModel(
        autoUpdate = auto_update,
        capsules = capsules,
        cores = cores,
        crew = crew,
        dateLocal = date_local,
        datePrecision = date_precision,
        dateUnix = date_unix,
        dateUtc = date_utc,
        details = details,
        failures = failures,
        fairings = fairings,
        flightNumber = flight_number,
        id = id,
        launchLibraryId = launch_library_id,
        launchpad = launchpad,
        links = links,
        name = name,
        net = net,
        payloads = payloads,
        rocket = rocket,
        ships = ships,
        staticFireDateUnix = static_fire_date_unix,
        staticFireDateUtc = static_fire_date_utc,
        success = success,
        tbd = tbd,
        upcoming = upcoming,
        window = window
    )
}