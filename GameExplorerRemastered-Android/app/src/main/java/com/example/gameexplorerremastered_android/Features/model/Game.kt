package com.example.gameexplorerremastered_android.Features.model

import com.example.gameexplorerremastered_android.Features.EsrbRating
import com.example.gameexplorerremastered_android.Features.Platform
import com.example.gameexplorerremastered_android.Features.Ratings
import com.google.gson.annotations.SerializedName


data class Game(
    val id: Int?,
    val slug: String?,
    val name: String?,
    val released: String?,
    val tba: Boolean?,
    @SerializedName("background_image") val backgroundImage: String?,
    val rating: Int?,
    @SerializedName("rating_top") val ratingTop: Int?,
    val ratings: Ratings?,
    @SerializedName("ratings_count") val ratingsCount: Int?,
    val reviews_text_count: String?,
    val metacritic: Int?,
    val playtime: Int?,
    @SerializedName("suggestions_count") val suggestionsCount: Int?,
    val updated: String?,
    val userGame: String? = null,
    val reviewsCount: Int? = null,

    val platforms: List<Platform>?,
    val added: Int?,
    @SerializedName("added_by_status") val addedByStatus: AddedByStatus?,
    val esrb_rating: EsrbRating?,

    val saturatedColor: String? = null,
    val dominantColor: String? = null,
    val parentPlatforms: List<Platform>? = null,
    val genres: List<Genre>? = null,
    val stores: List<GameStore>? = null,
    val clip: String? = null, // If clip is complex, create a separate data class
    val tags: List<Tag>? = null,
    @SerializedName("esrb_rating") val esrbRating: EsrbRating? = null,
    val shortScreenshots: List<Screenshot>? = null
)