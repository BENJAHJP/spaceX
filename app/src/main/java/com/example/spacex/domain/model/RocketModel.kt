package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.DiameterX
import com.example.spacex.data.remote.dto.Engines
import com.example.spacex.data.remote.dto.FirstStage
import com.example.spacex.data.remote.dto.Height
import com.example.spacex.data.remote.dto.LandingLegs
import com.example.spacex.data.remote.dto.Mass
import com.example.spacex.data.remote.dto.PayloadWeight
import com.example.spacex.data.remote.dto.SecondStage

data class RocketModel(
    val active: Boolean,
    val boosters: Int,
    val company: String,
    val costPerLaunch: Int,
    val country: String,
    val description: String,
    val diameter: DiameterX,
    val engines: Engines,
    val firstFlight: String,
    val firstStage: FirstStage,
    val flickrImages: List<String>,
    val height: Height,
    val id: String,
    val landingLegs: LandingLegs,
    val mass: Mass,
    val name: String,
    val payloadWeights: List<PayloadWeight>,
    val secondStage: SecondStage,
    val stages: Int,
    val successRatePct: Int,
    val type: String,
    val wikipedia: String
)