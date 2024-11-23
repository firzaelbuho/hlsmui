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

@Composable
fun MyAppTheme(content: @Composable () -> Unit) {

    val mode = Mode.Light

    // Light and dark color schemes
    val lightColors = lightColorScheme(
        primary = Color(0xFFFFC0CB),
        onPrimary = Color(0xFF000000),
        primaryContainer = Color(0xFFFFB6C1),
        onPrimaryContainer = Color(0xFF000000),
        inversePrimary = Color(0xFF6200EE),

        secondary = Color(0xFFADD8E6),
        onSecondary = Color(0xFF000000),
        secondaryContainer = Color(0xFFB0E0E6),
        onSecondaryContainer = Color(0xFF000000),

        tertiary = Color(0xFF90EE90),
        onTertiary = Color(0xFF000000),
        tertiaryContainer = Color(0xFF98FB98),
        onTertiaryContainer = Color(0xFF000000),

        background = Color(0xFFFFEFD5),
        onBackground = Color(0xFF000000),

        surface = Color(0xFFFFF8DC),
        onSurface = Color(0xFF000000),

        surfaceVariant = Color(0xFFFFD700),
        onSurfaceVariant = Color(0xFF000000),

        surfaceTint = Color(0xFFFFC0CB),

        inverseSurface = Color(0xFF3E3E3E),
        inverseOnSurface = Color(0xFFE0E0E0),

        error = Color(0xFFFF6347),
        onError = Color(0xFFFFFFFF),
        errorContainer = Color(0xFFD32F2F),
        onErrorContainer = Color(0xFFFFFFFF),

        outline = Color(0xFF000000),
        outlineVariant = Color(0xFFB0B0B0),

        scrim = Color(0x80000000),
        surfaceBright = Color(0xFFFFF8DC),
        surfaceContainer = Color(0xFFFFE0E0),
        surfaceContainerHigh = Color(0xFFFFC0CB),
        surfaceContainerHighest = Color(0xFFFFB6C1),
        surfaceContainerLow = Color(0xFFF0F0F0),
        surfaceContainerLowest = Color(0xFFD0D0D0),
        surfaceDim = Color(0xFFC0C0C0),
    )

    val darkColors = darkColorScheme(
        primary = Color(0xFFFFC0CB),
        onPrimary = Color(0xFF000000),
        primaryContainer = Color(0xFFB0004E),
        onPrimaryContainer = Color(0xFFFFFFFF),
        inversePrimary = Color(0xFF6200EE),

        secondary = Color(0xFFADD8E6),
        onSecondary = Color(0xFF000000),
        secondaryContainer = Color(0xFF4682B4),
        onSecondaryContainer = Color(0xFFFFFFFF),

        tertiary = Color(0xFF90EE90),
        onTertiary = Color(0xFF000000),
        tertiaryContainer = Color(0xFF98FB98),
        onTertiaryContainer = Color(0xFFFFFFFF),

        background = Color(0xFF2C2C2C),
        onBackground = Color(0xFFE0E0E0),

        surface = Color(0xFF3E3E3E),
        onSurface = Color(0xFFE0E0E0),

        surfaceVariant = Color(0xFF555555),
        onSurfaceVariant = Color(0xFFE0E0E0),

        surfaceTint = Color(0xFFFFC0CB),

        inverseSurface = Color(0xFFD0D0D0),
        inverseOnSurface = Color(0xFF000000),

        error = Color(0xFFD32F2F),
        onError = Color(0xFFFFFFFF),
        errorContainer = Color(0xFFFF6347),
        onErrorContainer = Color(0xFFFFFFFF),

        outline = Color(0xFFD0D0D0),
        outlineVariant = Color(0xFFB0B0B0),

        scrim = Color(0x80000000),
        surfaceBright = Color(0xFF555555),
        surfaceContainer = Color(0xFF3E3E3E),
        surfaceContainerHigh = Color(0xFF555555),
        surfaceContainerHighest = Color(0xFF7F7F7F),
        surfaceContainerLow = Color(0xFF444444),
        surfaceContainerLowest = Color(0xFF333333),
        surfaceDim = Color(0xFF222222),
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