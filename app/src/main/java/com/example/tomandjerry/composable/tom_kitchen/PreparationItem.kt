package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.BlueLight
import com.example.tomandjerry.ui.theme.PreparationColor
import com.example.tomandjerry.ui.theme.StatValue
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun PreparationItem(stepNum: String, stepDesc: String) {
    Box {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(x = 20.dp)
                .background(
                    color = White,
                    shape = RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp)
                )
                .padding(vertical = 8.dp)
                .padding(start = 25.dp, end = 10.dp)
        ) {
            Row {
                Text(
                    text = stepDesc,
                    fontSize = 14.sp,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.W400,
                    textAlign = TextAlign.Start,
                    color = StatValue,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
        }

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(37.dp)
                .clip(CircleShape)
                .border(width = 1.dp, color = BlueLight, shape = CircleShape)
                .background(color = White, shape = CircleShape)
        ) {
            Text(
                text = stepNum,
                fontSize = 12.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center,
                color = PreparationColor,
            )
        }


    }
}