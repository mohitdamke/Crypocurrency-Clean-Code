package com.example.cryptocurrencyapp.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.input.key.Key.Companion.W
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Medium
import androidx.compose.ui.text.font.FontWeight.Companion.Normal
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cryptocurrencyapp.domain.model.Coin


@Composable
fun CoinListItem(
    coin: Coin, onItemClick: (Coin) -> Unit
) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .clickable { onItemClick(coin) }
        .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "${coin.rank}. ${coin.name} (${coin.symbol})",
            fontSize = 16.sp,
            fontWeight = Medium,
            overflow = TextOverflow.Ellipsis, modifier = Modifier.weight(0.8f)
        )
        Text(
            text = if (coin.is_active) {
                "active"
            } else {
                "inactive"
            },
            color = if (coin.is_active) {
                Green
            } else {
                Red
            },
            style = MaterialTheme.typography.bodyMedium,
            fontStyle = FontStyle.Italic,
            fontSize = 16.sp, modifier = Modifier
                .weight(0.2f)
                .align(Alignment.CenterVertically)
        )
    }
}