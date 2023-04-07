package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.Diameter
import com.example.spacex.data.remote.dto.HeatShield
import com.example.spacex.data.remote.dto.HeightWTrunk
import com.example.spacex.data.remote.dto.LaunchPayloadMass
import com.example.spacex.data.remote.dto.LaunchPayloadVol
import com.example.spacex.data.remote.dto.PressurizedCapsule
import com.example.spacex.data.remote.dto.ReturnPayloadMass
import com.example.spacex.data.remote.dto.ReturnPayloadVol
import com.example.spacex.data.remote.dto.Thruster
import com.example.spacex.data.remote.dto.Trunk

data class DragonModel(
    val active: Boolean,
    val crewCapacity: Int,
    val description: String,
    val diameter: Diameter,
    val dryMassKg: Int,
    val dryMassLb: Int,
    val firstFlight: String,
    val flickrImages: List<String>,
    val heatShield: HeatShield,
    val heightWTrunk: HeightWTrunk,
    val id: String,
    val launchPayloadMass: LaunchPayloadMass,
    val launchPayloadVol: LaunchPayloadVol,
    val name: String,
    val orbitDurationYr: Int,
    val pressurizedCapsule: PressurizedCapsule,
    val returnPayloadMass: ReturnPayloadMass,
    val returnPayloadVol: ReturnPayloadVol,
    val sidewallAngleDeg: Int,
    val thrusters: List<Thruster>,
    val trunk: Trunk,
    val type: String,
    val wikipedia: String
)
