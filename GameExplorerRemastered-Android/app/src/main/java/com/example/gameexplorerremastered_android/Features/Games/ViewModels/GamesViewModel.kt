package com.example.gameexplorerremastered_android.Features.Games.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.gameexplorerremastered_android.Features.Services.RetrofitInstance
import com.example.gameexplorerremastered_android.Features.Games.model.Game

class GamesViewModel: ViewModel() {

    private val _game = MutableLiveData<List<Game>>()

    val games: LiveData<List<Game>> = _game

    private val apiKey = ""

    fun fetchGames() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getGames(apiKey)
                _game.value = response.results
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}