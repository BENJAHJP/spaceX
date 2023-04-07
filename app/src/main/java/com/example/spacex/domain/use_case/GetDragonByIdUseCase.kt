package com.example.spacex.domain.use_case

import com.example.spacex.common.Resource
import com.example.spacex.data.remote.dto.toCoreModel
import com.example.spacex.data.remote.dto.toDragonModel
import com.example.spacex.domain.model.CoreModel
import com.example.spacex.domain.model.DragonModel
import com.example.spacex.domain.repository.SpacexRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetDragonByIdUseCase @Inject constructor(
    private val repository: SpacexRepository
) {
    operator fun invoke(id: String): Flow<Resource<DragonModel>> = flow {
        try {
            emit(Resource.Loading())
            val dragon = repository.getDragonById(id).toDragonModel()
            emit(Resource.Success(dragon))
        } catch (e: HttpException){
            emit(Resource.Error("An unknown error occurred"))
        } catch (e: IOException){
            emit(Resource.Error("Check your internet connection"))
        }
    }
}