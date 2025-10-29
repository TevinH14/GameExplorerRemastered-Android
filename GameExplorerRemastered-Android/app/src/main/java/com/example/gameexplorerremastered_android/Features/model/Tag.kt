package com.example.gameexplorerremastered_android.Features.model

import com.google.gson.annotations.SerializedName

data class Tag(
    @SerializedName("games_count") val games_count: Int,
    val id: Int,
    @SerializedName("image_background") val image_background: String,
    val language: String,
    val name: String,
    val slug: String
)