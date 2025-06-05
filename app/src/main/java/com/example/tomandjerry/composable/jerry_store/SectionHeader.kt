package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BluePrimary
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun SectionHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(30.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            modifier = modifier
                .padding(start = 16.dp)
                .weight(1f),
            text = "Cheap tom section",
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            color = Color.Black
        )
        Text(
            modifier = modifier.padding(end = 4.dp),
            text = "View all",
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            color = BluePrimary
        )
        Image(
            painter = painterResource(R.drawable.arrow_right_04),
            contentDescription = null,
            modifier = Modifier.padding(end = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SectionHeaderPrev() {
    SectionHeader()
}
