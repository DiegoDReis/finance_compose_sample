package com.financeapp.uikit.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp

data class FinanceAppShapes (
    val tinyRounded: RoundedCornerShape = RoundedCornerShape(8.dp),
    val smallRounded: RoundedCornerShape = RoundedCornerShape(10.dp),
    val mediumRounded: RoundedCornerShape = RoundedCornerShape(20.dp),
    val largeRounded: RoundedCornerShape = RoundedCornerShape(40.dp)
)
