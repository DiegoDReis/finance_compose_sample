package com.financeapp.uikit.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.financeapp.uikit.theme.values.BaseFontFamily
import com.financeapp.uikit.theme.values.ExtraLargeFontSize
import com.financeapp.uikit.theme.values.ExtraMediumLargeFontSize
import com.financeapp.uikit.theme.values.ExtraSmallFontSize
import com.financeapp.uikit.theme.values.LargeFontSize
import com.financeapp.uikit.theme.values.MediumFontSize
import com.financeapp.uikit.theme.values.NormalFontSize
import com.financeapp.uikit.theme.values.SmallFontSize
import com.financeapp.uikit.theme.values.TinyFontSize

data class FinanceAppTypography(

    val titleLarge: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W700,
        fontSize = ExtraLargeFontSize,
        letterSpacing = ExtraLargeFontSize.times(other = -0.02F)
    ),
    val titleMedium: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W700,
        fontSize = LargeFontSize,
        letterSpacing = ExtraLargeFontSize.times(other = -0.05F)
    ),
    val subtitleLarge: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = ExtraMediumLargeFontSize,
    ),
    val subtitleMedium: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = MediumFontSize,
        letterSpacing = MediumFontSize.times(other = -0.02F)
    ),
    val subtitleNormal: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = MediumFontSize,
        letterSpacing = MediumFontSize.times(other = -0.04F)
    ),
    val bodyExtraLarge: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = MediumFontSize,
    ),
    val bodyLarge: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = NormalFontSize,
        letterSpacing = NormalFontSize.times(other = -0.02F)
    ),
    val bodyMedium: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W600,
        fontSize = ExtraSmallFontSize,
    ),
    val bodyNormal: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = ExtraSmallFontSize,
    ),
    val bodySmall: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W400,
        fontSize = SmallFontSize,
    ),
    val bodyTiny: TextStyle = TextStyle(
        fontFamily = BaseFontFamily,
        fontWeight = FontWeight.W500,
        fontSize = TinyFontSize,
    )

)
