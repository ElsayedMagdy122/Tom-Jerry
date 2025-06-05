package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BorderDefault
import com.example.tomandjerry.ui.theme.ProfileBackground
import com.example.tomandjerry.ui.theme.White80
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun AddToCartContainer(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .border(width = 1.dp, color = BorderDefault)
            .background(color = White)
            .padding(vertical = 15.dp, horizontal = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = ProfileBackground, shape = RoundedCornerShape(16.dp))
                .padding(horizontal = 80.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            ) {
                Text(
                    text = "Add to cart",
                    fontSize = 16.sp,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.W500,
                    textAlign = TextAlign.Start,
                    color = White,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Spacer(Modifier.width(8.dp))
                Image(
                    painter = painterResource(R.drawable.ellipse_4),
                    contentDescription = null,
                    modifier = Modifier
                        .size(5.dp)
                        .align(Alignment.CenterVertically)
                )
                Spacer(Modifier.width(8.dp))
                Column(
                    modifier = Modifier.align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = "3 cheeses",
                        fontSize = 14.sp,
                        fontFamily = ibmPlexSansArabic,
                        fontWeight = FontWeight.W500,
                        textAlign = TextAlign.Start,
                        color = White,
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = "5 cheeses",
                        fontSize = 12.sp,
                        fontFamily = ibmPlexSansArabic,
                        fontWeight = FontWeight.W500,
                        textAlign = TextAlign.Start,
                        color = White80,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .drawBehind {
                                drawLine(
                                    color = White80,
                                    start = Offset(0f, 30f),
                                    end = Offset(size.width, 30f),
                                    strokeWidth = 3f
                                )
                            }
                    )
                }
            }
        }
    }
}