package io.github.firzaelbuho.hlsmui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.composable.ButtonTest
//import org.jetbrains.compose.ui.tooling.preview.Preview

import io.github.firzaelbuho.hlsmui.composable.themes.HlsmAppTheme
import io.github.firzaelbuho.hlsmui.composable.test.ColorSchemeTest
import io.github.firzaelbuho.hlsmui.composable.test.FontTest
import io.github.firzaelbuho.hlsmui.composable.test.ShapesTest
import io.github.firzaelbuho.hlsmui.composable.test.TypographyTest
import io.github.firzaelbuho.hlsmui.composable.themes.FontSelector
import io.github.firzaelbuho.hlsmui.composable.themes.ModeSwitcher
import io.github.firzaelbuho.hlsmui.composable.themes.ShapeSelector
import io.github.firzaelbuho.hlsmui.composable.themes.ThemeSelector
import io.github.firzaelbuho.hlsmui.screen.GenerateScreen
import io.github.firzaelbuho.hlsmui.screen.MyApp
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShapes
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme


@Composable
fun App() {

//    Text("Hello")
//    MyApp()
    GenerateScreen()

}


