package com.example.tomandjerry.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.composable.jerry_store.AppBar
import com.example.tomandjerry.composable.jerry_store.PromotionBanner
import com.example.tomandjerry.composable.jerry_store.SearchBar
import com.example.tomandjerry.composable.jerry_store.SectionHeader
import com.example.tomandjerry.composable.jerry_store.CheapSection
import com.example.tomandjerry.ui.theme.AppBackground

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun JerryStoreScreen() {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(AppBackground)

        ) {
            AppBar(modifier = Modifier.padding(top = 8.dp))
            Spacer(modifier = Modifier.height(8.dp))
            SearchBar()
            PromotionBanner()
            SectionHeader()
            CheapSection()
        }
    }
}

@Preview(showSystemUi = true, showBackground = true, device = "spec:width=360dp,height=1085dp")
@Composable
fun JerryStoreScreenPrev() {
    Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(AppBackground)
        ) {
            AppBar()
            Spacer(modifier = Modifier.height(8.dp))
            SearchBar()
            Spacer(modifier = Modifier.height(8.dp))
            PromotionBanner()
            SectionHeader()
            CheapSection()
        }
    }

}