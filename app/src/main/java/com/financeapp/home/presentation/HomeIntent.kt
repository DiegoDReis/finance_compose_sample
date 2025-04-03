package com.financeapp.home.presentation

sealed class HomeIntent {

    object AddItem: HomeIntent()
    data class SetText(val text: String): HomeIntent()
}