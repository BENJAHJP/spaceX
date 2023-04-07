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
import com.example.spacex.domain.repository.SpacexRepository
import javax.inject.Inject

class SpacexRepositoryImpl @Inject constructor(
    private val spacexRepository: SpacexRepository
): SpacexRepository {
    override suspend fun getAllLaunches(): LaunchDto {
        return spacexRepository.getAllLaunches()
    }

    override suspend fun getLaunchesById(id: String): LaunchDtoItem {
        return spacexRepository.getLaunchesById(id)
    }

    override suspend fun getAllCapsules(): CapsuleDto {
        return spacexRepository.getAllCapsules()
    }

    override suspend fun getCapsuleById(id: String): CapsuleDtoItem {
        return spacexRepository.getCapsuleById(id)
    }

    override suspend fun getCompanyInfo(): CompanyDto {
        return spacexRepository.getCompanyInfo()
    }

    override suspend fun getAllCores(): CoreDto {
        return spacexRepository.getAllCores()
    }

    override suspend fun getCoreById(id: String): CoreDtoItem {
        return spacexRepository.getCoreById(id)
    }

    override suspend fun getAllCrews(): CrewDto {
        return spacexRepository.getAllCrews()
    }

    override suspend fun getCrewById(id: String): CrewDtoItem {
        return spacexRepository.getCrewById(id)
    }

    override suspend fun getAllDragons(): DragonDto {
        return spacexRepository.getAllDragons()
    }

    override suspend fun getDragonById(id: String): DragonDtoItem {
        return spacexRepository.getDragonById(id)
    }

    override suspend fun getAllLandPads(): LandpadDto {
        return spacexRepository.getAllLandPads()
    }

    override suspend fun getLandPadById(id: String): LandpadDtoItem {
        return spacexRepository.getLandPadById(id)
    }

    override suspend fun getAllLaunchPads(): LaunchPadDto {
        return spacexRepository.getAllLaunchPads()
    }

    override suspend fun getLaunchPadById(id: String): LaunchDtoItem {
        return spacexRepository.getLaunchesById(id)
    }

    override suspend fun getAllPayloads(): PayloadDto {
        return spacexRepository.getAllPayloads()
    }

    override suspend fun getPayloadById(id: String): PayloadDtoItem {
        return spacexRepository.getPayloadById(id)
    }

    override suspend fun getRoadster(): RoadsterDto {
        return spacexRepository.getRoadster()
    }

    override suspend fun getAllRockets(): RocketDto {
        return spacexRepository.getAllRockets()
    }

    override suspend fun getRocketById(id: String): RocketDtoItem {
        return spacexRepository.getRocketById(id)
    }

    override suspend fun getAllShips(): ShipDto {
        return spacexRepository.getAllShips()
    }

    override suspend fun getShipById(id: String): ShipDtoItem {
        return spacexRepository.getShipById(id)
    }

    override suspend fun getAllStarLinks(): StarLinkDto {
        return spacexRepository.getAllStarLinks()
    }

    override suspend fun getStarlinkById(id: String): StarLinkDtoItem {
        return spacexRepository.getStarlinkById(id)
    }

    override suspend fun getAllHistory(): HistoryDto {
        return spacexRepository.getAllHistory()
    }

    override suspend fun getHistoryById(id: String): HistoryDtoItem {
        return spacexRepository.getHistoryById(id)
    }
}