package com.financeapp.uikit.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun FinanceText(
    modifier: Modifier = Modifier,
    text: String,
    style: TextStyle,
    @DrawableRes startIcon: Int? = null,
    @DrawableRes endIcon: Int? = null
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        startIcon?.let { icon ->
            Icon(painter = painterResource(id = icon), contentDescription = null)
            Spacer(modifier = modifier.width(6.dp))
        }
        Text(text = text, style = style)
        endIcon?.let { icon ->
            Spacer(modifier = modifier.width(6.dp))
            Icon(painter = painterResource(id = icon), contentDescription = null)
        }
    }
}