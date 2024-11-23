package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Snow
private val snowLightColorScheme = lightColorScheme(
    primary = Color(0xFFB2EBF2),  // Light Cyan
    onPrimary = Color(0xFF006064),  // Dark Cyan for text on primary
    primaryContainer = Color(0xFFE0F7FA),  // Very Light Cyan for primary container
    onPrimaryContainer = Color(0xFF004D40),  // Dark Teal for text on primary container

    secondary = Color(0xFFE1F5FE),  // Light Blue
    onSecondary = Color(0xFF0D47A1),  // Dark Blue for text on secondary
    secondaryContainer = Color(0xFFBBDEFB),  // Soft Blue for secondary container
    onSecondaryContainer = Color(0xFF0D47A1),  // Dark Blue for text on secondary container

    tertiary = Color(0xFFFFE082),  // Light Yellow
    onTertiary = Color(0xFF6A1B9A),  // Dark Purple for text on tertiary
    tertiaryContainer = Color(0xFFFFF9C4),  // Very Light Yellow for tertiary container
    onTertiaryContainer = Color(0xFFF57F17),  // Dark Gold for text on tertiary container

    background = Color(0xFFFFFFFF),  // White background
    onBackground = Color(0xFF212121),  // Dark Gray for text on background

    surface = Color(0xFFFFFFFF),  // White surface
    onSurface = Color(0xFF212121),  // Dark Gray for text on surface
    surfaceVariant = Color(0xFFE0F7FA),  // Light Cyan for surface variant
    onSurfaceVariant = Color(0xFF004D40),  // Dark Teal for text on surface variant

    surfaceTint = Color(0xFFB2EBF2),  // Light Cyan tint
    inverseSurface = Color(0xFF212121),  // Dark Gray for inverse surface
    inverseOnSurface = Color(0xFFFFFFFF),  // White for text on inverse surface

    error = Color(0xFFD32F2F),  // Standard red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFFFE5E5),  // Light red for error container
    onErrorContainer = Color(0xFFD32F2F),  // Dark red for text on error container

    outline = Color(0xFFE0E0E0),  // Light Grey for outline
    outlineVariant = Color(0xFFD6D6D6),  // Very Light Grey for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Snow
private val snowDarkColorScheme = darkColorScheme(
    primary = Color(0xFFB2EBF2),  // Light Cyan for primary
    onPrimary = Color(0xFF006064),  // Dark Cyan for text on primary
    primaryContainer = Color(0xFF004D40),  // Dark Teal for primary container
    onPrimaryContainer = Color(0xFFE0F7FA),  // Very Light Cyan for text on primary container

    secondary = Color(0xFFBBDEFB),  // Soft Blue for secondary
    onSecondary = Color(0xFFFFFFFF),  // White for text on secondary
    secondaryContainer = Color(0xFF0D47A1),  // Dark Blue for secondary container
    onSecondaryContainer = Color(0xFFE1F5FE),  // Light Blue for text on secondary container

    tertiary = Color(0xFFFFF9C4),  // Very Light Yellow for tertiary
    onTertiary = Color(0xFF000000),  // Black for text on tertiary
    tertiaryContainer = Color(0xFFF57F17),  // Dark Gold for tertiary container
    onTertiaryContainer = Color(0xFFFFE082),  // Light Yellow for text on tertiary container

    background = Color(0xFF121212),  // Dark background
    onBackground = Color(0xFFFFFFFF),  // White for text on background

    surface = Color(0xFF121212),  // Dark surface
    onSurface = Color(0xFFFFFFFF),  // White for text on surface
    surfaceVariant = Color(0xFF004D40),  // Dark Teal for surface variant
    onSurfaceVariant = Color(0xFFB2EBF2),  // Light Cyan for text on surface variant

    surfaceTint = Color(0xFFB2EBF2),  // Light Cyan tint
    inverseSurface = Color(0xFFFFFFFF),  // White for inverse surface
    inverseOnSurface = Color(0xFF121212),  // Dark for text on inverse surface

    error = Color(0xFFD32F2F),  // Standard red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFFFE5E5),  // Light red for error container
    onErrorContainer = Color(0xFFD32F2F),  // Dark red for text on error container

    outline = Color(0xFFE0E0E0),  // Light Grey for outline
    outlineVariant = Color(0xFFD6D6D6),  // Very Light Grey for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Snow
internal val SnowColorScheme = HlsmColorScheme(
    lightScheme = snowLightColorScheme,
    darkScheme = snowDarkColorScheme
)
