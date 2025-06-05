package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.HeaderText
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun ContentHeader() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Electric Tom pasta",
                fontSize = 20.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center,
                color = HeaderText,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            Spacer(Modifier.height(12.dp))
            ProductPriceContainer()
        }

        Image(
            painter = painterResource(R.drawable.round_heart),
            contentDescription = null,
        )
    }
}