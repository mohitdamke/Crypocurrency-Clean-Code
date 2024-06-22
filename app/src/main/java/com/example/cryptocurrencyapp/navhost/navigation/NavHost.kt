package com.example.cryptocurrencyapp.navhost.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cryptocurrencyapp.navhost.screen.Screens
import com.example.cryptocurrencyapp.presentation.coin_detail.components.CoinDetailScreen
import com.example.cryptocurrencyapp.presentation.coin_list.components.CoinListScreen


@Composable
fun NavHost(paddingValues: PaddingValues) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.CoinListScreen.route) {
        composable(
            route = Screens.CoinListScreen.route
        ) {
            CoinListScreen(navController)
        }
        composable(
            route = Screens.CoinDetailScreen.route + "/{coinId}"
        ) {
            CoinDetailScreen()
        }
    }
}
