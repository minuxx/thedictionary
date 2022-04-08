package com.plcoding.dictionary.feature_dictionary.domain.model

data class WordInfo(
    val license: License,
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)