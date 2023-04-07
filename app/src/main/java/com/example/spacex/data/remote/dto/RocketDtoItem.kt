package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.RocketModel

data class RocketDtoItem(
    val active: Boolean,
    val boosters: Int,
    val company: String,
    val cost_per_launch: Int,
    val country: String,
    val description: String,
    val diameter: DiameterX,
    val engines: Engines,
    val first_flight: String,
    val first_stage: FirstStage,
    val flickr_images: List<String>,
    val height: Height,
    val id: String,
    val landing_legs: LandingLegs,
    val mass: Mass,
    val name: String,
    val payload_weights: List<PayloadWeight>,
    val second_stage: SecondStage,
    val stages: Int,
    val success_rate_pct: Int,
    val type: String,
    val wikipedia: String
)

fun RocketDtoItem.toRocketModel(): RocketModel{
    return RocketModel(
        active = active,
        boosters = boosters,
        company = company,
        costPerLaunch = cost_per_launch,
        country = country,
        description = description,
        diameter = diameter,
        engines = engines,
        firstFlight = first_flight,
        firstStage = first_stage,
        flickrImages = flickr_images,
        height = height,
        id = id,
        landingLegs = landing_legs,
        mass = mass,
        name = name,
        payloadWeights = payload_weights,
        secondStage = second_stage,
        stages = stages,
        successRatePct = success_rate_pct,
        type = type,
        wikipedia = wikipedia
    )
}