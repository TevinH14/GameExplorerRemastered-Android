package com.example.gameexplorerremastered_android.features.games.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.gameexplorerremastered_android.BuildConfig
import com.example.gameexplorerremastered_android.resourses.Services.RetrofitInstance
import com.example.gameexplorerremastered_android.features.games.model.Game
import kotlinx.coroutines.Dispatchers

class GamesViewModel: ViewModel() {

    private val _game = MutableLiveData<List<Game>>()
    val games: LiveData<List<Game>> = _game

    fun fetchGames() {
        // Use Dispatchers.IO for network/disk operations
        viewModelScope.launch(Dispatchers.IO) {
            try {
                // Your actual network call (e.g., using Retrofit)
                val response = RetrofitInstance.api.getGames()
                _game.postValue(response.results)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}