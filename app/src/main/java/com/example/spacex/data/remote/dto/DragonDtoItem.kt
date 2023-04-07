package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.DragonModel

data class DragonDtoItem(
    val active: Boolean,
    val crew_capacity: Int,
    val description: String,
    val diameter: Diameter,
    val dry_mass_kg: Int,
    val dry_mass_lb: Int,
    val first_flight: String,
    val flickr_images: List<String>,
    val heat_shield: HeatShield,
    val height_w_trunk: HeightWTrunk,
    val id: String,
    val launch_payload_mass: LaunchPayloadMass,
    val launch_payload_vol: LaunchPayloadVol,
    val name: String,
    val orbit_duration_yr: Int,
    val pressurized_capsule: PressurizedCapsule,
    val return_payload_mass: ReturnPayloadMass,
    val return_payload_vol: ReturnPayloadVol,
    val sidewall_angle_deg: Int,
    val thrusters: List<Thruster>,
    val trunk: Trunk,
    val type: String,
    val wikipedia: String
)

fun DragonDtoItem.toDragonModel(): DragonModel{
    return DragonModel(
        active = active,
        crewCapacity = crew_capacity,
        description = description,
        diameter = diameter,
        dryMassKg = dry_mass_kg,
        dryMassLb = dry_mass_lb,
        firstFlight = first_flight,
        flickrImages = flickr_images,
        heatShield = heat_shield,
        heightWTrunk = height_w_trunk,
        id = id,
        launchPayloadMass = launch_payload_mass,
        launchPayloadVol = launch_payload_vol,
        name = name,
        orbitDurationYr = orbit_duration_yr,
        pressurizedCapsule = pressurized_capsule,
        returnPayloadMass = return_payload_mass,
        returnPayloadVol = return_payload_vol,
        sidewallAngleDeg = sidewall_angle_deg,
        thrusters = thrusters,
        trunk = trunk,
        type = type,
        wikipedia = wikipedia
    )
}