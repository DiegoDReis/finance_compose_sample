package com.financeapp.home.presentation

data class HomeBalanceItem(
    val title: String,
    val date: String,
    val value: String,
    @androidx.annotation.DrawableRes
    val icon: Int,
    val isExpanse: Boolean = false
)
