package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.HistoryModel

data class HistoryDtoItem(
    val details: String,
    val event_date_unix: Int,
    val event_date_utc: String,
    val id: String,
    val links: LinksXX,
    val title: String
)

fun HistoryDtoItem.toHistoryModel(): HistoryModel{
    return HistoryModel(
        details = details,
        eventDateUnix = event_date_unix,
        eventDateUtc = event_date_utc,
        id = id,
        links = links,
        title = title
    )
}