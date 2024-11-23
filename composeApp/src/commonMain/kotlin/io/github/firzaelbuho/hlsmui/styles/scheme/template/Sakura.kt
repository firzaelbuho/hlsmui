package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Sakura
private val sakuraLightColorScheme = lightColorScheme(
    primary = Color(0xFFFEC8D8),  // Light Pink
    onPrimary = Color(0xFF4A4A4A),  // Dark Gray for text on primary
    primaryContainer = Color(0xFFF9E1E6),  // Soft Pink for primary container
    onPrimaryContainer = Color(0xFFB0002B),  // Dark Pink for text on primary container

    secondary = Color(0xFFE1BEE7),  // Lavender
    onSecondary = Color(0xFF4A4A4A),  // Dark Gray for text on secondary
    secondaryContainer = Color(0xFFF3E5F5),  // Light Lavender for secondary container
    onSecondaryContainer = Color(0xFF6A1B9A),  // Dark Lavender for text on secondary container

    tertiary = Color(0xFFB2DFDB),  // Light Teal
    onTertiary = Color(0xFF004D40),  // Dark Teal for text on tertiary
    tertiaryContainer = Color(0xFFB2EBF2),  // Light Aqua for tertiary container
    onTertiaryContainer = Color(0xFF00695C),  // Dark Aqua for text on tertiary container

    background = Color(0xFFFFFFFF),  // White background
    onBackground = Color(0xFF4A4A4A),  // Dark Gray for text on background

    surface = Color(0xFFFFFFFF),  // White surface
    onSurface = Color(0xFF4A4A4A),  // Dark Gray for text on surface
    surfaceVariant = Color(0xFFF3E5F5),  // Light Lavender for surface variant
    onSurfaceVariant = Color(0xFF6A1B9A),  // Dark Lavender for text on surface variant

    surfaceTint = Color(0xFFFEC8D8),  // Light Pink tint
    inverseSurface = Color(0xFF4A4A4A),  // Dark Gray for inverse surface
    inverseOnSurface = Color(0xFFFFFFFF),  // White for text on inverse surface

    error = Color(0xFFD32F2F),  // Standard red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFFFE5E5),  // Light red for error container
    onErrorContainer = Color(0xFFD32F2F),  // Dark red for text on error container

    outline = Color(0xFFB0BEC5),  // Grey for outline
    outlineVariant = Color(0xFFE0E0E0),  // Light grey for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Sakura
private val sakuraDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFEC8D8),  // Light Pink for primary
    onPrimary = Color(0xFF4A4A4A),  // Dark Gray for text on primary
    primaryContainer = Color(0xFFB0002B),  // Dark Pink for primary container
    onPrimaryContainer = Color(0xFFF9E1E6),  // Soft Pink for text on primary container

    secondary = Color(0xFFE1BEE7),  // Lavender for secondary
    onSecondary = Color(0xFF4A4A4A),  // Dark Gray for text on secondary
    secondaryContainer = Color(0xFF6A1B9A),  // Dark Lavender for secondary container
    onSecondaryContainer = Color(0xFFF3E5F5),  // Light Lavender for text on secondary container

    tertiary = Color(0xFFB2DFDB),  // Light Teal for tertiary
    onTertiary = Color(0xFFFFFFFF),  // White for text on tertiary
    tertiaryContainer = Color(0xFF00695C),  // Dark Aqua for tertiary container
    onTertiaryContainer = Color(0xFFB2EBF2),  // Light Aqua for text on tertiary container

    background = Color(0xFF1A1A1A),  // Dark grey for background
    onBackground = Color(0xFFFFFFFF),  // White for text on background

    surface = Color(0xFF1A1A1A),  // Dark grey for surface
    onSurface = Color(0xFFFFFFFF),  // White for text on surface
    surfaceVariant = Color(0xFF6A1B9A),  // Dark Lavender for surface variant
    onSurfaceVariant = Color(0xFFFEC8D8),  // Light Pink for text on surface variant

    surfaceTint = Color(0xFFFEC8D8),  // Light Pink tint
    inverseSurface = Color(0xFFF9E1E6),  // Soft Pink for inverse surface
    inverseOnSurface = Color(0xFF4A4A4A),  // Dark Gray for text on inverse surface

    error = Color(0xFFFFE5E5),  // Light red for error
    onError = Color(0xFFD32F2F),  // Dark red for text on error
    errorContainer = Color(0xFFD32F2F),  // Dark red for error container
    onErrorContainer = Color(0xFFFFE5E5),  // Light red for text on error container

    outline = Color(0xFFB0BEC5),  // Grey for outline
    outlineVariant = Color(0xFFE0E0E0),  // Light grey for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Sakura
internal val SakuraColorScheme = HlsmColorScheme(
    lightScheme = sakuraLightColorScheme,
    darkScheme = sakuraDarkColorScheme
)
