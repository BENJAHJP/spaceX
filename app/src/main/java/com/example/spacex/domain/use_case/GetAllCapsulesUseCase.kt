package com.example.spacex.domain.use_case

import com.example.spacex.common.Resource
import com.example.spacex.data.remote.dto.toCapsuleModel
import com.example.spacex.domain.model.CapsuleModel
import com.example.spacex.domain.repository.SpacexRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetAllCapsulesUseCase @Inject constructor(
    private val repository: SpacexRepository
) {
    operator fun invoke(): Flow<Resource<List<CapsuleModel>>> = flow {
        try {
            emit(Resource.Loading())
            val capsules = repository.getAllCapsules().map { it.toCapsuleModel() }
            emit(Resource.Success(capsules))
        } catch (e: HttpException){
            emit(Resource.Error("An unknown error occurred"))
        } catch (e: IOException){
            emit(Resource.Error("Check your internet connection"))
        }
    }
}