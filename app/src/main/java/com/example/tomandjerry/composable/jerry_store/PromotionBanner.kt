package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic


@Composable
fun PromotionBanner() {
    Box(
        Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
                .height(92.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF03446A),
                            Color(0xFF0685D0)
                        )
                    )
                )
        ) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .fillMaxHeight()
            ) {
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    "Buy 1 Tom and get 2 for free",
                    color = White,
                    fontSize = 16.sp,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .weight(1f),
                )
                Text(
                    "Adopt Tom! (Free Fail-Free \nGuarantee)",
                    color = White,
                    modifier = Modifier
                        .alpha(0.8f)
                        .padding(start = 12.dp)
                        .weight(1f),
                    fontSize = 12.sp,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Normal
                )
                Spacer(modifier = Modifier.height(12.dp))
            }

            Canvas(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                // inner oval in background
                drawOval(
                    color = Color.White.copy(alpha = 0.04f),
                    topLeft = Offset(size.width - 90.dp.toPx(), -10.dp.toPx()),
                    size = Size(100.dp.toPx(), size.height + 20.dp.toPx())
                )
                // outer oval in foreground
                drawOval(
                    color = Color.White.copy(alpha = 0.06f),
                    topLeft = Offset(size.width - 80.dp.toPx(), -10.dp.toPx()),
                    size = Size(100.dp.toPx(), size.height + 20.dp.toPx())
                )
            }

        }
        Image(
            painter = painterResource(R.drawable.tom_money_ic),
            contentDescription = null,
            modifier = Modifier
                .height(108.dp)
                .width(115.38.dp)
                .align(Alignment.BottomEnd)
                .offset(x = -16.dp, y = (-8).dp)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun PromotionBannerPrev() {
    PromotionBanner()
}