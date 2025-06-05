package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.KitchenOverlay

@Composable
fun TomKitchenPastaBackground() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(color = KitchenOverlay)
    )
    {
        Image(
            painter = painterResource(R.drawable.ellipse3),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.TopStart)
                .scale(1.2f)
        )
        TomKitchenIconsContainer(
            Modifier
                .align(Alignment.TopStart)
                .padding(top = 78.dp, start = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TomKitchenPastaBackgroundPreview() {
    TomKitchenPastaBackground()
}