package com.example.gameexplorerremastered_android.Features.model

data class Results(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Game>
)