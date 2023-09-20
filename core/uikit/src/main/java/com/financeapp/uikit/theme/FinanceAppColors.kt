package com.financeapp.uikit.theme

import androidx.compose.ui.graphics.Color
import com.financeapp.uikit.theme.values.Black
import com.financeapp.uikit.theme.values.Gray10
import com.financeapp.uikit.theme.values.Gray20
import com.financeapp.uikit.theme.values.Gray30
import com.financeapp.uikit.theme.values.Green10
import com.financeapp.uikit.theme.values.Green20
import com.financeapp.uikit.theme.values.Green30
import com.financeapp.uikit.theme.values.Green40
import com.financeapp.uikit.theme.values.GreenSuccess
import com.financeapp.uikit.theme.values.RedWarning
import com.financeapp.uikit.theme.values.White

data class FinanceAppColors(
    val green10: Color = Green10,
    val green20: Color= Green20,
    val green30: Color= Green30,
    val green40: Color= Green40,

    val success: Color = GreenSuccess,
    val warnings: Color = RedWarning,

    val white: Color = White,
    val gray10: Color= Gray10,
    val gray20: Color = Gray20,
    val gray30: Color = Gray30,
    val black: Color = Black

)
