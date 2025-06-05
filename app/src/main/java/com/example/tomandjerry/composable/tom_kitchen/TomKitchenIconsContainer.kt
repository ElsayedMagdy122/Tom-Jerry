package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.White87
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun TomKitchenIconsContainer(modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        IconContainer(R.drawable.round_ruler, "High tension")
        Spacer(Modifier.height(16.dp))
        IconContainer(R.drawable.round_chef, "Shocking foods")
    }
}

@Composable
private fun IconContainer(img: Int, desc: String) {
    Row {
        Image(
            painter = painterResource(img),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(Modifier.width(8.dp))
        Text(
            text = desc,
            fontSize = 20.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.W500,
            textAlign = TextAlign.Center,
            color = White87,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TomKitchenIconsContainerPreview() {
    TomKitchenIconsContainer(Modifier)
}