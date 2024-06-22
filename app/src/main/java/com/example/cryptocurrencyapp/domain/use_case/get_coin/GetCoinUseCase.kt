package com.example.cryptocurrencyapp.domain.use_case.get_coin

import android.util.Log
import com.example.cryptocurrencyapp.common.Resource
import com.example.cryptocurrencyapp.data.remote.dto.toCoinDetail
import com.example.cryptocurrencyapp.domain.model.CoinDetail
import com.example.cryptocurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(private val coinRepository: CoinRepository) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            Log.d("TAG", "invoke: $coinId")
            val coin = coinRepository.getCoinById(coinId).toCoinDetail()

            emit(Resource.Success(coin))

        } catch (e: Exception) {
            Log.d("TAG", "invoke: heeeee $coinId")

            emit(Resource.Error(e.message.toString()))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
            Log.d("TAG", "invoke: heeeee $coinId")
        } catch (e: IOException) {
            Log.d("TAG", "invoke: heeeee $coinId")
            emit(
                Resource.Error(
                    e.message ?: "Couldn't reach server. Check your internet connection"

                )
            )
        }
    }
}