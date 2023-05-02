package com.ammar.notekmmapp.domain

import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val date: String,
    val img: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
//    companion object {
//        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)
//
//        fun generateRandomColor() = colors.random()
//    }
}