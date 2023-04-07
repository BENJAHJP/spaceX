package com.example.spacex.data.remote.dto

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