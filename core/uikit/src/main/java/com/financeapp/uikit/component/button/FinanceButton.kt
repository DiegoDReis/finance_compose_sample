package com.financeapp.uikit.component.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.financeapp.uikit.theme.FinanceAppTheme

@Composable
fun FinanceButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    FinanceButtonBase(modifier = modifier, onClick = onClick) {
        Text(
            text = text,
            style = FinanceAppTheme.textStyles.subtitleMedium
        )
    }
}

@Preview
@Composable
private fun PreviewFinanceButton() {
    FinanceButton(
        modifier = Modifier.fillMaxWidth(),
        text = "Get Started"){
    }
}