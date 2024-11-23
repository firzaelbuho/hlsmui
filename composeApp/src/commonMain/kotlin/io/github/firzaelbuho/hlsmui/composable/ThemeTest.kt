package io.github.firzaelbuho.hlsmui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont


@Composable
fun ThemeTest() {
}


@Composable
fun ButtonTest(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Button(
            onClick = {},
            shape = MaterialTheme.shapes.small
        ){
            Text(
                text = "Small",
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
        Button(
            onClick = {},
            shape = MaterialTheme.shapes.medium
        ){
            Text(
                text = "Medium",
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
        Button(
            onClick = {},
            shape = MaterialTheme.shapes.large
        ){
            Text(
                text = "Large",
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}






