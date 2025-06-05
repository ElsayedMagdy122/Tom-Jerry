package com.example.tomandjerry.composable.tom_kitchen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PreparationContainer() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 16.dp)
    ) {
        PreparationItem("1", "Put the pasta in a toaster.")
        Spacer(Modifier.height(8.dp))
        PreparationItem("2", "Pour battery juice over it.")
        Spacer(Modifier.height(8.dp))
        PreparationItem("3", "Wait for the spark to ignite.")
        Spacer(Modifier.height(8.dp))
        PreparationItem("4", "Serve with an insulating glove.")
        Spacer(Modifier.height(8.dp))
    }
}