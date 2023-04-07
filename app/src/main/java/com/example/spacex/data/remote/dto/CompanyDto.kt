package com.example.spacex.data.remote.dto

import com.example.spacex.domain.model.CompanyModel

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

fun CompanyDto.toCompanyModel(): CompanyModel{
    return CompanyModel(
        ceo = ceo,
        coo = coo,
        cto = cto,
        ctoPropulsion = cto_propulsion,
        employees = employees,
        founded = founded,
        founder = founder,
        headquarters = headquarters,
        id = id,
        launchSites = launch_sites,
        links = links,
        name = name,
        summary = summary,
        testSites = test_sites,
        valuation = valuation,
        vehicles = vehicles
    )
}