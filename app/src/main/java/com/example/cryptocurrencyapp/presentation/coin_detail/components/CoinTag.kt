package com.example.cryptocurrencyapp.presentation.coin_detail.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CoinTag(
    tag: String
) {
    Box(
        modifier = Modifier
            .padding(4.dp)
            .border(
                width = 2.dp,
                color = Green,
                shape = RoundedCornerShape(100.dp)
            )
            .padding(6.dp)
    ) {
        Text(
            text = tag,
            color = Green,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
        )
    }
}