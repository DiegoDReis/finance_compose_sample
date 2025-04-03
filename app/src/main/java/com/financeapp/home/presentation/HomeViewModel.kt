package com.financeapp.home.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.financeapp.R

class HomeViewModel(private val list: List<HomeBalanceItem> = listOf()): ViewModel() {
    var viewState by mutableStateOf(HomeViewState())
        private set

    init {
        viewState = viewState.copy(list = list)
    }

    fun intent(intent: HomeIntent){
        when(intent){
            HomeIntent.AddItem -> addGenericItem()
            is HomeIntent.SetText -> viewState = viewState.copy(text = intent.text)
        }
    }


    private fun addGenericItem(){
        viewState = viewState.copy( list = addItem())
    }

    private fun addItem() = viewState.list.toMutableList().apply {
        add(HomeBalanceItem(
            title = "Income",
            date = "Today",
            value = "+ $ 1,000.00",
            icon = R.drawable.ic_list_item
        ))
    }
}