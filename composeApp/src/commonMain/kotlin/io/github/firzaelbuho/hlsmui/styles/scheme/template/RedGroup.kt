package io.github.firzaelbuho.hlsmui.styles.scheme.template
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for RedGroup
private val redGroupLightColorScheme = lightColorScheme(
    primary = Color(0xFFD50000),  // Red JKT48
    onPrimary = Color(0xFFFFFFFF),  // White for text on primary
    primaryContainer = Color(0xFFFFCDD2),  // Light red for primary container
    onPrimaryContainer = Color(0xFFB71C1C),  // Dark red for text on primary container

    secondary = Color(0xFFC2185B),  // Pinkish red for secondary
    onSecondary = Color(0xFFFFFFFF),  // White for text on secondary
    secondaryContainer = Color(0xFFF8BBD0),  // Light pink for secondary container
    onSecondaryContainer = Color(0xFF880E4F),  // Dark pink for text on secondary container

    tertiary = Color(0xFFFF5722),  // Orange-red for accent
    onTertiary = Color(0xFFFFFFFF),  // White for text on tertiary
    tertiaryContainer = Color(0xFFFFAB91),  // Light orange for tertiary container
    onTertiaryContainer = Color(0xFFBF360C),  // Dark orange for text on tertiary container

    background = Color(0xFFFFEBEE),  // Light pinkish red background
    onBackground = Color(0xFFB71C1C),  // Dark red for text on background

    surface = Color(0xFFFFEBEE),  // Light pinkish red surface
    onSurface = Color(0xFFB71C1C),  // Dark red for text on surface
    surfaceVariant = Color(0xFFE57373),  // Red variant for surface
    onSurfaceVariant = Color(0xFFB71C1C),  // Dark red for text on surface variant

    surfaceTint = Color(0xFFD50000),  // Tint with red JKT48
    inverseSurface = Color(0xFFB71C1C),  // Dark red for inverse surface
    inverseOnSurface = Color(0xFFFFEBEE),  // Light pink for text on inverse surface

    error = Color(0xFFB71C1C),  // Dark red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFFFCDD2),  // Light red for error container
    onErrorContainer = Color(0xFFB71C1C),  // Dark red for text on error container

    outline = Color(0xFFD32F2F),  // Deep red for outline
    outlineVariant = Color(0xFFEF9A9A),  // Light red for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for RedGroup
private val redGroupDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFCDD2),  // Light red for primary
    onPrimary = Color(0xFFB71C1C),  // Dark red for text on primary
    primaryContainer = Color(0xFFD50000),  // Red JKT48 for primary container
    onPrimaryContainer = Color(0xFFFFEBEE),  // Light pink for text on primary container

    secondary = Color(0xFFF8BBD0),  // Light pink for secondary
    onSecondary = Color(0xFF880E4F),  // Dark pink for text on secondary
    secondaryContainer = Color(0xFFC2185B),  // Pinkish red for secondary container
    onSecondaryContainer = Color(0xFFFFEBEE),  // Light pink for text on secondary container

    tertiary = Color(0xFFFFAB91),  // Light orange for tertiary
    onTertiary = Color(0xFFBF360C),  // Dark orange for text on tertiary
    tertiaryContainer = Color(0xFFFF5722),  // Orange-red for tertiary container
    onTertiaryContainer = Color(0xFFFFEBEE),  // Light pink for text on tertiary container

    background = Color(0xFFB71C1C),  // Dark red for background
    onBackground = Color(0xFFFFCDD2),  // Light red for text on background

    surface = Color(0xFFB71C1C),  // Dark red for surface
    onSurface = Color(0xFFFFCDD2),  // Light red for text on surface
    surfaceVariant = Color(0xFFE57373),  // Red variant for surface
    onSurfaceVariant = Color(0xFFFFEBEE),  // Light pink for text on surface variant

    surfaceTint = Color(0xFFFFCDD2),  // Tint with light red
    inverseSurface = Color(0xFFFFCDD2),  // Light red for inverse surface
    inverseOnSurface = Color(0xFFB71C1C),  // Dark red for text on inverse surface

    error = Color(0xFFEF9A9A),  // Light red for error
    onError = Color(0xFFB71C1C),  // Dark red for text on error
    errorContainer = Color(0xFFD50000),  // Red JKT48 for error container
    onErrorContainer = Color(0xFFFFEBEE),  // Light pink for text on error container

    outline = Color(0xFFD32F2F),  // Deep red for outline
    outlineVariant = Color(0xFFE57373),  // Light red for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for RedGroup
internal val RedGroupColorScheme = HlsmColorScheme(
    lightScheme = redGroupLightColorScheme,
    darkScheme = redGroupDarkColorScheme
)

