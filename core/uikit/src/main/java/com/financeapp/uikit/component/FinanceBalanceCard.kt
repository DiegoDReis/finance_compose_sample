package com.financeapp.uikit.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.financeapp.uikit.R
import com.financeapp.uikit.theme.FinanceAppTheme.colors
import com.financeapp.uikit.theme.FinanceAppTheme.shapes
import com.financeapp.uikit.theme.FinanceAppTheme.textStyles

@ExperimentalMaterial3Api
@Composable
fun FinanceBalanceCard(
    modifier: Modifier,
    balanceValue: String,
    income: String,
    expenses: String
) {
    Card(
        modifier = modifier,
        onClick = {},
        colors = CardDefaults.cardColors(
            containerColor = colors.green40,
            contentColor = colors.white,
        ),
        shape = shapes.mediumRounded
    ) {
        Column(modifier = Modifier.padding(horizontal = 20.dp, vertical = 24.dp)) {
            FinanceText(
                text = "Total Balance",
                style = textStyles.bodyExtraLarge,
                endIcon = R.drawable.ic_chevron_up
            )

            FinanceText(
                text = balanceValue,
                style = textStyles.titleMedium,
            )

            Row(modifier = Modifier.padding(top = 32.dp)) {
                Column(modifier = Modifier.weight(1F)) {
                    FinanceText(
                        text = "Income",
                        style = textStyles.bodyLarge,
                        startIcon = R.drawable.ic_arrow_down
                    )
                    FinanceText(
                        text = income,
                        style = textStyles.subtitleLarge,
                    )
                }
                Column(modifier = Modifier.weight(1F), horizontalAlignment = Alignment.End) {
                    FinanceText(
                        text = "Expenses",
                        style = textStyles.bodyLarge,
                        startIcon = R.drawable.ic_arrow_up
                    )
                    FinanceText(
                        text = expenses,
                        style = textStyles.subtitleLarge,
                    )
                }
            }
        }
    }
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewFinanceBalanceCard() {
    FinanceBalanceCard(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        balanceValue = "$ 2580,00",
        income = "$200,00",
        expenses = "$200,00",
    )
}