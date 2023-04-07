package com.example.spacex.data.remote.dto

data class HistoryDtoItem(
    val details: String,
    val event_date_unix: Int,
    val event_date_utc: String,
    val id: String,
    val links: LinksXX,
    val title: String
)