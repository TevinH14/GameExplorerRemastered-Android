package com.example.gameexplorerremastered_android.features.games.model

import com.google.gson.annotations.SerializedName

data class Game(
    val id: Int?,
    val slug: String?,
    val name: String?,
    val released: String?,
    val tba: Boolean?,
    @SerializedName("background_image") val backgroundImage: String?,
    val rating: Double?,
    @SerializedName("rating_top") val ratingTop: Int?,
    val ratings: List<Rating>?,
    @SerializedName("ratings_count") val ratingsCount: Int?,
    @SerializedName("reviews_text_count")val reviewsTextCount: Int?,
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
) {
    companion object {
        fun preview() = Game(
            id = 3498,
            slug = "grand-theft-auto-v",
            name = "Grand Theft Auto V",
            released = "2013-09-01",
            tba = false,
            backgroundImage = "https://media.rawg.io/media/games/20a/20aa03a10cda45239fe22d035c0ebe64.jpg",
            rating = 4.47,
            ratingTop = 5,
            ratings = listOf(
                Rating(id = 5, title = "exceptional", count = 4299, percent = 59.02),
                Rating(id = 4, title = "recommended", count = 2380, percent = 32.67),
                Rating(id = 3, title = "meh", count = 464, percent = 6.37),
                Rating(id = 1, title = "skip", count = 141, percent = 1.94)
            ),
            ratingsCount = 7168,
            reviewsTextCount = 67,
            added = 22148,
            addedByStatus = AddedByStatus(
                yet = 554,
                owned = 12745,
                beaten = 6294,
                toplay = 630,
                dropped = 1168,
                playing = 757
            ),
            metacritic = 92,
            playtime = 74,
            suggestionsCount = 441,
            updated = "2025-07-28T22:32:47",
            userGame = null,
            reviewsCount = 7284,
            saturatedColor = "0f0f0f",
            dominantColor = "0f0f0f",
            parentPlatforms = listOf(
                Platform(id = 1, name = "PC", slug = "pc"),
                Platform(id = 2, name = "PlayStation", slug = "playstation"),
                Platform(id = 3, name = "Xbox", slug = "xbox")
            ),
            genres = listOf(
                Genre(
                    id = 4,
                    name = "Action",
                    slug = "action",
                    gamesCount = 188571,
                    imageBackground = "https://media.rawg.io/media/games/34b/34b1f1850a1c06fd971bc6ab3ac0ce0e.jpg"
                )
            ),
            stores = listOf(
                GameStore(
                    id = 290376,
                    store = StoreDetail(
                        id = 1,
                        name = "Steam",
                        slug = "steam",
                        domain = "store.steampowered.com",
                        gamesCount = 115464,
                        imageBackground = "https://media.rawg.io/media/games/20a/20aa03a10cda45239fe22d035c0ebe64.jpg"
                    )
                ),
                GameStore(
                    id = 290375,
                    store = StoreDetail(
                        id = 3,
                        name = "PlayStation Store",
                        slug = "playstation-store",
                        domain = "store.playstation.com",
                        gamesCount = 8055,
                        imageBackground = "https://media.rawg.io/media/games/73e/73eecb8909e0c39fb246f457b5d6cbbe.jpg"
                    )
                )
            ),
            esrbRating = EsrbRating(
                id = 4,
                name = "Mature",
                slug = "mature"
            ),
            shortScreenshots = listOf(
                ScreenShot(id = -1, image = "https://media.rawg.io/media/games/20a/20aa03a10cda45239fe22d035c0ebe64.jpg"),
                ScreenShot(id = 1827221, image = "https://media.rawg.io/media/screenshots/a7c/a7c43871a54bed6573a6a429451564ef.jpg"),
                ScreenShot(id = 1827222, image = "https://media.rawg.io/media/screenshots/cf4/cf4367daf6a1e33684bf19adb02d16d6.jpg"),
                ScreenShot(id = 1827223, image = "https://media.rawg.io/media/screenshots/f95/f9518b1d99210c0cae21fc09e95b4e31.jpg")
            )
        )
    }
}