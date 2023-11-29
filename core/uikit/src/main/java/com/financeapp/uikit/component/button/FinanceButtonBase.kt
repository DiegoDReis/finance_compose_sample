package com.financeapp.uikit.component.button

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.financeapp.uikit.theme.FinanceAppTheme.colors
import com.financeapp.uikit.theme.FinanceAppTheme.shapes
import com.financeapp.uikit.theme.FinanceAppTheme.sizes

@Composable
fun FinanceButtonBase(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    Button(
        modifier = modifier
            .height(sizes.buttonSize)
            .background(
                shape = shapes.largeRounded,
                brush = Brush.verticalGradient(colors = listOf(colors.green10, colors.green30))
            ),
        onClick = onClick,
        shape = shapes.largeRounded,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = colors.white,
        ),
        contentPadding = PaddingValues(0.dp),
        content = content
    )
}
