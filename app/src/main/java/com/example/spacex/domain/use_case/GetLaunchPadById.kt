package com.example.spacex.domain.use_case

import com.example.spacex.common.Resource
import com.example.spacex.data.remote.dto.toCoreModel
import com.example.spacex.data.remote.dto.toLaunchModel
import com.example.spacex.domain.model.CoreModel
import com.example.spacex.domain.model.LaunchPadModel
import com.example.spacex.domain.repository.SpacexRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetLaunchPadById @Inject constructor(
    private val repository: SpacexRepository
) {
    operator fun invoke(id: String): Flow<Resource<LaunchPadModel>> = flow {
        try {
            emit(Resource.Loading())
            val launchPad = repository.getLaunchPadById(id).toLaunchModel()
            emit(Resource.Success(launchPad))
        } catch (e: HttpException){
            emit(Resource.Error("An unknown error occurred"))
        } catch (e: IOException){
            emit(Resource.Error("Check your internet connection"))
        }
    }
}