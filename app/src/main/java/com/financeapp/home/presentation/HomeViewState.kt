package com.financeapp.home.presentation

data class HomeViewState(
    val list: List<HomeBalanceItem> = listOf(),
    val isLoading: Boolean = false,
    val text : String = ""
)
