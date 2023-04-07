package com.example.spacex.data.remote.dto

data class CompanyDto(
    val ceo: String,
    val coo: String,
    val cto: String,
    val cto_propulsion: String,
    val employees: Int,
    val founded: Int,
    val founder: String,
    val headquarters: Headquarters,
    val id: String,
    val launch_sites: Int,
    val links: LinksX,
    val name: String,
    val summary: String,
    val test_sites: Int,
    val valuation: Long,
    val vehicles: Int
)