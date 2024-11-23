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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont

class FontProperty(
    val text: String,
    val fontWeight: FontWeight = FontWeight.Normal,
    val fontStyle: FontStyle = FontStyle.Normal

)
@Composable
fun FontTest(hlsmFont: HlsmFont){
    val fontProperties = listOf(
        FontProperty(
            "Thin",
            FontWeight.Thin,
            FontStyle.Normal
        ),
        FontProperty(
            "Thin Italic",
            FontWeight.Thin,
            FontStyle.Italic
        ),

        FontProperty(
            "Extra Light",
            FontWeight.ExtraLight,
            FontStyle.Normal
        ),
        FontProperty(
            "Extra Light Italic",
            FontWeight.ExtraLight,
            FontStyle.Italic
        ),

        FontProperty(
            "Light",
            FontWeight.Light,
            FontStyle.Normal
        ),
        FontProperty(
            "Light Italic",
            FontWeight.Light,
            FontStyle.Italic
        ),

        FontProperty(
            "Reguler / Normal",
            FontWeight.Normal,
            FontStyle.Normal
        ),
        FontProperty(
            "Regular/Normal Italic",
            FontWeight.Normal,
            FontStyle.Italic
        ),

        FontProperty(
            "Medium",
            FontWeight.Medium,
            FontStyle.Normal
        ),
        FontProperty(
            "Medium Italic",
            FontWeight.Medium,
            FontStyle.Italic
        ),

        FontProperty(
            "Semi Bold",
            FontWeight.SemiBold,
            FontStyle.Normal
        ),
        FontProperty(
            "Semi Bold Italic",
            FontWeight.SemiBold,
            FontStyle.Italic
        ),

        FontProperty(
            "Bold",
            FontWeight.Bold,
            FontStyle.Normal
        ),
        FontProperty(
            "Bold Italic",
            FontWeight.Bold,
            FontStyle.Italic
        ),

        FontProperty(
            "Extra Bold",
            FontWeight.ExtraBold,
            FontStyle.Normal
        ),
        FontProperty(
            "Extra Bold Italic",
            FontWeight.ExtraBold,
            FontStyle.Italic
        ),


        )
    var isShow by remember { mutableStateOf(false) }
    Column {
        Column {
            Text(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .clickable { isShow =!isShow },
                text = "Fonts (${hlsmFont.name}) :",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onBackground

            )

            if(isShow) ShowFonts(fontProperties)
        }
    }
}

@Composable
fun ShowFonts(fontProperties: List<FontProperty>){
    fontProperties.forEach {
        Text(
            text = "The quick brown fox jumps over the lazy dog (${it.text})",
            fontWeight = it.fontWeight,
            fontStyle = it.fontStyle,
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}