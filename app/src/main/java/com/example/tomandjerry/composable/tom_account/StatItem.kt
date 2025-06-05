package com.example.tomandjerry.composable.tom_account

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.model.Cat
import com.example.tomandjerry.ui.theme.BlueLight
import com.example.tomandjerry.ui.theme.GrayBackground
import com.example.tomandjerry.ui.theme.BluePrimary
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun StatItem(
    modifier: Modifier = Modifier,
    cat: Cat,
    rotationAngle: Float = 90f,
    startAngle: Float = 180f,
    sweepAngle: Float = 270f
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(cat.cardBackGround)
            .width(160.dp)
            .height(56.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.size(40.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .rotate(rotationAngle),
                contentAlignment = Alignment.Center
            ) {
                Canvas(
                    modifier = Modifier
                        .size(38.dp)
                        .offset(x = 0.dp)
                ) {
                    drawArc(
                        color = cat.strokeColor,
                        startAngle = startAngle,
                        sweepAngle = sweepAngle,
                        useCenter = false,
                        style = Stroke(width = 1.dp.toPx(), cap = StrokeCap.Round)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(37.dp)
                    .clip(CircleShape)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(cat.iconRes),
                    contentDescription = null,
                    tint = cat.strokeColor,
                    modifier = Modifier.size(24.dp)
                )
            }
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .rotate(rotationAngle),
                contentAlignment = Alignment.Center
            ) {
                Canvas(
                    modifier = Modifier
                        .size(40.dp)

                ) {
                    val dotRadius = 2.5.dp.toPx()
                    val strokeWidth = 1.dp.toPx()
                    val angleInRadians = Math.toRadians((startAngle + sweepAngle).toDouble())

                    val radius = size.width / 2 - strokeWidth / 2

                    val centerX = size.width / 2 + cos(angleInRadians) * radius
                    val centerY = size.height / 2 + sin(angleInRadians) * radius

                    drawCircle(
                        color = cat.strokeColor,
                        radius = dotRadius,
                        center = Offset(centerX.toFloat(), centerY.toFloat())
                    )
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(vertical = 8.dp, horizontal = 10.dp)
                .align(Alignment.CenterVertically)
        ) {
            Text(
                text = cat.title,
                color = GrayBackground,
                fontSize = 16.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.alpha(0.60f)
            )
            Text(
                text = cat.desciption,
                color = GrayBackground,
                fontSize = 12.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.alpha(0.37f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StatItemPrev() {
    val myCat = Cat(
        title = "2M 12K",
        desciption = "No. of quarrels",
        iconRes = R.drawable.sad_01_1,
        cardBackGround = BlueLight, strokeColor = BluePrimary
    )
    StatItem(cat = myCat, startAngle = 180f, sweepAngle = 40f)


}