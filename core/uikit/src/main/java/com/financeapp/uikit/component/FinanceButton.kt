package com.financeapp.uikit.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.TweenSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.financeapp.uikit.theme.FinanceAppTheme
import com.financeapp.uikit.theme.FinanceAppTheme.colors
import com.financeapp.uikit.util.NoRippleInteractionSource

@Composable
fun FinanceButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val buttonAnimationColor = animateColorAsState(
        targetValue = if (isPressed) colors.green40 else colors.warnings,
        animationSpec = TweenSpec(durationMillis = 1000)
    )

    Button(
        modifier = modifier
            .height(FinanceAppTheme.sizes.buttonSize)
            .background(
                shape = FinanceAppTheme.shapes.largeRounded,
                color = buttonAnimationColor.value
            ),
        interactionSource = interactionSource,
        onClick = onClick,
        shape = FinanceAppTheme.shapes.largeRounded,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = colors.white
        )
    ) {
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
        text = "Get Started",
        modifier = Modifier.fillMaxWidth()
    ) {}
}