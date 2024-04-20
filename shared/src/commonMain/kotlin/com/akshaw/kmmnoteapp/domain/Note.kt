package com.akshaw.kmmnoteapp.domain

import com.akshaw.kmmnoteapp.presentation.BabyBlueHex
import com.akshaw.kmmnoteapp.presentation.LightGreenHex
import com.akshaw.kmmnoteapp.presentation.RedOrangeHex
import com.akshaw.kmmnoteapp.presentation.RedPinkHex
import com.akshaw.kmmnoteapp.presentation.VioletHex
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
