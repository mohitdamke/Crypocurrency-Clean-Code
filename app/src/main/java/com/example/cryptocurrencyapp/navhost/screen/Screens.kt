package com.example.cryptocurrencyapp.navhost.screen

sealed class Screens(val route: String) {

    object CoinListScreen : Screens("coin_list_screen")
    object CoinDetailScreen : Screens("coin_detail_screen")
}