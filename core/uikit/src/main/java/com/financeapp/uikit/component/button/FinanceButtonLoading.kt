package com.financeapp.uikit.component.button

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.financeapp.uikit.theme.FinanceAppTheme

@Composable
fun FinanceButtonLoading(
    modifier: Modifier = Modifier,
    text: String,
    width: Dp,
    onClick: () -> Unit
) {

    var isClicked by remember {
        mutableStateOf(false)
    }

    val sizeAnimation by animateDpAsState(
        targetValue = if (isClicked) FinanceAppTheme.sizes.buttonSize else width,
        label = String()
    )

    FinanceButtonBase(
        modifier = modifier.width(sizeAnimation),
        onClick = {
            isClicked = true
            onClick()
        }
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            FadeAnimatedVisibility(visible = isClicked) {
                CircularProgressIndicator(
                    modifier = Modifier.size(FinanceAppTheme.sizes.progressSize),
                    color = FinanceAppTheme.colors.white
                )
            }
            FadeAnimatedVisibility(visible = isClicked.not()) {
                Text(
                    text = text,
                    style = FinanceAppTheme.textStyles.subtitleMedium
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
private fun PreviewFinanceButtonLoading() {
    FinanceButtonLoading(
        text = "Get Started",
        width = 300.dp
    ) {

    }
}