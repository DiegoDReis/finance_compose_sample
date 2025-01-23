package com.financeapp.home.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.financeapp.uikit.theme.FinanceAppTheme.colors
import com.financeapp.uikit.theme.FinanceAppTheme.shapes
import com.financeapp.uikit.theme.FinanceAppTheme.sizes
import com.financeapp.uikit.theme.FinanceAppTheme.textStyles


@Composable
fun HomeBalanceListItem(modifier: Modifier = Modifier, item: HomeBalanceItem) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = Modifier
                    .background(color = colors.gray10, shape = shapes.tinyRounded)
                    .padding(sizes.listItemImagePadding)
            ) {
                Image(
                    modifier = Modifier.size(sizes.listItemImageSize),
                    painter = painterResource(id = item.icon),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.width(sizes.listItemImagePadding))
            Column {
                Text(text = item.title, style = textStyles.bodyExtraMedium, color = colors.black)
                Text(text = item.date, style = textStyles.bodyNormal, color = colors.gray20)
            }
        }
        Text(
            text = item.value,
            style = textStyles.subtitleNormal,
            color = if (item.isExpanse) colors.warnings else colors.success
        )
    }
}