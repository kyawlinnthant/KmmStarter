package com.galaxytechno.starterkmm.repository

import com.galaxytechno.starterkmm.common.Endpoints
import com.galaxytechno.starterkmm.common.Resource
import com.galaxytechno.starterkmm.common.safeApiCall
import com.galaxytechno.starterkmm.model.QuoteDto
import com.galaxytechno.starterkmm.model.QuoteVo
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class QuotesRepositoryImpl(
    private val client : HttpClient
) : QuotesRepository {
    override suspend fun fetchNewQuote(): Flow<Resource<QuoteVo>> {
        val request = Endpoints.RANDOM_QUOTES
        return flow {
            emit(Resource.Loading())
            emit(
                safeApiCall(
                    response = client.request<QuoteDto>(request) {
                        method = HttpMethod.Get
                        headers {
                            append("X-RapidAPI-Host", "quotes15.p.rapidapi.com")
                            append("X-RapidAPI-Key", "07f30e529amsh5b76c41ec47f003p1d3919jsn46b185378310")
                        }
                        timeout {
                            requestTimeoutMillis = 2000L
                        }
                    }.toVo()
                )
            )
        }
    }
}