package com.example.gameexplorerremastered_android.features.games.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.gameexplorerremastered_android.BuildConfig
import com.example.gameexplorerremastered_android.resourses.Services.RetrofitInstance
import com.example.gameexplorerremastered_android.features.games.model.Game
import com.example.gameexplorerremastered_android.resourses.utils.GameDate
import kotlinx.coroutines.Dispatchers

class GamesViewModel: ViewModel() {

    private val _recentReleasedGames = MutableLiveData<List<Game>>()
    val recentReleasedGames: LiveData<List<Game>> = _recentReleasedGames


    // template to write a function to fetch games
//    fun fetchGames() {
//        // Use Dispatchers.IO for network/disk operations
//        viewModelScope.launch(Dispatchers.IO) {
//            try {
//                // Your actual network call (e.g., using Retrofit)
//                val response = RetrofitInstance.api.getGames()
//                _game.postValue(response.results)
//            } catch (e: Exception) {
//                e.printStackTrace()
//            }
//        }
//    }

    fun fetchRecentReleasedGames() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val today = GameDate.getDate()
                val (startDate, endDate) = GameDate.getTheLast30Days(today)

                val dateQuery = "$startDate,$endDate"

                val response = RetrofitInstance.api.getGames(
                    dates = dateQuery,
                    ordering = "-added"
                )

                _recentReleasedGames.postValue(response.results)

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}