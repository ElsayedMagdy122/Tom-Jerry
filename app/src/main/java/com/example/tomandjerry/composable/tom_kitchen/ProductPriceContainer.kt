package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BlueLight
import com.example.tomandjerry.ui.theme.BluePrimary
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun ProductPriceContainer() {
    Card(
        colors = CardDefaults.cardColors(containerColor = BlueLight),
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(30.dp)
                .clip(RoundedCornerShape(8.dp))
                .padding(horizontal = 8.dp, vertical = 4.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(R.drawable.money_bag),
                contentDescription = null,
                colorFilter = ColorFilter.tint(BluePrimary),
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(Modifier.width(4.dp))
            Text(
                text = "5 Cheeses",
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp,
                color = BluePrimary,
                textAlign = TextAlign.Start,
                modifier = Modifier.align(Alignment.Bottom)
            )
        }
    }
}