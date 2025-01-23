package com.financeapp.home.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewModel(private val list: List<HomeBalanceItem> = listOf()): ViewModel() {
    var viewState by mutableStateOf(HomeViewState())
        private set

    init {
        viewState = viewState.copy(list = list)
    }
}