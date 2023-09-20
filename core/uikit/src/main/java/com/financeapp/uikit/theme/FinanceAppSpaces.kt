package com.financeapp.uikit.theme

import androidx.compose.ui.unit.Dp
import com.financeapp.uikit.theme.values.Large
import com.financeapp.uikit.theme.values.Medium
import com.financeapp.uikit.theme.values.Small
import com.financeapp.uikit.theme.values.XLarge
import com.financeapp.uikit.theme.values.XMedium
import com.financeapp.uikit.theme.values.XSmall
import com.financeapp.uikit.theme.values.XxLarge
import com.financeapp.uikit.theme.values.XxMedium
import com.financeapp.uikit.theme.values.XxSmall

data class FinanceAppSpaces(
    val small: Dp = Small,
    val xSmall: Dp = XSmall,
    val xxSmall: Dp = XxSmall,
    val medium: Dp = Medium,
    val xMedium: Dp = XMedium,
    val xxMedium: Dp = XxMedium,
    val large: Dp = Large,
    val xLarge: Dp = XLarge,
    val xxLarge: Dp = XxLarge
)
