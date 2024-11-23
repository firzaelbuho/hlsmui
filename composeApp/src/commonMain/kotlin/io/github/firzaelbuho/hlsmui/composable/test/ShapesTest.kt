package io.github.firzaelbuho.hlsmui.composable.test

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ShapesTest(){
    var isShow by remember { mutableStateOf(true) }
    val shapesProperties = listOf(
        ShapesProperty("small", MaterialTheme.shapes.small, 100.dp),
        ShapesProperty("small", MaterialTheme.shapes.medium, 150.dp),
        ShapesProperty("small", MaterialTheme.shapes.large, 200.dp)
    )

    Column {
        Text(
            modifier = Modifier
                .padding(vertical = 10.dp)
                .clickable { isShow =!isShow },
            text = "Shapes :",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onBackground
        )
       if(isShow) ShowShapes(shapesProperties)
    }

}

@Composable
fun ShowShapes(shapesProperties: List<ShapesProperty>){
    Row(
//            modifier = Modifier.padding(horizontal = 4.dp),
        horizontalArrangement = Arrangement.Start,
    ) {
        shapesProperties.forEach {
            Box(
                modifier = Modifier
//                        .weight(1f)
                    .padding(4.dp)
                    .size(it.size)
                    .clip(it.shape)
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = it.text,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
        }
    }
}

class ShapesProperty(
    val text:String,
    val shape: Shape,
    val size:Dp
)