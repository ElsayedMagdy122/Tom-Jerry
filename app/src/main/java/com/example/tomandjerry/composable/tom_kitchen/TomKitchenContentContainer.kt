package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.AppBackground
import com.example.tomandjerry.ui.theme.HeaderText
import com.example.tomandjerry.ui.theme.StatValue
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun TomKitchenContentContainer(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = AppBackground,
                shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .weight(1f)
                .padding(top = 32.dp)
                .padding(horizontal = 16.dp)
        ) {
            ContentHeader()
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                fontSize = 14.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Start,
                color = StatValue,
                modifier = Modifier.align(Alignment.CenterHorizontally).alpha(0.60f),
            )
            Spacer(Modifier.height(24.dp))
            Text(
                text = "Details",
                fontSize = 18.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Start,
                color = HeaderText,
            )
            Spacer(Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                DetailsContainer(
                    Modifier.weight(1f),
                    R.drawable.round_temperature,
                    "1000 V",
                    "Temperature"
                )
                Spacer(Modifier.width(8.dp))
                DetailsContainer(Modifier.weight(1f), R.drawable.round_timer, "3 sparks", "Time")
                Spacer(Modifier.width(8.dp))
                DetailsContainer(
                    Modifier.weight(1f),
                    R.drawable.round_evil,
                    "1M 12K",
                    "No. of deaths"
                )
            }
            Spacer(Modifier.height(24.dp))
            Text(
                text = "Preparation method",
                fontSize = 18.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Start,
                color = HeaderText,
            )
            Spacer(Modifier.height(8.dp))
            PreparationContainer()
        }

        AddToCartContainer(Modifier)
    }
}

@Preview(showBackground = true)
@Composable
private fun TomKitchenContentContainerPreview() {
    TomKitchenContentContainer(Modifier)
}