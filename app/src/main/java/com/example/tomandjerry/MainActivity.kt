package com.example.tomandjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.graphics.toArgb
import com.example.tomandjerry.screen.TomKitchenScreen
import com.example.tomandjerry.ui.theme.AppBackground
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val backgroundColor = AppBackground.toArgb()
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.auto(backgroundColor, backgroundColor),
        )
        window.statusBarColor=AppBackground.toArgb()
        setContent {
            TomAndJerryTheme {
                window?.statusBarColor=AppBackground.toArgb()
               // JerryStoreScreen()
               // TomAccountScreen()
                TomKitchenScreen()
            }
        }
    }
}

