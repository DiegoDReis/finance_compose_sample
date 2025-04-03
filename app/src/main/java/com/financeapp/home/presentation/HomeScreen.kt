package com.financeapp.home.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.financeapp.uikit.component.button.FinanceButton

@Composable
fun HomeScreen(homeViewModel: HomeViewModel) {

    ContentHomeScreen(homeViewModel.viewState) { homeViewModel.intent(it) }
}

@Composable
fun ContentHomeScreen(viewState: HomeViewState, intent: (HomeIntent) -> Unit = {}) {
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(viewState.list.size) { index ->
                HomeBalanceListItem(
                    modifier = Modifier.fillMaxWidth(),
                    item = viewState.list[index]
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}


@Preview
@Composable
private fun PreviewHomeScreen() {
    ContentHomeScreen(viewState = HomeViewState())
}