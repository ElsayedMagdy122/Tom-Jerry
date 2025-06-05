package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.BlueLight
import com.example.tomandjerry.ui.theme.StatLabel
import com.example.tomandjerry.ui.theme.StatValue
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun DetailsContainer(modifier: Modifier, img: Int, title: String, content: String) {

    Box(
        modifier = modifier
            .background(color = BlueLight, shape = RoundedCornerShape(12.dp))
            .padding(12.dp)
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
            Spacer(Modifier.height(12.dp))
            Text(
                text = title,
                fontSize = 14.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center,
                color = StatValue,
            )
            Spacer(Modifier.height(2.dp))
            Text(
                text = content,
                fontSize = 12.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center,
                color = StatLabel,
            )
        }
    }
}