package io.github.firzaelbuho.hlsmui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import io.github.firzaelbuho.hlsmui.composable.test.ColorSchemeTest
import io.github.firzaelbuho.hlsmui.composable.test.FontTest
import io.github.firzaelbuho.hlsmui.composable.test.ShapesTest
import io.github.firzaelbuho.hlsmui.composable.test.TypographyTest
import io.github.firzaelbuho.hlsmui.composable.themes.FontSelector
import io.github.firzaelbuho.hlsmui.composable.themes.HlsmAppTheme
import io.github.firzaelbuho.hlsmui.composable.themes.ModeSwitcher
import io.github.firzaelbuho.hlsmui.composable.themes.SchemeModeSelector
import io.github.firzaelbuho.hlsmui.composable.themes.ShapeSelector
import io.github.firzaelbuho.hlsmui.composable.themes.ThemeSelector
import io.github.firzaelbuho.hlsmui.copyToClipboard
import io.github.firzaelbuho.hlsmui.model.SchemeMode
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShapes
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme
//import java.awt.Toolkit
//import java.awt.datatransfer.StringSelection
import kotlin.math.roundToInt




@Composable
fun GenerateScreen(){
    //    val themes = HlsmTheme.getAllThemes()
    var currentTheme  by remember { mutableStateOf(HlsmTheme.Default) }
    var isPreviewSection  by remember { mutableStateOf(true) }
    var currentFont  by remember { mutableStateOf(HlsmFont.Quicksand) }
    var currentShape  by remember { mutableStateOf(HlsmShapes.Default) }
    var currentSchemeMode  by remember { mutableStateOf(SchemeMode.Light) }

    var code by remember { mutableStateOf(generateCode(currentTheme.hlsmColorScheme, currentSchemeMode)) }


    var isDark by remember { mutableStateOf(false) }

    HlsmAppTheme(
        hlsmTheme = currentTheme,
        isDark = isDark
    ){

        Column(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleSection()
            Text(
                text = "Select color scheme :",
                color = MaterialTheme.colorScheme.onBackground,
            )
            Spacer(modifier = Modifier.size(10.dp))
            ThemeSelector(
                currentHlsmTheme = currentTheme,

                onThemeSelected = {
                    currentTheme = it
                    code = generateCode(it.hlsmColorScheme, currentSchemeMode)
                }
            )


            Spacer(modifier = Modifier.size(10.dp))
            ModeSwitcher(
                isDark = isDark,
                onModeChanged = {
                    isDark = it
                    code = generateCode(currentTheme.hlsmColorScheme, currentSchemeMode)
                }
            )
            Spacer(modifier = Modifier.size(10.dp))


            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                item {

                    Row(){
                      Column(modifier = Modifier.weight(1f)) {
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
                              currentSchemeMode = currentSchemeMode,
                              onSchemeModeSelected = {
                                  currentSchemeMode = it
                                  code = generateCode(currentTheme.hlsmColorScheme, currentSchemeMode)
                              }
                          )
                          Spacer(modifier = Modifier.height(16.dp))

                          Row {
                              Text(
                                  modifier = Modifier

                                      .background(MaterialTheme.colorScheme.background)
                                      .border(
                                          width = if (isPreviewSection) 1.dp else 0.dp,
                                          color = if (isPreviewSection) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.background,
                                          shape = RoundedCornerShape(16.dp)
                                      )
                                      .clickable{
                                          isPreviewSection = !isPreviewSection
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
                                          width = if (!isPreviewSection) 1.dp else 0.dp,
                                          color = if (!isPreviewSection) MaterialTheme.colorScheme.onBackground else MaterialTheme.colorScheme.background,
                                          shape = RoundedCornerShape(16.dp)
                                      )
                                      .clickable{
                                          isPreviewSection = !isPreviewSection
                                      }
                                      .padding(vertical = 8.dp, horizontal = 16.dp),
                                  text = "Code",
                                  color = MaterialTheme.colorScheme.onBackground,
                                  fontSize = MaterialTheme.typography.titleSmall.fontSize,
                              )
                          }

                          Spacer(modifier = Modifier.height(16.dp))
                          if(isPreviewSection){
                              ThemePreview()
                          } else {
                              CodePreview(code)
                          }

                      }
                  }
                    Text("Created with ♥ by Aozora")

                }
            }
        }
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
            text = "Jetpack Compose Theme Generator",
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.titleMedium,
        )
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
        ThemePreviewContent2()
    }
}


@Composable
fun ThemePreviewContent2(){
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

@Composable
fun ThemePreviewContent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)

    ) {
        Text(
            text = "hlsmUI",
            color = MaterialTheme.colorScheme.onBackground,
            fontSize = MaterialTheme.typography.titleLarge.fontSize,
            fontWeight = MaterialTheme.typography.titleLarge.fontWeight
        )
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.large)
                .background(MaterialTheme.colorScheme.primary)
                .padding(16.dp),

            ) {
            Text(
                fontSize = MaterialTheme.typography.titleSmall.fontSize,
                color = MaterialTheme.colorScheme.onPrimary,
                text = "Hello, John"
            )
            Spacer(modifier = Modifier.height(64.dp))
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(MaterialTheme.shapes.large)
                .background(MaterialTheme.colorScheme.secondary)
                .padding(16.dp),

            ) {
            Text(
                fontSize = MaterialTheme.typography.titleSmall.fontSize,
                color = MaterialTheme.colorScheme.onSecondary,
                text = "Hi, John"
            )
            Spacer(modifier = Modifier.height(32.dp))
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize()
                .clip(MaterialTheme.shapes.large)
                .background(MaterialTheme.colorScheme.primaryContainer)
                .padding(16.dp),
            columns = GridCells.Fixed(4),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)

        ){
            items(20){
                Box(
                    modifier = Modifier
                        .aspectRatio(1f)
                        .clip(MaterialTheme.shapes.large)
                        .background(MaterialTheme.colorScheme.primary)

                )
            }
        }

    }



}

@Composable
fun CodePreview(code: String){
    Column (
        modifier = Modifier
            .fillMaxSize()

            .clip(RoundedCornerShape(16.dp))


            .background(MaterialTheme.colorScheme.background)
            .border(width = 2.dp, color = MaterialTheme.colorScheme.onBackground, shape = RoundedCornerShape(16.dp))
            .padding(32.dp)
    ) {
        CopyButton(code)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            color = MaterialTheme.colorScheme.onBackground,
            text = code
        )
    }
}

fun generateCode(hlsmColorScheme: HlsmColorScheme, mode:SchemeMode = SchemeMode.Light): String {
    val generatedCode = """
    enum class Mode {
        Light,
        Dark,
        Auto
    }

    @Composable
    fun MyAppTheme(content: @Composable () -> Unit) {

        val mode = Mode.${mode.name}

        // Light and dark color schemes
        val lightColors = lightColorScheme(
            primary = Color(${hlsmColorScheme.lightScheme.primary.toHexString()}), 
            onPrimary = Color(${hlsmColorScheme.lightScheme.onPrimary.toHexString()}), 
            primaryContainer = Color(${hlsmColorScheme.lightScheme.primaryContainer.toHexString()}), 
            onPrimaryContainer = Color(${hlsmColorScheme.lightScheme.onPrimaryContainer.toHexString()}), 
            inversePrimary = Color(${hlsmColorScheme.lightScheme.inversePrimary.toHexString()}), 

            secondary = Color(${hlsmColorScheme.lightScheme.secondary.toHexString()}), 
            onSecondary = Color(${hlsmColorScheme.lightScheme.onSecondary.toHexString()}), 
            secondaryContainer = Color(${hlsmColorScheme.lightScheme.secondaryContainer.toHexString()}), 
            onSecondaryContainer = Color(${hlsmColorScheme.lightScheme.onSecondaryContainer.toHexString()}), 

            tertiary = Color(${hlsmColorScheme.lightScheme.tertiary.toHexString()}), 
            onTertiary = Color(${hlsmColorScheme.lightScheme.onTertiary.toHexString()}), 
            tertiaryContainer = Color(${hlsmColorScheme.lightScheme.tertiaryContainer.toHexString()}), 
            onTertiaryContainer = Color(${hlsmColorScheme.lightScheme.onTertiaryContainer.toHexString()}), 

            background = Color(${hlsmColorScheme.lightScheme.background.toHexString()}), 
            onBackground = Color(${hlsmColorScheme.lightScheme.onBackground.toHexString()}), 

            surface = Color(${hlsmColorScheme.lightScheme.surface.toHexString()}), 
            onSurface = Color(${hlsmColorScheme.lightScheme.onSurface.toHexString()}), 

            surfaceVariant = Color(${hlsmColorScheme.lightScheme.surfaceVariant.toHexString()}), 
            onSurfaceVariant = Color(${hlsmColorScheme.lightScheme.onSurfaceVariant.toHexString()}), 

            surfaceTint = Color(${hlsmColorScheme.lightScheme.surfaceTint.toHexString()}), 

            inverseSurface = Color(${hlsmColorScheme.lightScheme.inverseSurface.toHexString()}), 
            inverseOnSurface = Color(${hlsmColorScheme.lightScheme.inverseOnSurface.toHexString()}), 

            error = Color(${hlsmColorScheme.lightScheme.error.toHexString()}), 
            onError = Color(${hlsmColorScheme.lightScheme.onError.toHexString()}), 
            errorContainer = Color(${hlsmColorScheme.lightScheme.errorContainer.toHexString()}), 
            onErrorContainer = Color(${hlsmColorScheme.lightScheme.onErrorContainer.toHexString()}), 

            outline = Color(${hlsmColorScheme.lightScheme.outline.toHexString()}), 
            outlineVariant = Color(${hlsmColorScheme.lightScheme.outlineVariant.toHexString()}), 

            scrim = Color(${hlsmColorScheme.lightScheme.scrim.toHexString()}), 
            surfaceBright = Color(${hlsmColorScheme.lightScheme.surfaceBright.toHexString()}), 
            surfaceContainer = Color(${hlsmColorScheme.lightScheme.surfaceContainer.toHexString()}), 
            surfaceContainerHigh = Color(${hlsmColorScheme.lightScheme.surfaceContainerHigh.toHexString()}), 
            surfaceContainerHighest = Color(${hlsmColorScheme.lightScheme.surfaceContainerHighest.toHexString()}), 
            surfaceContainerLow = Color(${hlsmColorScheme.lightScheme.surfaceContainerLow.toHexString()}), 
            surfaceContainerLowest = Color(${hlsmColorScheme.lightScheme.surfaceContainerLowest.toHexString()}), 
            surfaceDim = Color(${hlsmColorScheme.lightScheme.surfaceDim.toHexString()}), 
        )

        val darkColors = darkColorScheme(
            primary = Color(${hlsmColorScheme.darkScheme.primary.toHexString()}), 
            onPrimary = Color(${hlsmColorScheme.darkScheme.onPrimary.toHexString()}), 
            primaryContainer = Color(${hlsmColorScheme.darkScheme.primaryContainer.toHexString()}), 
            onPrimaryContainer = Color(${hlsmColorScheme.darkScheme.onPrimaryContainer.toHexString()}), 
            inversePrimary = Color(${hlsmColorScheme.darkScheme.inversePrimary.toHexString()}), 

            secondary = Color(${hlsmColorScheme.darkScheme.secondary.toHexString()}), 
            onSecondary = Color(${hlsmColorScheme.darkScheme.onSecondary.toHexString()}), 
            secondaryContainer = Color(${hlsmColorScheme.darkScheme.secondaryContainer.toHexString()}), 
            onSecondaryContainer = Color(${hlsmColorScheme.darkScheme.onSecondaryContainer.toHexString()}), 

            tertiary = Color(${hlsmColorScheme.darkScheme.tertiary.toHexString()}), 
            onTertiary = Color(${hlsmColorScheme.darkScheme.onTertiary.toHexString()}), 
            tertiaryContainer = Color(${hlsmColorScheme.darkScheme.tertiaryContainer.toHexString()}), 
            onTertiaryContainer = Color(${hlsmColorScheme.darkScheme.onTertiaryContainer.toHexString()}), 

            background = Color(${hlsmColorScheme.darkScheme.background.toHexString()}), 
            onBackground = Color(${hlsmColorScheme.darkScheme.onBackground.toHexString()}), 

            surface = Color(${hlsmColorScheme.darkScheme.surface.toHexString()}), 
            onSurface = Color(${hlsmColorScheme.darkScheme.onSurface.toHexString()}), 

            surfaceVariant = Color(${hlsmColorScheme.darkScheme.surfaceVariant.toHexString()}), 
            onSurfaceVariant = Color(${hlsmColorScheme.darkScheme.onSurfaceVariant.toHexString()}), 

            surfaceTint = Color(${hlsmColorScheme.darkScheme.surfaceTint.toHexString()}), 

            inverseSurface = Color(${hlsmColorScheme.darkScheme.inverseSurface.toHexString()}), 
            inverseOnSurface = Color(${hlsmColorScheme.darkScheme.inverseOnSurface.toHexString()}), 

            error = Color(${hlsmColorScheme.darkScheme.error.toHexString()}), 
            onError = Color(${hlsmColorScheme.darkScheme.onError.toHexString()}), 
            errorContainer = Color(${hlsmColorScheme.darkScheme.errorContainer.toHexString()}), 
            onErrorContainer = Color(${hlsmColorScheme.darkScheme.onErrorContainer.toHexString()}), 

            outline = Color(${hlsmColorScheme.darkScheme.outline.toHexString()}), 
            outlineVariant = Color(${hlsmColorScheme.darkScheme.outlineVariant.toHexString()}), 

            scrim = Color(${hlsmColorScheme.darkScheme.scrim.toHexString()}), 
            surfaceBright = Color(${hlsmColorScheme.darkScheme.surfaceBright.toHexString()}), 
            surfaceContainer = Color(${hlsmColorScheme.darkScheme.surfaceContainer.toHexString()}), 
            surfaceContainerHigh = Color(${hlsmColorScheme.darkScheme.surfaceContainerHigh.toHexString()}), 
            surfaceContainerHighest = Color(${hlsmColorScheme.darkScheme.surfaceContainerHighest.toHexString()}), 
            surfaceContainerLow = Color(${hlsmColorScheme.darkScheme.surfaceContainerLow.toHexString()}), 
            surfaceContainerLowest = Color(${hlsmColorScheme.darkScheme.surfaceContainerLowest.toHexString()}), 
            surfaceDim = Color(${hlsmColorScheme.darkScheme.surfaceDim.toHexString()}), 
        )

        // Use dark color scheme based on system setting
        val colors = when(mode) {
            Mode.Light -> lightColors
            Mode.Dark -> darkColors
            Mode.Auto -> if (isSystemInDarkTheme()) darkColors else lightColors
        }

        MaterialTheme(
            colorScheme = colors,
            typography = MaterialTheme.typography,
            content = content
        )
    }

    @Composable
    fun MyApp() {
        MyAppTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
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
        }
    }
""".trimIndent()

    return generatedCode

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

@Composable
fun CopyButton(textToCopy: String) {
    val clipboardManager = LocalClipboardManager.current

    Button(onClick = {
        copyToClipboard(textToCopy, clipboardManager)
    }) {
        Text("Copy")
    }
}

//fun copyToClipboard(text: String, clipboardManager: ClipboardManager?) {
//    // Use Compose ClipboardManager if available
//    clipboardManager?.setText(AnnotatedString(text)) ?: run {
//        // Fallback for Desktop
////        val toolkit = Toolkit.getDefaultToolkit().systemClipboard
////        val selection = StringSelection(text)
////        toolkit.setContents(selection, selection)
//    }
//}

