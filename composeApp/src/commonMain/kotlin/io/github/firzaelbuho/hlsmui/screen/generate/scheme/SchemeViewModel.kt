package io.github.firzaelbuho.hlsmui.screen.generate.scheme


import androidx.lifecycle.ViewModel
import io.github.firzaelbuho.hlsmui.model.Code
import io.github.firzaelbuho.hlsmui.model.SchemeMode
import io.github.firzaelbuho.hlsmui.screen.generate.scheme.toHexString
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorSchemeCategory
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShapes
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow



data class SchemeUiState(
    val code:String = "",
    val codeMode: Code = Code("""
        enum class Mode {
            Light,
            Dark,
            Auto
        }
        """.trimIndent(),
        "1. Create enum class for scheme mode"
    ),
    val codeScheme:Code = Code("","2. Create both lights cheme and dark scheme object"),
    val codeTheme:Code = Code("","3. Create 'MyAppTheme' composable function"),
    val codeApp:Code = Code("""
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
    """.trimIndent(),
        "4. Create 'MyApp' composable function"),
    val currentTheme : HlsmTheme = HlsmTheme.Default,
    val currentColorScheme : HlsmColorScheme = HlsmColorScheme.Default,

    val currentColorSchemeCategory: HlsmColorSchemeCategory = HlsmColorSchemeCategory.All,

    val colorSchemeList: List<HlsmColorScheme> = HlsmColorScheme.getAll(),
    val currentFont : HlsmFont = HlsmFont.Quicksand,
    val currentShape : HlsmShapes = HlsmShapes.Default,
    val currentSchemeMode : SchemeMode = SchemeMode.Light,
    val isDark : Boolean = false,
    val isPreviewSection : Boolean = true
) {
    fun generateCodeScheme(hlsmColorScheme: HlsmColorScheme):String {
        return """
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
        """.trimIndent()

    }

    fun generateCodeTheme(mode:SchemeMode = SchemeMode.Light) : String {
        return """
        @Composable
        fun MyAppTheme(content: @Composable () -> Unit) {
    
            val mode = Mode.${mode.name}
    
            
    
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
    
       
    """.trimIndent()


    }
}




class SchemeViewModel: ViewModel(){
    private  val _uiState = MutableStateFlow(SchemeUiState())
    val uiState : StateFlow<SchemeUiState> = _uiState


    fun updateCode(){
        val codeScheme = uiState.value.generateCodeScheme(_uiState.value.currentTheme.hlsmColorScheme)
        val codeTheme = uiState.value.generateCodeTheme(_uiState.value.currentSchemeMode)
        _uiState.value = _uiState.value.copy(
            codeScheme = _uiState.value.codeScheme.copy(
                script = codeScheme
            ),
            codeTheme = _uiState.value.codeTheme.copy(
                script = codeTheme
            ),
            code = """
// Code for scheme mode enum class

${_uiState.value.codeMode.script}

// Code for ${uiState.value.currentTheme.name} color scheme

${_uiState.value.codeScheme.script}

// Code for create AppTheme
                 
${_uiState.value.codeTheme.script}
  
// Code for run the App with AppTheme
                  
${_uiState.value.codeApp.script}    
// Code generated by HlsmUI
            """.trimIndent()
        )
    }

    fun updateSchemeCurrentTheme(theme: HlsmTheme){
        _uiState.value = _uiState.value.copy(
            currentTheme = theme
        )
    }
    fun updateColorScheme(scheme: HlsmColorScheme){
        _uiState.value = _uiState.value.copy(
            currentColorScheme =  scheme
        )
    }

    fun updateColorSchemeCategory(category: HlsmColorSchemeCategory){
        _uiState.value = _uiState.value.copy(
            currentColorSchemeCategory = category
        )
    }

    fun updateColorSchemeList(colorSchemeList: List<HlsmColorScheme>){
        _uiState.value = _uiState.value.copy(
            colorSchemeList = colorSchemeList
        )
    }

    fun  updateSchemeCurrentFont(font: HlsmFont){
        _uiState.value = _uiState.value.copy(
            currentFont = font
        )
    }
    fun updateSchemeCurrentShape(shape: HlsmShapes){
        _uiState.value = _uiState.value.copy(
            currentShape = shape
        )
    }
    fun updateSchemeCurrentSchemeMode(mode: SchemeMode){
        _uiState.value = _uiState.value.copy(
            currentSchemeMode = mode
        )
    }
    fun updateSchemeIsDark(isDark: Boolean){
        _uiState.value = _uiState.value.copy(
            isDark = isDark
        )
    }
    fun updateSchemeIsPreviewSection(isPreviewSection: Boolean){
        _uiState.value = _uiState.value.copy(
            isPreviewSection = isPreviewSection
        )
    }
}