package com.example.gameexplorerremastered_android.Features.Games.model

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
    val added: Int?,
    @SerializedName("added_by_status") val addedByStatus: AddedByStatus?,
    val metacritic: Int?,
    val playtime: Int?,
    @SerializedName("suggestions_count") val suggestionsCount: Int?,
    val updated: String?,
    val userGame: String?,
    val reviewsCount: Int?,
    val saturatedColor: String?,
    val dominantColor: String?,
    @SerializedName("parent_platforms") val parentPlatforms: List<Platform>?,
    val genres: List<Genre>?,
    val stores: List<GameStore>?,
    val tags: List<Tag>? = null,
    val clip: String? = null, // If clip is complex, create a separate data class
    @SerializedName("esrb_rating") val esrbRating: EsrbRating?,
    val shortScreenshots: List<ScreenShot>? = null
)