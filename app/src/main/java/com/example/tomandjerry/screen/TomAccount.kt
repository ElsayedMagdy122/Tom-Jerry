package com.example.tomandjerry.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.tom_account.StatItem
import com.example.tomandjerry.data.catItems
import com.example.tomandjerry.model.Cat
import com.example.tomandjerry.ui.theme.AppBackground
import com.example.tomandjerry.ui.theme.BlueLight
import com.example.tomandjerry.ui.theme.BluePrimary
import com.example.tomandjerry.ui.theme.DividerLine
import com.example.tomandjerry.ui.theme.GreenPrimary
import com.example.tomandjerry.ui.theme.GreenSurface
import com.example.tomandjerry.ui.theme.HeaderText
import com.example.tomandjerry.ui.theme.ImageBorder
import com.example.tomandjerry.ui.theme.PinkPrimary
import com.example.tomandjerry.ui.theme.PinkSurface
import com.example.tomandjerry.ui.theme.ProfileBackground
import com.example.tomandjerry.ui.theme.StatValue
import com.example.tomandjerry.ui.theme.White12
import com.example.tomandjerry.ui.theme.White80
import com.example.tomandjerry.ui.theme.YellowPrimary
import com.example.tomandjerry.ui.theme.YellowSurface
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TomAccountScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(AppBackground)
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues).fillMaxSize()
            .background(AppBackground)) {
            TomProfileBackground()
            Image(
                painter = painterResource(R.drawable.background_container),
                contentDescription = null,
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Center)
            ) {
                Spacer(Modifier.height(4.dp))
                Image(
                    painter = painterResource(R.drawable.tomprofile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(64.dp)
                        .border(width = 1.dp, color = ImageBorder, shape = RoundedCornerShape(12.dp))
                )
                Spacer(Modifier.height(4.dp))
                ProfileDetails()
                Spacer(Modifier.height(8.dp))
                ContentContainer(Modifier.fillMaxWidth()
                    .wrapContentHeight())
            }
        }


    }
}

@Composable
private fun TomProfileBackground() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(242.dp)
            .background(color = ProfileBackground)
    )
}

@Composable
private fun ProfileDetails() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Tom",
            fontSize = 18.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.W500,
            textAlign = TextAlign.Center,
            color = White,
        )
        Text(
            text = "specializes in failure!",
            fontSize = 12.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.W400,
            textAlign = TextAlign.Center,
            color = White80,
        )
        Spacer(Modifier.height(4.dp))
        Box(
            modifier = Modifier
                .background(color = White12, shape = RoundedCornerShape(40.dp))
                .height(25.dp)
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text(
                text = "Edit foolishness",
                fontSize = 10.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center,
                color = White,
            )
        }
    }
}

@Composable
private fun ContentContainer(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = AppBackground,
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)
            )
    ) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            StatusContainer(catItems)
            Spacer(Modifier.height(12.dp))
            SettingSection()
            HorizontalDivider(thickness = 2.dp, color = DividerLine)
            Spacer(Modifier.height(12.dp))
            FavoriteFoodSection()
            Spacer(Modifier.height(12.dp))
            Text(
                text = "v.TomBeta",
                fontSize = 12.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W400,
                textAlign = TextAlign.Center,
                color = StatValue,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(Modifier.height(12.dp))
        }
    }
}

@Composable
private fun StatusContainer(catItems: List<Cat>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(top = 23.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .height(120.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(catItems) { item ->
            StatItem(cat = item, startAngle = 180f, sweepAngle = item.sweepAngel)
        }
    }
}

@Composable
private fun SettingSection(){
    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
    ) {
        Row {
            Text(
                text = "Tom settings",
                fontSize = 20.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Start,
                color = HeaderText,
            )
        }
        Spacer(Modifier.height(8.dp))
        ListItem(R.drawable.bed_single_02,"Change sleeping place")
        ListItem(R.drawable.cat,"Meow settings")
        ListItem(R.drawable.fridge,"Password to open the fridge")
    }
}

@Composable
private fun FavoriteFoodSection(){
    Column(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
    ) {
        Row {
            Text(
                text = "His favorite foods",
                fontSize = 20.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Start,
                color = HeaderText,
            )
        }
        Spacer(Modifier.height(8.dp))
        ListItem(R.drawable.alert_01,"Mouses")
        ListItem(R.drawable.hamburger_02,"Last stolen meal")
        ListItem(R.drawable.sleeping,"Change sleep mood")
    }
}


@Composable
private fun ListItem(img: Int, title: String){
    Row(
        modifier = Modifier.padding(bottom = 12.dp)
    ){
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .background(color = White, shape = RoundedCornerShape(8.dp))
        ){
            Image(
                painter = painterResource(img),
                contentDescription = null
            )
        }
        Spacer(Modifier.width(8.dp))
        Text(
            text = title,
            fontSize = 16.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.W500,
            textAlign = TextAlign.Start,
            color = HeaderText,
            modifier = Modifier.align(Alignment.CenterVertically)
        )
    }
}

@Preview(showSystemUi = true, showBackground = true, device = "spec:width=360dp,height=870dp")
@Composable
fun TomAccountScreenPrev() {
    TomAccountScreen()
}
