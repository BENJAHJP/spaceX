package com.example.spacex.data.remote.api

import com.example.spacex.data.remote.dto.CapsuleDto
import com.example.spacex.data.remote.dto.CapsuleDtoItem
import com.example.spacex.data.remote.dto.CompanyDto
import com.example.spacex.data.remote.dto.CoreDto
import com.example.spacex.data.remote.dto.CoreDtoItem
import com.example.spacex.data.remote.dto.Crew
import com.example.spacex.data.remote.dto.DragonDto
import com.example.spacex.data.remote.dto.LaunchDto
import com.example.spacex.data.remote.dto.LaunchDtoItem
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
    ): Crew
}