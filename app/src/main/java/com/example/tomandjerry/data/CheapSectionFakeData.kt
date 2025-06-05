package com.example.tomandjerry.data

import com.example.tomandjerry.R
import com.example.tomandjerry.model.Tom

val cheapSectionData: List<Tom> = listOf(
    Tom(
        title = "Sport Tom",
        description = "He runs 1 meter... trips over his boot.\n",
        imageRes = R.drawable.sporttom,
        price = "3 cheeses", discount = 5
    ),
    Tom(
        title = "Tom the lover",
        description = "He loves one-sidedly... \nand is beaten by the other \nside.",
        imageRes = R.drawable.tom_lover,
        price = "5 cheeses"
    ),
    Tom(
        title = "Tom the bomb",
        description = "He blows himself up \nbefore Jerry can catch \nhim.",
        imageRes = R.drawable.tom_bomb,
        price = "10 cheeses"
    ),
    Tom(
        title = "Spy Tom",
        description = "Disguises itself as a table",
        imageRes = R.drawable.spy_tom,
        price = "12 cheeses"
    ),
    Tom(
        title = "Frozen Tom",
        description = "He was chasing Jerry, he \nfroze after the first look",
        imageRes = R.drawable.frozen_tom,
        price = "10 cheeses"
    ),
    Tom(
        title = "Sleeping Tom",
        description = "He doesn't chase anyone, \nhe just snores in stereo.",
        imageRes = R.drawable.sleeping_tom,
        price = "10 cheeses"
    )
)