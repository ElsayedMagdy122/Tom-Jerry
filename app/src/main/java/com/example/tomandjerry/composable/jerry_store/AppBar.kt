package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BluePrimary
import com.example.tomandjerry.ui.theme.GrayDark
import com.example.tomandjerry.ui.theme.GrayLight
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun AppBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(R.drawable.profile_image),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 16.dp, top = 4.dp, bottom = 4.dp, end = 8.dp)
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
        )
        Column(
            modifier = Modifier
                .padding(vertical = 4.dp)
        ) {
            Text(
                "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                color = GrayDark,
                modifier = Modifier
                    .padding(top = 4.5.dp)
                    .weight(1f),
                fontSize = 14.sp,
                fontFamily = ibmPlexSansArabic, fontWeight = FontWeight.Medium
            )
            Text(
                "Which Tom do you want to buy?", color = GrayLight,
                modifier = Modifier
                    .padding(bottom = 4.5.dp)
                    .weight(1f),
                fontSize = 12.sp,
                fontFamily = ibmPlexSansArabic, fontWeight = FontWeight.Normal
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier
                .padding(end = 16.dp)
                .size(40.dp),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .matchParentSize()
                    .border(
                        width = 1.dp,
                        color = GrayLight,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .clip(RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.notification_01),
                    contentDescription = "Notifications",
                    modifier = Modifier.size(24.dp)
                )
            }

            Badge(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 4.dp, y = (-3).dp),
                containerColor = BluePrimary,
                contentColor = Color.White
            ) {
                Text(
                    "3",
                    fontSize = 10.sp,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ActionBarPrev() {
    AppBar()
}