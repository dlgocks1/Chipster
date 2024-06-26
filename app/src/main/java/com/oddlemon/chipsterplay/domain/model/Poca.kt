package com.oddlemon.chipsterplay.domain.model

data class Poca(
    val id: Int,
    val address: String,
    val content: String,
    val img: String,
    val latitude: Double,
    val level: Int? = 1,
    val longitude: Double,
    val name: String,
    val number: Int,
    val representStatus: Int
)