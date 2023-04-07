package com.example.spacex.data.remote.repository

import com.example.spacex.data.remote.api.SpacexApi
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
import com.example.spacex.domain.repository.SpacexRepository
import javax.inject.Inject

class SpacexRepositoryImpl @Inject constructor(
    private val spacexApi: SpacexApi
): SpacexRepository {
    override suspend fun getAllLaunches(): LaunchDto {
        return spacexApi.getAllLaunches()
    }

    override suspend fun getLaunchesById(id: String): LaunchDtoItem {
        return spacexApi.getLaunchesById(id)
    }

    override suspend fun getAllCapsules(): CapsuleDto {
        return spacexApi.getAllCapsules()
    }

    override suspend fun getCapsuleById(id: String): CapsuleDtoItem {
        return spacexApi.getCapsuleById(id)
    }

    override suspend fun getCompanyInfo(): CompanyDto {
        return spacexApi.getCompanyInfo()
    }

    override suspend fun getAllCores(): CoreDto {
        return spacexApi.getAllCores()
    }

    override suspend fun getCoreById(id: String): CoreDtoItem {
        return spacexApi.getCoreById(id)
    }

    override suspend fun getAllCrews(): CrewDto {
        return spacexApi.getAllCrews()
    }

    override suspend fun getCrewById(id: String): CrewDtoItem {
        return spacexApi.getCrewById(id)
    }

    override suspend fun getAllDragons(): DragonDto {
        return spacexApi.getAllDragons()
    }

    override suspend fun getDragonById(id: String): DragonDtoItem {
        return spacexApi.getDragonById(id)
    }

    override suspend fun getAllLandPads(): LandpadDto {
        return spacexApi.getAllLandPads()
    }

    override suspend fun getLandPadById(id: String): LandpadDtoItem {
        return spacexApi.getLandPadById(id)
    }

    override suspend fun getAllLaunchPads(): LaunchPadDto {
        return spacexApi.getAllLaunchPads()
    }

    override suspend fun getLaunchPadById(id: String): LaunchDtoItem {
        return spacexApi.getLaunchesById(id)
    }

    override suspend fun getAllPayloads(): PayloadDto {
        return spacexApi.getAllPayloads()
    }

    override suspend fun getPayloadById(id: String): PayloadDtoItem {
        return spacexApi.getPayloadById(id)
    }

    override suspend fun getRoadster(): RoadsterDto {
        return spacexApi.getRoadster()
    }

    override suspend fun getAllRockets(): RocketDto {
        return spacexApi.getAllRockets()
    }

    override suspend fun getRocketById(id: String): RocketDtoItem {
        return spacexApi.getRocketById(id)
    }

    override suspend fun getAllShips(): ShipDto {
        return spacexApi.getAllShips()
    }

    override suspend fun getShipById(id: String): ShipDtoItem {
        return spacexApi.getShipById(id)
    }

    override suspend fun getAllStarLinks(): StarLinkDto {
        return spacexApi.getAllStarLinks()
    }

    override suspend fun getStarlinkById(id: String): StarLinkDtoItem {
        return spacexApi.getStarlinkById(id)
    }

    override suspend fun getAllHistory(): HistoryDto {
        return spacexApi.getAllHistory()
    }

    override suspend fun getHistoryById(id: String): HistoryDtoItem {
        return spacexApi.getHistoryById(id)
    }
}