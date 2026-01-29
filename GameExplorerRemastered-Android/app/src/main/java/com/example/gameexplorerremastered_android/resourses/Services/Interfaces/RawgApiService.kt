package com.example.gameexplorerremastered_android.resourses.Services.Interfaces

import com.example.gameexplorerremastered_android.BuildConfig
import com.example.gameexplorerremastered_android.features.games.model.RawgResponse
import retrofit2.http.GET
import retrofit2.http.Query
interface RawgApiService {
    @GET("games")
    suspend fun getGames(
        @Query("page") page: Int = 1,
        @Query("page_size") pageSize: Int = 20,
        @Query("key") apiKey: String = BuildConfig.RAWG_API_KEY

    ): RawgResponse
}