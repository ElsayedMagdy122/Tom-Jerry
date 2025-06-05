package com.example.tomandjerry.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.composable.tom_kitchen.TomKitchenContentContainer
import com.example.tomandjerry.composable.tom_kitchen.TomKitchenPastaBackground
import com.example.tomandjerry.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TomKitchenScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()){  paddingValues->
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            TomKitchenPastaBackground()
            TomKitchenContentContainer(
                Modifier.padding(top = 220.dp).align(Alignment.BottomCenter)
            )
            Image(
                painter = painterResource(R.drawable.pasta),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 58.dp, end = 16.dp)
                    .height(180.dp)
                    .width(200.dp)
            )
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun TomKitchenScreenPrev() {
    Scaffold(modifier = Modifier.fillMaxSize()){  paddingValues->
        Box(
            modifier = Modifier.fillMaxSize()
        ){
            TomKitchenPastaBackground()
            TomKitchenContentContainer(
                Modifier.padding(top = 220.dp).align(Alignment.BottomCenter)
            )
            Image(
                painter = painterResource(R.drawable.pasta),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 58.dp, end = 16.dp)
                    .height(180.dp)
                    .width(200.dp)
            )
        }
    }
}