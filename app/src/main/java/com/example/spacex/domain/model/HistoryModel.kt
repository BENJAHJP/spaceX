package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.LinksXX

data class HistoryModel(
    val details: String,
    val eventDateUnix: Int,
    val eventDateUtc: String,
    val id: String,
    val links: LinksXX,
    val title: String
)
