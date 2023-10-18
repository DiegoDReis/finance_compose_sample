package com.financeapp.uikit.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.financeapp.uikit.theme.FinanceAppTheme.colors
import com.financeapp.uikit.theme.FinanceAppTheme.shapes
import com.financeapp.uikit.theme.FinanceAppTheme.sizes
import com.financeapp.uikit.theme.FinanceAppTheme.textStyles

@Composable
fun FinanceButton(
    modifier: Modifier = Modifier,
    text: String,
    width: Dp,
    onClick: () -> Unit
) {

    var isClicked by remember {
        mutableStateOf(false)
    }

    val sizeAnimation = animateDpAsState(
        targetValue = if (isClicked) sizes.buttonSize else width,
    )

    Button(
        modifier = modifier
            .height(sizes.buttonSize)
            .width(sizeAnimation.value)
            .background(
                shape = shapes.largeRounded,
                brush = Brush.verticalGradient(colors = listOf(colors.green10, colors.green30))
            ),
        onClick = {
            onClick()
            isClicked = true
        },
        shape = shapes.largeRounded,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent,
            contentColor = colors.white,
        ),
        contentPadding = PaddingValues(0.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            FadeAnimatedVisibility(visible = isClicked) {
                CircularProgressIndicator(
                    modifier = Modifier.size(sizes.progressSize),
                    color = colors.white
                )
            }
            FadeAnimatedVisibility(visible = isClicked.not()) {
                Text(
                    text = text,
                    style = textStyles.subtitleMedium
                )
            }
        }
    }
}

@Composable
fun FadeAnimatedVisibility(
    visible: Boolean,
    content: @Composable() AnimatedVisibilityScope.() -> Unit
) {
    AnimatedVisibility(
        visible = visible,
        enter = fadeIn(),
        exit = fadeOut(),
        content = content
    )
}

@Preview
@Composable
private fun PreviewFinanceButton() {
    FinanceButton(
        text = "Get Started",
        modifier = Modifier,
        width = 300.dp
    ) {}
}