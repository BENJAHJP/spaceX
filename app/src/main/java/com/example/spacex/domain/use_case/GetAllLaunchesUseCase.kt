package com.example.spacex.domain.use_case

import com.example.spacex.common.Resource
import com.example.spacex.data.remote.dto.toLaunchModel
import com.example.spacex.domain.model.LaunchModel
import com.example.spacex.domain.repository.SpacexRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAllLaunchesUseCase @Inject constructor(
    private val spacexRepository: SpacexRepository
) {
    operator fun invoke(): Flow<Resource<List<LaunchModel>>> = flow {
        try {
            emit(Resource.Loading())
            val launches = spacexRepository.getAllLaunches().map { it.toLaunchModel() }
            emit(Resource.Success(launches))
        } catch (e: HttpException){
            emit(Resource.Error("An unknown error occurred"))
        } catch (e: IOException){
            emit(Resource.Error("Check your internet connection"))
        }
    }
}