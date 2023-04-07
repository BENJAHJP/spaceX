package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.RoadsterModel

data class RoadsterDto(
    val apoapsis_au: Double,
    val details: String,
    val earth_distance_km: Double,
    val earth_distance_mi: Double,
    val eccentricity: Double,
    val epoch_jd: Double,
    val flickr_images: List<String>,
    val id: String,
    val inclination: Double,
    val launch_date_unix: Int,
    val launch_date_utc: String,
    val launch_mass_kg: Int,
    val launch_mass_lbs: Int,
    val longitude: Double,
    val mars_distance_km: Double,
    val mars_distance_mi: Double,
    val name: String,
    val norad_id: Int,
    val orbit_type: String,
    val periapsis_arg: Double,
    val periapsis_au: Double,
    val period_days: Double,
    val semi_major_axis_au: Double,
    val speed_kph: Double,
    val speed_mph: Double,
    val video: String,
    val wikipedia: String
)

fun RoadsterDto.toRoadSterModel(): RoadsterModel{
    return RoadsterModel(
        apoapsisAu = apoapsis_au,
        details = details,
        earthDistanceKm = earth_distance_km,
        earthDistanceMi = earth_distance_mi,
        eccentricity = eccentricity,
        epochJd = epoch_jd,
        flickrImages = flickr_images,
        id = id,
        inclination = inclination,
        launchDateUnix = launch_date_unix,
        launchDateUtc = launch_date_utc,
        launchMassKg = launch_mass_kg,
        launchMassLbs = launch_mass_lbs,
        longitude = longitude,
        marsDistanceKm = mars_distance_km,
        marsDistanceMi = mars_distance_mi,
        name = name,
        noradId = norad_id,
        orbitType = orbit_type,
        periapsisArg = periapsis_arg,
        periapsisAu = periapsis_au,
        periodDays = period_days,
        semiMajorAxisAu = semi_major_axis_au,
        speedKph = speed_kph,
        speedMph = speed_mph,
        video = video,
        wikipedia = wikipedia
    )
}