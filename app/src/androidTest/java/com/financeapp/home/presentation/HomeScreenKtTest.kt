package com.financeapp.home.presentation

import android.content.Context
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.financeapp.R
import com.financeapp.uikit.theme.FinanceAppTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@ExperimentalMaterial3Api
@RunWith(AndroidJUnit4::class)
class HomeScreenTest(){

    @get:Rule
    val composeTestRule = createComposeRule()

    lateinit var context: Context

    @Before
    fun setUp(){
        context = getApplicationContext<Context>().applicationContext
    }

    val viewState = HomeViewState(
        list = listOf(
            HomeBalanceItem(
                title = "Income",
                date = "Today",
                value = "+ $ 1,000.00",
                icon = R.drawable.ic_list_item
            ),
            HomeBalanceItem(
                title = "Income2",
                date = "01/01/2025",
                value = "+ $ 9,000.00",
                icon = R.drawable.ic_list_item
            )
        )
    )


    @Test
    fun checkLazyColumn(){
        // Given
        composeTestRule.setContent {
            FinanceAppTheme{
                ContentHomeScreen(viewState = viewState, intent = {})
            }
        }

        // Then
        for(i in viewState.list.indices){
            composeTestRule.onNodeWithText(viewState.list[i].title).assertIsDisplayed()
            composeTestRule.onNodeWithText(viewState.list[i].date).assertIsDisplayed()
            composeTestRule.onNodeWithText(viewState.list[i].value).assertIsDisplayed()
        }
    }

}