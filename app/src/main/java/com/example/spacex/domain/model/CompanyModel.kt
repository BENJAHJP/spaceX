package com.example.spacex.domain.model

import com.example.spacex.data.remote.dto.Headquarters
import com.example.spacex.data.remote.dto.LinksX

data class CompanyModel(
    val ceo: String,
    val coo: String,
    val cto: String,
    val ctoPropulsion: String,
    val employees: Int,
    val founded: Int,
    val founder: String,
    val headquarters: Headquarters,
    val id: String,
    val launchSites: Int,
    val links: LinksX,
    val name: String,
    val summary: String,
    val testSites: Int,
    val valuation: Long,
    val vehicles: Int
)
