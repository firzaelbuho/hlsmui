package io.github.firzaelbuho.hlsmui.composable.test

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp


class TextStyleProperty(
    val text: String,
    val textStyle: TextStyle
)


@Composable
fun TypographyTest(){
    var isShow by remember { mutableStateOf(false) }
    val textStyleProperties = listOf(

        TextStyleProperty(
            "Label Small",
            MaterialTheme.typography.labelSmall
        ),
        TextStyleProperty(
            "Label Medium",
            MaterialTheme.typography.labelMedium
        ),
        TextStyleProperty(
            "Label Large",
            MaterialTheme.typography.labelLarge
        ),

        TextStyleProperty(
            "Body Small",
            MaterialTheme.typography.bodySmall
        ),
        TextStyleProperty(
            "Body Medium",
            MaterialTheme.typography.bodyMedium
        ),
        TextStyleProperty(
            "Body Large",
            MaterialTheme.typography.bodyLarge
        ),

        TextStyleProperty(
            "Title Small",
            MaterialTheme.typography.titleSmall
        ),
        TextStyleProperty(
            "Title Medium",
            MaterialTheme.typography.titleMedium
        ),
        TextStyleProperty(
            "Title Large",
            MaterialTheme.typography.titleLarge
        ),

        TextStyleProperty(
            "Headline Small",
            MaterialTheme.typography.headlineSmall
        ),
        TextStyleProperty(
            "Headline Medium",
            MaterialTheme.typography.headlineMedium
        ),
        TextStyleProperty(
            "Headline Large",
            MaterialTheme.typography.headlineLarge
        ),

        TextStyleProperty(
            "Display Small",
            MaterialTheme.typography.displaySmall
        ),
        TextStyleProperty(
            "Display Medium",
            MaterialTheme.typography.displayMedium
        ),
        TextStyleProperty(
            "Display Large",
            MaterialTheme.typography.displayLarge
        ),


        )
    Column {
        Column {
            Text(
                modifier = Modifier
                    .clickable { isShow =!isShow }
                    .padding(vertical = 10.dp),
                text ="Typography :",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onBackground

            )
            if(isShow)  ShowTextStyleProperties(textStyleProperties)

        }
    }
}

@Composable
fun ShowTextStyleProperties(textStyleProperties: List<TextStyleProperty>){
    textStyleProperties.forEach {
        Text(
            text = "The quick brown fox jumps over the lazy dog (${it.text})",
            style = it.textStyle,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}