package com.example.tomandjerry.data

import com.example.tomandjerry.R
import com.example.tomandjerry.model.Cat
import com.example.tomandjerry.ui.theme.BlueLight
import com.example.tomandjerry.ui.theme.BluePrimary
import com.example.tomandjerry.ui.theme.GreenPrimary
import com.example.tomandjerry.ui.theme.GreenSurface
import com.example.tomandjerry.ui.theme.PinkPrimary
import com.example.tomandjerry.ui.theme.PinkSurface
import com.example.tomandjerry.ui.theme.YellowPrimary
import com.example.tomandjerry.ui.theme.YellowSurface

val statItems = listOf(
    Cat(
        title = "2M 12K",
        desciption = "No. of quarrels",
        iconRes = R.drawable.evil,
        cardBackGround = BlueLight, strokeColor = BluePrimary, sweepAngel = 220f
    ),
    Cat(
        title = "+500 h",
        desciption = "Chase time",
        iconRes = R.drawable.workout_run,
        cardBackGround = GreenSurface, strokeColor = GreenPrimary, sweepAngel = 70f
    ),
    Cat(
        title = "2M 12K",
        desciption = "Hunting times",
        iconRes = R.drawable.sad_01_1,
        cardBackGround = PinkSurface, strokeColor = PinkPrimary, sweepAngel = 330f
    ),
    Cat(
        title = "3M 7K",
        desciption = "Heartbroken",
        iconRes = R.drawable.heartbreak,
        cardBackGround = YellowSurface, strokeColor = YellowPrimary, sweepAngel = 40f
    )
)