package com.galaxytechno.starterkmm.repository

import com.galaxytechno.starterkmm.common.Resource
import com.galaxytechno.starterkmm.model.QuoteVo
import kotlinx.coroutines.flow.Flow

interface QuotesRepository {
    suspend fun fetchNewQuote(): Flow<Resource<QuoteVo>>
}