package com.example.spacex.data.remote.api

import com.example.spacex.data.remote.dto.CapsuleDto
import com.example.spacex.data.remote.dto.CapsuleDtoItem
import com.example.spacex.data.remote.dto.CompanyDto
import com.example.spacex.data.remote.dto.CoreDto
import com.example.spacex.data.remote.dto.CoreDtoItem
import com.example.spacex.data.remote.dto.Crew
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
import retrofit2.http.GET
import retrofit2.http.Path

interface SpacexApi {

    //get launches
    @GET("v5/launches")
    suspend fun getAllLaunches(): LaunchDto

    @GET("v5/launches/{id}")
    suspend fun getLaunchesById(
        @Path("id") id: String
    ): LaunchDtoItem

    //get capsules
    @GET("v4/capsules")
    suspend fun getAllCapsules(): CapsuleDto

    @GET("v4/capsules/{id}")
    suspend fun getCapsuleById(
        @Path("id") id: String
    ): CapsuleDtoItem

    //get company info
    @GET("v4/company")
    suspend fun getCompanyInfo(): CompanyDto

    //get cores
    @GET("v4/cores")
    suspend fun getAllCores(): CoreDto

    @GET("v4/cores/{id}")
    suspend fun getCoreById(
        @Path("id") id: String
    ): CoreDtoItem

    //get crews
    @GET("v4/crew")
    suspend fun getAllCrews(): Crew

    @GET("v4/crew/{id}")
    suspend fun getCrewById(
        @Path("id") id: String
    ): Crew

    //get dragons
    @GET("v4/dragons")
    suspend fun getAllDragons(): DragonDto

    @GET("v4/dragons/{id}")
    suspend fun getDragonById(
        @Path("id") id: String
    ): DragonDtoItem

    //get landpads
    @GET("v4/landpads")
    suspend fun getAllLandPads(): LandpadDto

    @GET("v4/landpads/{id}")
    suspend fun getLandPadById(
        @Path("id") id: String
    ): LandpadDtoItem

    //get launchpad
    @GET("v4/launchpads")
    suspend fun getAllLaunchPads(): LaunchPadDto

    @GET("v4/launchpads/{id}")
    suspend fun getLaunchPadById(
        @Path("id") id: String
    ): LaunchDtoItem

    //get payloads
    @GET("v4/payloads")
    suspend fun getAllPayloads(): PayloadDto

    @GET("v4/payloads/{id}")
    suspend fun getPayloadById(
        @Path("id") id: String
    ): PayloadDtoItem

    //get roadster
    @GET("v4/roadster")
    suspend fun getRoadster(): RoadsterDto

    //get rockets
    @GET("v4/rockets")
    suspend fun getAllRockets(): RocketDto

    @GET("v4/rockets/{id}")
    suspend fun getRocketById(
        @Path("id") id: String
    ): RocketDtoItem

    //get ships
    @GET("v4/ships")
    suspend fun getAllShips(): ShipDto

    @GET("v4/ships/{id}")
    suspend fun getShipById(
        @Path("id") id: String
    ): ShipDtoItem

    //get starlink
    @GET("v4/starlink")
    suspend fun getAllStarLinks(): StarLinkDto

    @GET("v4/starlink/{id}")
    suspend fun getStarlinkById(
        @Path("id") id: String
    ): StarLinkDtoItem

    //get history
    @GET("v4/history")
    suspend fun getAllHistory(): HistoryDto

    @GET("v4/history/{id}")
    suspend fun getHistoryById(
        @Path("id") id: String
    ): HistoryDtoItem
}