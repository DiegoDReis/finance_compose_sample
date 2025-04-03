package com.financeapp.home.di

import com.financeapp.R
import com.financeapp.home.presentation.HomeBalanceItem
import com.financeapp.home.presentation.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class HomeModule {

    fun getModule() = module {
        viewModel {
            HomeViewModel(
                listOf(
                    HomeBalanceItem(
                        title = "Income",
                        date = "Today",
                        value = "+ $ 1,000.00",
                        icon = R.drawable.ic_list_item
                    ),
                    HomeBalanceItem(
                        title = "Expanse",
                        date = "Today",
                        value = "- $ 91,000.00",
                        icon = R.drawable.ic_list_item,
                        isExpanse = true
                    ),
                    HomeBalanceItem(
                        title = "Expanse",
                        date = "Today",
                        value = "- $ 1,000.00",
                        icon = R.drawable.ic_list_item,
                        isExpanse = true
                    )
                ),
            )
        }
    }

}