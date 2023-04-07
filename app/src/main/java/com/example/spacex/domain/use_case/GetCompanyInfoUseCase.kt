package com.example.spacex.domain.use_case

import com.example.spacex.common.Resource
import com.example.spacex.data.remote.dto.toCompanyModel
import com.example.spacex.data.remote.dto.toLaunchModel
import com.example.spacex.domain.model.CompanyModel
import com.example.spacex.domain.model.LaunchModel
import com.example.spacex.domain.repository.SpacexRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCompanyInfoUseCase @Inject constructor(
    private val repository: SpacexRepository
) {
    operator fun invoke(): Flow<Resource<CompanyModel>> = flow {
        try {
            emit(Resource.Loading())
            val company = repository.getCompanyInfo().toCompanyModel()
            emit(Resource.Success(company))
        } catch (e: HttpException){
            emit(Resource.Error("An unknown error occurred"))
        } catch (e: IOException){
            emit(Resource.Error("Check your internet connection"))
        }
    }
}