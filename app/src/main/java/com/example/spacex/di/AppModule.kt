package com.example.spacex.di

import com.example.spacex.common.Constants
import com.example.spacex.data.remote.api.SpacexApi
import com.example.spacex.data.remote.repository.SpacexRepositoryImpl
import com.example.spacex.domain.repository.SpacexRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSpacexApi(): SpacexApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SpacexApi::class.java)
    }

    @Provides
    @Singleton
    fun provideSpacexRepository(spacexApi: SpacexApi): SpacexRepository {
        return SpacexRepositoryImpl(spacexApi)
    }
}