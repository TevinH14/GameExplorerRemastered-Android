package com.example.gameexplorerremastered_android.features.games.model

import com.google.gson.annotations.SerializedName

data class RawgResponse(
    val count: Int,
    val next: String,
    val previous: String,
    @SerializedName("results") val results: List<Game>
)