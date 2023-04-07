package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.CrewModel

data class CrewDtoItem(
    val agency: String,
    val id: String,
    val image: String,
    val launches: List<String>,
    val name: String,
    val status: String,
    val wikipedia: String
)

fun CrewDtoItem.toCrewModel(): CrewModel{
    return CrewModel(
        agency = agency,
        id = id,
        image = image,
        launches = launches,
        name = name,
        status = status,
        wikipedia = wikipedia
    )
}