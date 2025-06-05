package com.example.tomandjerry.model

import androidx.compose.ui.graphics.Color


data class Cat(
    var title: String,
    var desciption: String,
    var iconRes: Int,
    var cardBackGround: Color,
    var strokeColor: Color, var sweepAngel: Float = 90f
)
