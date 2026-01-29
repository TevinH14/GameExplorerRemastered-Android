package com.example.gameexplorerremastered_android.features.games.model

import com.google.gson.annotations.SerializedName



data class StoreDetail(
    val id: Int?,
    val name: String?,
    val slug: String?,
    val domain: String?,
    @SerializedName("games_count") val gamesCount: Int?,
    @SerializedName("image_background") val imageBackground: String?
)