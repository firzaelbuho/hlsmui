package io.github.firzaelbuho.hlsmui.screen.generate

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.composable.themes.HlsmAppTheme
import io.github.firzaelbuho.hlsmui.screen.generate.animation.AnimationSection
import io.github.firzaelbuho.hlsmui.screen.generate.component.ComponentSection
//import io.github.firzaelbuho.hlsmui.copyToClipboard
import io.github.firzaelbuho.hlsmui.screen.generate.scheme.SchemeSection
import io.github.firzaelbuho.hlsmui.screen.generate.scheme.SchemeViewModel
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme
import org.koin.compose.viewmodel.koinViewModel
//import java.awt.Toolkit
//import java.awt.datatransfer.StringSelection


@Composable
fun GenerateScreen(){
    val generateViewModel : GenerateViewModel = koinViewModel()
    val generateUiState by generateViewModel.uiState.collectAsState()

    val schemeViewModel : SchemeViewModel = koinViewModel()
    val schemeUiState by schemeViewModel.uiState.collectAsState()


    HlsmAppTheme(
        hlsmTheme = HlsmTheme(
            hlsmColorScheme = schemeUiState.currentColorScheme,
            hlsmFont = HlsmFont.Montserrat
        ),
        isDark = schemeUiState.isDark
    ){

        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleSection()
            Box(modifier = Modifier.padding(16.dp)){
                TabSection()

            }
        }
    }
}

@Composable
fun BoxBorder(content: @Composable () -> Unit){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 32.dp)
            .clip(MaterialTheme.shapes.large)
            .border(color = MaterialTheme.colorScheme.onBackground, width = 2.dp, shape = MaterialTheme.shapes.large)
            .padding(24.dp)

    ){
        content()
    }
}

@Composable
fun TitleSection(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "hlsmUI",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleLarge,
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Jetpack Compose UI Helper",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium,
        )
    }
}

@Composable
fun TabSection() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = Section.entries

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        TabRow(
            selectedTabIndex = tabIndex,
            containerColor = MaterialTheme.colorScheme.background,
        ) {
            tabs.forEachIndexed { index, section ->
                Tab(
                    text = { Text(section.name,) },
                    selectedContentColor = MaterialTheme.colorScheme.primary,
                    unselectedContentColor = MaterialTheme.colorScheme.onBackground,
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        BoxBorder {
            when (tabIndex) {
                0 -> SchemeSection()
                1 -> AnimationSection()
                2 -> ComponentSection()
            }
        }

    }
}