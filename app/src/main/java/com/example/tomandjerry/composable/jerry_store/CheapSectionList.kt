package com.example.tomandjerry.composable.jerry_store

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.data.cheapSectionData
import com.example.tomandjerry.model.Tom
import com.example.tomandjerry.ui.theme.AppBackground
import com.example.tomandjerry.ui.theme.Black
import com.example.tomandjerry.ui.theme.BluePrimary
import com.example.tomandjerry.ui.theme.GrayMedium
import com.example.tomandjerry.ui.theme.BlueExtraLight
import com.example.tomandjerry.ui.theme.White
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CheapSection() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .background(AppBackground)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .height(745.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        items(cheapSectionData) { item ->
            ProductCard(item)
        }
    }
}

@Composable
fun ProductCard(tom: Tom) {
    Box(
        modifier = Modifier
            .padding(top = 28.dp)
            .height(219.dp)
            .width(160.dp)
            .background(White, shape = RoundedCornerShape(8.dp)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .height(81.dp)
                .fillMaxWidth()
                .align(Alignment.Center)
                .offset(x = 0.dp, y = 18.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(

                text = tom.title,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                color = Black
            )
            Text(
                text = tom.description,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
                color = GrayMedium
            )
        }
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 2.dp)
                .padding(bottom = 6.dp)
                .height(30.dp)
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .clip(RoundedCornerShape(8.dp))
                    .background(BlueExtraLight),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.money_bag_01),
                    contentDescription = null,
                    modifier = Modifier.padding(start = 12.dp, end = 4.dp)
                )
                if (tom.discount > 0) {
                    Text(
                        modifier = Modifier.padding(end = 2.dp),
                        text = tom.discount.toString(),
                        fontFamily = ibmPlexSansArabic,
                        fontWeight = FontWeight.Medium,
                        textDecoration = TextDecoration.LineThrough,
                        fontSize = 12.sp,
                        color = BluePrimary
                    )
                }
                Text(
                    modifier = Modifier.weight(1f),
                    text = tom.price,
                    fontFamily = ibmPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = BluePrimary
                )


            }
            Image(
                painter = painterResource(R.drawable.add_to_cart_container),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .size(30.dp)

            )
        }
        Image(
            painter = painterResource(tom.imageRes),
            contentDescription = null,
            modifier = Modifier
                .align(
                    Alignment.TopCenter
                )
                .offset(x = 0.dp, y = -16.dp)
                .size(100.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TwoByThreeGridPrev() {
    CheapSection()
}

