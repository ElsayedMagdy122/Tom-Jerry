package com.example.tomandjerry.composable.tom_account

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.AppBackground
import com.example.tomandjerry.R
import com.example.tomandjerry.data.statItems
import com.example.tomandjerry.model.Cat
import com.example.tomandjerry.ui.theme.Black
import com.example.tomandjerry.ui.theme.ibmPlexSansArabic

@Composable
fun TomAccountContentContainer(modifier: Modifier = Modifier, catItems: List<Cat>) {

    Column(
        modifier = modifier
            .background(
                color = AppBackground,
                shape = RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp)
            )
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .background(Color.Transparent)
                .padding(top = 23.dp)
                .padding(horizontal = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(catItems) { item ->
                StatItem(cat = item, startAngle = 180f, sweepAngle = item.sweepAngel)
            }
        }
        Text(
            modifier = Modifier.padding(top = 24.dp, start = 16.dp),
            text = "Tom settings",
            color = Black,
            fontSize = 20.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Bold,

            )
        Column(modifier = Modifier.padding(top = 16.dp, start = 16.dp)) {
            ChoiceItem(
                modifier = Modifier.padding(top = 8.dp),
                R.drawable.bed_single_02,
                "Change sleeping place"
            )
            ChoiceItem(modifier = Modifier.padding(top = 8.dp), R.drawable.cat, "Meow settings")
            ChoiceItem(
                modifier = Modifier.padding(top = 8.dp),
                R.drawable.fridge,
                "Password to open the fridge"
            )
        }
        Text(
            modifier = Modifier.padding(top = 16.dp, start = 16.dp),
            text = "His favorite foods",
            color = Black,
            fontSize = 20.sp,
            fontFamily = ibmPlexSansArabic,
            fontWeight = FontWeight.Bold,

            )
        Column(modifier = Modifier.padding(top = 16.dp, start = 16.dp)) {
            ChoiceItem(
                modifier = Modifier.padding(top = 8.dp),
                R.drawable.alert_01,
                "Mouses"
            )
            ChoiceItem(
                modifier = Modifier.padding(top = 8.dp),
                R.drawable.hamburger_02,
                "Last stolen meal"
            )
            ChoiceItem(
                modifier = Modifier.padding(top = 8.dp),
                R.drawable.fridge,
                "Change sleep mood"
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .padding(vertical = 24.dp)
                    .alpha(0.60f),
                text = "His favorite foods",
                color = Black,
                fontSize = 12.sp,
                fontFamily = ibmPlexSansArabic,
                fontWeight = FontWeight.Normal,

                )
        }

    }

}

@Preview(showBackground = true, device = "spec:width=360dp,height=1085dp")
@Composable
fun ContentContainerPrev() {
    TomAccountContentContainer(catItems = statItems)
}
