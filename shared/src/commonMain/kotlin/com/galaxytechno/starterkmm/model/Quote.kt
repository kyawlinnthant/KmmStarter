package com.galaxytechno.starterkmm.model

import kotlinx.serialization.Serializable

@Serializable
data class QuoteDto(
    val id: Long,
    val language_code: String,
    val originator: Originator,
    val content: String,
    val tags: List<String>,
    val url: String,
) {
    fun toVo(): QuoteVo {
        return QuoteVo(
            id = id,
            data = content,
            writer = originator.name,
            tags = tags,
        )
    }
}

@Serializable
data class Originator(
    val id: Int,
    val name: String,
    val url: String
)

@Serializable
data class QuoteVo(
    val id: Long = -1L,
    val data: String = "",
    val writer: String = "",
    val tags: List<String> = listOf(),
)