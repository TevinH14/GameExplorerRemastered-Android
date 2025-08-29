package com.example.gameexplorerremastered_android.Features.model

import com.example.gameexplorerremastered_android.Features.AddedByStatus
import com.example.gameexplorerremastered_android.Features.EsrbRating
import com.example.gameexplorerremastered_android.Features.Platform
import com.example.gameexplorerremastered_android.Features.Ratings
import com.google.gson.annotations.SerializedName


data class Game(
    val id: Int,
    val slug: String,
    val name: String,
    val released: String,
    val tba: Boolean,
    @SerializedName("background_image") val backgroundImage: String,
    val rating: Int,
    @SerializedName("rating_top") val ratingTop: Int,
    val ratings: Ratings,
    val ratings_count: Int,
    val added: Int,
    val added_by_status: AddedByStatus,
    val esrb_rating: EsrbRating,
    val metacritic: Int,
    val platforms: List<Platform>,
    val playtime: Int,
    val reviews_text_count: String,
    val suggestions_count: Int,
    val updated: String
)