package io.github.firzaelbuho.hlsmui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.composable.test.ColorSchemeTest
import io.github.firzaelbuho.hlsmui.composable.test.FontTest
import io.github.firzaelbuho.hlsmui.composable.test.ShapesTest
import io.github.firzaelbuho.hlsmui.composable.test.TypographyTest
import io.github.firzaelbuho.hlsmui.composable.themes.FontSelector
import io.github.firzaelbuho.hlsmui.composable.themes.HlsmAppTheme
import io.github.firzaelbuho.hlsmui.composable.themes.ModeSwitcher
import io.github.firzaelbuho.hlsmui.composable.themes.ShapeSelector
import io.github.firzaelbuho.hlsmui.composable.themes.ThemeSelector
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShapes
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme

@Composable

fun HomeScreen(){
    //    val themes = HlsmTheme.getAllThemes()
    var currentTheme  by remember { mutableStateOf(HlsmTheme.Candy) }
    var currentFont  by remember { mutableStateOf(HlsmFont.Quicksand) }
    var currentShape  by remember { mutableStateOf(HlsmShapes.Default) }

    var isDark by remember { mutableStateOf(false) }

    HlsmAppTheme(
        hlsmTheme = currentTheme,
        isDark = isDark
    ){

        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ThemeSelector(
                currentHlsmTheme = currentTheme,

                onThemeSelected = {
                    currentTheme = it
                }
            )
            Spacer(modifier = Modifier.size(10.dp))
            FontSelector(
                currentHlsmFont = currentFont,
                onHlsmFontSelected = {
                    currentFont = it
                    currentTheme = currentTheme.copy(hlsmFont = currentFont, hlsmShapes = currentShape)
                }
            )
            Spacer(modifier = Modifier.size(10.dp))
            ShapeSelector(
                currentHlsmFont = currentShape,
                onHlsmShapesSelected = {
                    currentShape = it
                    currentTheme = currentTheme.copy(hlsmFont = currentFont, hlsmShapes = currentShape)

                }
            )
            Spacer(modifier = Modifier.size(10.dp))
            ModeSwitcher(
                isDark = isDark,
                onModeChanged = {
                    isDark = it
                }
            )
            Spacer(modifier = Modifier.size(10.dp))


            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {


                    FontTest(currentTheme.hlsmFont)
                    Spacer(modifier = Modifier.height(40.dp))
                    TypographyTest()
                    Spacer(modifier = Modifier.height(40.dp))
                    ShapesTest()
                    Spacer(modifier = Modifier.height(40.dp))
                    ColorSchemeTest()
                }
            }
        }
    }
}
