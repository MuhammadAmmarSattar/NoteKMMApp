package com.ammar.notekmmapp.domain.note

import com.ammar.notekmmapp.presentation.BabyBlueHex
import com.ammar.notekmmapp.presentation.LightGreenHex
import com.ammar.notekmmapp.presentation.RedOrangeHex
import com.ammar.notekmmapp.presentation.RedPinkHex
import com.ammar.notekmmapp.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}