package com.financeapp.uikit.theme

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun FinanceButton(modifier: Modifier = Modifier) {
    Button(
        modifier = modifier.height(64.dp), onClick = { /*TODO*/ },
        shape = FinanceAppTheme.shapes.largeRounded,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = FinanceAppTheme.colors.white
        )
    ) {
        Text(
            text = "Testando",
            style = FinanceAppTheme.textStyles.subtitleMedium
        )
    }
}

@Preview
@Composable
private fun PreviewFinanceButton() {

    FinanceButton()
}