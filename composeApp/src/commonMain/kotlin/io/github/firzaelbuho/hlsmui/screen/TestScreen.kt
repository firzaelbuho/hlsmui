package io.github.firzaelbuho.hlsmui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme

enum class Mode {
    Light,
    Dark,
    Auto
}

// Light and dark color schemes
val lightColors = lightColorScheme(
    primary = Color(0xFFB2EBF2),
    onPrimary = Color(0xFF006064),
    primaryContainer = Color(0xFFE0F7FA),
    onPrimaryContainer = Color(0xFF004D40),
    inversePrimary = Color(0xFFD0BCFF),

    secondary = Color(0xFFE1F5FE),
    onSecondary = Color(0xFF0D47A1),
    secondaryContainer = Color(0xFFBBDEFB),
    onSecondaryContainer = Color(0xFF0D47A1),

    tertiary = Color(0xFFFFE082),
    onTertiary = Color(0xFF6A1B9A),
    tertiaryContainer = Color(0xFFFFF9C4),
    onTertiaryContainer = Color(0xFFF57F17),

    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF212121),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF212121),

    surfaceVariant = Color(0xFFE0F7FA),
    onSurfaceVariant = Color(0xFF004D40),

    surfaceTint = Color(0xFFB2EBF2),

    inverseSurface = Color(0xFF212121),
    inverseOnSurface = Color(0xFFFFFFFF),

    error = Color(0xFFD32F2F),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFE5E5),
    onErrorContainer = Color(0xFFD32F2F),

    outline = Color(0xFFE0E0E0),
    outlineVariant = Color(0xFFD6D6D6),

    scrim = Color(0xFF000000),
    surfaceBright = Color(0xFFFEF7FF),
    surfaceContainer = Color(0xFFF3EDF7),
    surfaceContainerHigh = Color(0xFFECE6F0),
    surfaceContainerHighest = Color(0xFFE6E0E9),
    surfaceContainerLow = Color(0xFFF7F2FA),
    surfaceContainerLowest = Color(0xFFFFFFFF),
    surfaceDim = Color(0xFFDED8E1),
)

val darkColors = darkColorScheme(
    primary = Color(0xFFB2EBF2),
    onPrimary = Color(0xFF006064),
    primaryContainer = Color(0xFF004D40),
    onPrimaryContainer = Color(0xFFE0F7FA),
    inversePrimary = Color(0xFF6750A4),

    secondary = Color(0xFFBBDEFB),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFF0D47A1),
    onSecondaryContainer = Color(0xFFE1F5FE),

    tertiary = Color(0xFFFFF9C4),
    onTertiary = Color(0xFF000000),
    tertiaryContainer = Color(0xFFF57F17),
    onTertiaryContainer = Color(0xFFFFE082),

    background = Color(0xFF121212),
    onBackground = Color(0xFFFFFFFF),

    surface = Color(0xFF121212),
    onSurface = Color(0xFFFFFFFF),

    surfaceVariant = Color(0xFF004D40),
    onSurfaceVariant = Color(0xFFB2EBF2),

    surfaceTint = Color(0xFFB2EBF2),

    inverseSurface = Color(0xFFFFFFFF),
    inverseOnSurface = Color(0xFF121212),

    error = Color(0xFFD32F2F),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFE5E5),
    onErrorContainer = Color(0xFFD32F2F),

    outline = Color(0xFFE0E0E0),
    outlineVariant = Color(0xFFD6D6D6),

    scrim = Color(0xFF000000),
    surfaceBright = Color(0xFF3B383E),
    surfaceContainer = Color(0xFF211F26),
    surfaceContainerHigh = Color(0xFF2B2930),
    surfaceContainerHighest = Color(0xFF36343B),
    surfaceContainerLow = Color(0xFF1D1B20),
    surfaceContainerLowest = Color(0xFF0F0D13),
    surfaceDim = Color(0xFF141218),
)

@Composable
fun MyAppTheme(content: @Composable () -> Unit) {

    val mode = Mode.Light



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