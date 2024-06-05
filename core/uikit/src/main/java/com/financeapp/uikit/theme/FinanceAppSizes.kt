package com.financeapp.uikit.theme

import androidx.compose.ui.unit.Dp
import com.financeapp.uikit.theme.values.ButtonSize
import com.financeapp.uikit.theme.values.ListItemImagePadding
import com.financeapp.uikit.theme.values.ListItemImageSize
import com.financeapp.uikit.theme.values.ProgressSize

data class FinanceAppSizes(
    val buttonSize: Dp = ButtonSize,
    val progressSize: Dp = ProgressSize,
    val listItemImageSize: Dp = ListItemImageSize,
    val listItemImagePadding: Dp = ListItemImagePadding
)
