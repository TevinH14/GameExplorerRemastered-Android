package com.example.gameexplorerremastered_android.resourses.Services
import com.example.gameexplorerremastered_android.resourses.Services.Interfaces.RawgApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

    val api: RawgApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.rawg.io/api/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RawgApiService::class.java)
    }
}