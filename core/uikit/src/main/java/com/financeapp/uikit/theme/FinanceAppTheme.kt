package com.financeapp.uikit.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.financeapp.uikit.theme.values.Green40

private val LocalColorScheme = staticCompositionLocalOf { FinanceAppColors() }
private val LocalSpaces = staticCompositionLocalOf { FinanceAppSpaces() }
private val LocalTypography = staticCompositionLocalOf { FinanceAppTypography()}
private val LocalShapes = staticCompositionLocalOf { FinanceAppShapes()}
private val LocalSizes = staticCompositionLocalOf { FinanceAppSizes()}

@Composable
fun FinanceAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    CompositionLocalProvider(
        LocalColorScheme provides FinanceAppTheme.colors,
        LocalSpaces provides FinanceAppTheme.spaces,
        LocalTypography provides FinanceAppTheme.textStyles,
        LocalShapes provides FinanceAppTheme.shapes,
        LocalSizes provides FinanceAppTheme.sizes
    ) {

        val view = LocalView.current
        if (!view.isInEditMode) {
            SideEffect {
                val window = (view.context as Activity).window
                window.statusBarColor = Green40.toArgb()
                WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
            }
        }

        MaterialTheme(content = content)
    }
}

object FinanceAppTheme {

    val colors: FinanceAppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

    val spaces: FinanceAppSpaces
        @Composable
        @ReadOnlyComposable
        get() = LocalSpaces.current

    val textStyles: FinanceAppTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val shapes: FinanceAppShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    val sizes: FinanceAppSizes
        @Composable
        @ReadOnlyComposable
        get() = LocalSizes.current
}