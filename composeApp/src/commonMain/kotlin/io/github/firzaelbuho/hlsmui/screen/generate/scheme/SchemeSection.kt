package io.github.firzaelbuho.hlsmui.screen.generate.scheme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.composable.CodePreview
import io.github.firzaelbuho.hlsmui.composable.input.ColorSchemeCategorySelector
import io.github.firzaelbuho.hlsmui.composable.input.ColorSchemeSelector
import io.github.firzaelbuho.hlsmui.composable.test.ColorSchemeTest
import io.github.firzaelbuho.hlsmui.composable.input.ModeSwitcher
import io.github.firzaelbuho.hlsmui.composable.input.SchemeModeSelector
import io.github.firzaelbuho.hlsmui.composable.input.ThemeSelector
import io.github.firzaelbuho.hlsmui.onLinkClick
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorSchemeCategory
//import io.github.firzaelbuho.hlsmui.copyToClipboard
import org.koin.compose.viewmodel.koinViewModel
//import java.awt.Toolkit
//import java.awt.datatransfer.StringSelection
import kotlin.math.roundToInt




@Composable
fun SchemeSection(){
    val viewModel : SchemeViewModel = koinViewModel()
    val uiState by viewModel.uiState.collectAsState()

    viewModel.updateCode()
//

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Button(
            onClick = { onLinkClick("https://github.com/firzaelbuho/hlsmui") }
        ){
            Text("klik")
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){

            Column(
                modifier = Modifier.weight(1.2f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                SchemeSelect()



                Spacer(modifier = Modifier.size(10.dp))
                ModeSwitcher(
                    isDark = uiState.isDark,
                    onModeChanged = {
                        viewModel.updateSchemeIsDark(it)
                        viewModel.updateCode()
                    }
                )
                Spacer(modifier = Modifier.size(10.dp))
                ColorSchemeTest()
                Spacer(modifier = Modifier.height(40.dp))
//                          ShapesTest()
            }
            Spacer(modifier = Modifier.width(40.dp))

            Column(modifier = Modifier.weight(1f))  {

                Text(
                    color = MaterialTheme.colorScheme.onBackground,
                    text= "Select mode to be generated :")
                Spacer(modifier = Modifier.height(16.dp))
                SchemeModeSelector(
                    currentSchemeMode = uiState.currentSchemeMode,
                    onSchemeModeSelected = {
                        viewModel.updateSchemeCurrentSchemeMode(it)
                        viewModel.updateCode()
                    }
                )
                Spacer(modifier = Modifier.height(16.dp))

                Row {
                    Text(
                        modifier = Modifier

                            .background(MaterialTheme.colorScheme.background)
                            .border(
                                width = if (uiState.isPreviewSection) 1.dp else 0.dp,
                                color = if (uiState.isPreviewSection) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.background,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .clickable{
                                viewModel.updateSchemeIsPreviewSection(!uiState.isPreviewSection)
                            }
                            .padding(vertical = 8.dp, horizontal = 16.dp),
                        text = "Preview",
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = MaterialTheme.typography.titleSmall.fontSize,
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        modifier = Modifier

                            .background(MaterialTheme.colorScheme.background)
                            .border(
                                width = if (!uiState.isPreviewSection) 1.dp else 0.dp,
                                color = if (!uiState.isPreviewSection) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.background,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .clickable{
                                viewModel.updateSchemeIsPreviewSection(!uiState.isPreviewSection)
                            }
                            .padding(vertical = 8.dp, horizontal = 16.dp),
                        text = "Code",
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = MaterialTheme.typography.titleSmall.fontSize,
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))
                LazyColumn {
                    item {
                        if(uiState.isPreviewSection){
                            ThemePreview()
                        } else {
                            CodePreview(uiState.code)
                        }
                    }
                }


            }
        }


        Text("Created with ♥ by Aozora")

    }

}


@Composable

fun SchemeSelect(){


    val viewModel : SchemeViewModel = koinViewModel()
    val uiState by viewModel.uiState.collectAsState()



    Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.weight(0.5f)) { Text(
            text = "Filter Category :",
            color = MaterialTheme.colorScheme.onBackground,
        )
            Spacer(modifier = Modifier.size(10.dp))
            ColorSchemeCategorySelector(
                colorSchemeCategory = uiState.currentColorSchemeCategory,

                onColorSchemeCategorySelected = {

                    val colorSchemeList = if(it == HlsmColorSchemeCategory.All) HlsmColorScheme.getAll() else {
                            HlsmColorScheme.getAll().filter {
                            hcs -> hcs.categories.contains(it)
                        }
                    }

                    if(colorSchemeList.isNotEmpty()){
                        viewModel.updateColorScheme(
                            if(it==HlsmColorSchemeCategory.All) HlsmColorScheme.Default else colorSchemeList.first()
                        )
                        
                    }
                    viewModel.updateColorSchemeList(colorSchemeList)
                    viewModel.updateColorSchemeCategory(it)
                    viewModel.updateCode()
//
                }
            )

        }
        Spacer(modifier = Modifier.weight(0.1f))
        Column(modifier = Modifier.weight(1f).fillMaxWidth()) { Text(
            text = "Select color scheme :",
            color = MaterialTheme.colorScheme.onBackground,
        )
            Spacer(modifier = Modifier.size(10.dp))
            ColorSchemeSelector(
                currentSchemeMode = uiState.currentSchemeMode,
                currentHlsmTheme = uiState.currentColorScheme,
                colorSchemeList = uiState.colorSchemeList,
                onColoSchemeSelected = {
                    viewModel.updateColorScheme(it)
                    viewModel.updateCode()
//
                }
            )

        }

    }
}

@Composable
fun ThemePreview(){
    Box (
        modifier = Modifier
            .width(420.dp)
            .height(750.dp)
            .clip(RoundedCornerShape(16.dp))


            .background(MaterialTheme.colorScheme.background)
            .border(width = 2.dp, color = MaterialTheme.colorScheme.onBackground, shape = RoundedCornerShape(16.dp))

    ) {
        ThemePreviewContent()
    }
}


@Composable
fun ThemePreviewContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)


    ) {


        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "hlsmUI",
                color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.titleLarge,
            )
            Spacer(modifier = Modifier.height(64.dp))
            Text(
                text = "Hello, John",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onPrimary
            )
            Spacer(modifier = Modifier.height(16.dp))
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(
                    RoundedCornerShape(
                        topStart = 32.dp,
                        topEnd = 32.dp,
                        bottomStart = 0.dp,
                        bottomEnd = 0.dp
                    )
                )
                .background(MaterialTheme.colorScheme.background)
                .padding(16.dp)

        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth().weight(1f)
                    .clip(MaterialTheme.shapes.large)
                    .background(MaterialTheme.colorScheme.primary)
            )
            Spacer(modifier = Modifier.weight(0.1f))
            Text(
                text = "Menu",
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.weight(0.1f))

            val colors = listOf(
                MaterialTheme.colorScheme.primary,
                MaterialTheme.colorScheme.secondary,
                MaterialTheme.colorScheme.tertiary,
                MaterialTheme.colorScheme.primaryContainer,
                MaterialTheme.colorScheme.secondaryContainer,
                MaterialTheme.colorScheme.tertiaryContainer
            )

            LazyRow(
                modifier = Modifier.fillMaxWidth().weight(1.5f),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                items(colors){
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(150.dp)
                            .clip(MaterialTheme.shapes.large)
                            .background(it)
                    )
                }
            }


        }
    }
}







fun Color.toHexString(): String {
    val alpha = (alpha * 255).roundToInt()
    val red = (red * 255).roundToInt()
    val green = (green * 255).roundToInt()
    val blue = (blue * 255).roundToInt()

    return "0x" + alpha.toHex() + red.toHex() + green.toHex() + blue.toHex()
}

// Helper function to convert an Int to a two-character hexadecimal string
private fun Int.toHex(): String {
    return this.toString(16).padStart(2, '0').uppercase()
}





