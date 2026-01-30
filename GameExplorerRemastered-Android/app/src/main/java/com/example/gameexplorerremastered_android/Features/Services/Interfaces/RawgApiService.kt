package com.example.gameexplorerremastered_android.Features.Services.Interfaces

import com.example.gameexplorerremastered_android.Features.Games.model.RawgResponse
import retrofit2.http.GET
import retrofit2.http.Query
interface RawgApiService {
    @GET("games")
    suspend fun getGames(
        @Query("key") apiKey: String,
        @Query("page") page: Int = 1,
        @Query("page_size") pageSize: Int = 20
    ): RawgResponse
}