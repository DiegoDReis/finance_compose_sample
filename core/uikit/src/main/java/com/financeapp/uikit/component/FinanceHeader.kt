package com.financeapp.uikit.component

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.financeapp.uikit.R
import com.financeapp.uikit.theme.FinanceAppTheme

@Composable
fun FinanceHeader(modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    val radius = configuration.screenWidthDp.dp.times(3)
    val height = radius.div(2)
    val startColor = FinanceAppTheme.colors.green20
    val endColor = FinanceAppTheme.colors.green40
    Box(modifier = modifier) {
        Canvas(
            modifier = Modifier
                .offset(x = 0.dp, y = radius.times(-1))
                .align(Alignment.BottomCenter), onDraw = {
                drawCircle(
                    brush = Brush.verticalGradient(
                        colors = listOf(startColor, endColor),
                        startY = height.toPx(),
                        endY = radius.toPx()
                    ),
                    radius = radius.toPx()
                )
            })
        Image(
            painter = painterResource(id = R.drawable.ic_header_backgroud),
            contentDescription = null
        )
    }
}

@Composable
@Preview
private fun PreviewFinanceHeader() {
    FinanceHeader(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.3F))
}