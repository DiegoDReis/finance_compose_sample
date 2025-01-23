package com.financeapp.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.financeapp.uikit.component.button.FinanceButton

@Composable
fun HomeScreen(homeViewModel: HomeViewModel) {
    ContentHomeScreen(homeViewModel.viewState)
}

@Composable
fun ContentHomeScreen(viewState: HomeViewState, intent: ()->Unit = {}){
    Column {
        LazyColumn(modifier = Modifier.fillMaxWidth()){
            items(viewState.list.size) { index ->
                HomeBalanceListItem(modifier = Modifier.fillMaxWidth(), item = viewState.list[index])
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
        FinanceButton(text = "Confirmar") {

        }
    }
}

@Preview
@Composable
private fun PreviewHomeScreen() {
    ContentHomeScreen(viewState = HomeViewState())
}