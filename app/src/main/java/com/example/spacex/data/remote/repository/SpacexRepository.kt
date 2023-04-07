package com.example.spacex.data.remote.repository

import com.example.spacex.data.remote.dto.CapsuleDto
import com.example.spacex.data.remote.dto.CapsuleDtoItem
import com.example.spacex.data.remote.dto.CompanyDto
import com.example.spacex.data.remote.dto.CoreDto
import com.example.spacex.data.remote.dto.CoreDtoItem
import com.example.spacex.data.remote.dto.CrewDto
import com.example.spacex.data.remote.dto.CrewDtoItem
import com.example.spacex.data.remote.dto.DragonDto
import com.example.spacex.data.remote.dto.DragonDtoItem
import com.example.spacex.data.remote.dto.HistoryDto
import com.example.spacex.data.remote.dto.HistoryDtoItem
import com.example.spacex.data.remote.dto.LandpadDto
import com.example.spacex.data.remote.dto.LandpadDtoItem
import com.example.spacex.data.remote.dto.LaunchDto
import com.example.spacex.data.remote.dto.LaunchDtoItem
import com.example.spacex.data.remote.dto.LaunchPadDto
import com.example.spacex.data.remote.dto.PayloadDto
import com.example.spacex.data.remote.dto.PayloadDtoItem
import com.example.spacex.data.remote.dto.RoadsterDto
import com.example.spacex.data.remote.dto.RocketDto
import com.example.spacex.data.remote.dto.RocketDtoItem
import com.example.spacex.data.remote.dto.ShipDto
import com.example.spacex.data.remote.dto.ShipDtoItem
import com.example.spacex.data.remote.dto.StarLinkDto
import com.example.spacex.data.remote.dto.StarLinkDtoItem
import retrofit2.http.Path

interface SpacexRepository {

    suspend fun getAllLaunches(): LaunchDto
    suspend fun getLaunchesById(id: String): LaunchDtoItem

    suspend fun getAllCapsules(): CapsuleDto
    suspend fun getCapsuleById(id: String): CapsuleDtoItem

    suspend fun getCompanyInfo(): CompanyDto

    suspend fun getAllCores(): CoreDto
    suspend fun getCoreById(id: String): CoreDtoItem

    suspend fun getAllCrews(): CrewDto
    suspend fun getCrewById(id: String): CrewDtoItem

    suspend fun getAllDragons(): DragonDto
    suspend fun getDragonById(id: String): DragonDtoItem

    suspend fun getAllLandPads(): LandpadDto
    suspend fun getLandPadById(id: String): LandpadDtoItem

    suspend fun getAllLaunchPads(): LaunchPadDto
    suspend fun getLaunchPadById(id: String): LaunchDtoItem

    suspend fun getAllPayloads(): PayloadDto
    suspend fun getPayloadById(id: String): PayloadDtoItem

    suspend fun getRoadster(): RoadsterDto

    suspend fun getAllRockets(): RocketDto
    suspend fun getRocketById(id: String): RocketDtoItem

    suspend fun getAllShips(): ShipDto
    suspend fun getShipById(id: String): ShipDtoItem

    suspend fun getAllStarLinks(): StarLinkDto
    suspend fun getStarlinkById(id: String): StarLinkDtoItem

    suspend fun getAllHistory(): HistoryDto
    suspend fun getHistoryById(id: String): HistoryDtoItem
}