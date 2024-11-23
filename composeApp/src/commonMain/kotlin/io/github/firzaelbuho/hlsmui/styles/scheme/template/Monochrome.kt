package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Monochrome
private val monochromeLightColorScheme = lightColorScheme(
    primary = Color(0xFF000000),  // Black
    onPrimary = Color(0xFFFFFFFF),  // White for text on primary
    primaryContainer = Color(0xFFE0E0E0),  // Light Grey for primary container
    onPrimaryContainer = Color(0xFF000000),  // Black for text on primary container

    secondary = Color(0xFF757575),  // Medium Grey
    onSecondary = Color(0xFFFFFFFF),  // White for text on secondary
    secondaryContainer = Color(0xFFBDBDBD),  // Light Grey for secondary container
    onSecondaryContainer = Color(0xFF000000),  // Black for text on secondary container

    tertiary = Color(0xFFB0BEC5),  // Light Blue Grey
    onTertiary = Color(0xFF000000),  // Black for text on tertiary
    tertiaryContainer = Color(0xFFECEFF1),  // Very Light Blue Grey for tertiary container
    onTertiaryContainer = Color(0xFF000000),  // Black for text on tertiary container

    background = Color(0xFFFFFFFF),  // White background
    onBackground = Color(0xFF000000),  // Black for text on background

    surface = Color(0xFFFFFFFF),  // White surface
    onSurface = Color(0xFF000000),  // Black for text on surface
    surfaceVariant = Color(0xFFE0E0E0),  // Light Grey for surface variant
    onSurfaceVariant = Color(0xFF000000),  // Black for text on surface variant

    surfaceTint = Color(0xFF000000),  // Black tint
    inverseSurface = Color(0xFF000000),  // Black for inverse surface
    inverseOnSurface = Color(0xFFFFFFFF),  // White for text on inverse surface

    error = Color(0xFFD32F2F),  // Standard red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFFFE5E5),  // Light red for error container
    onErrorContainer = Color(0xFFD32F2F),  // Dark red for text on error container

    outline = Color(0xFFBDBDBD),  // Medium Grey for outline
    outlineVariant = Color(0xFFE0E0E0),  // Light Grey for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Monochrome
private val monochromeDarkColorScheme = darkColorScheme(
    primary = Color(0xFF000000),  // Black for primary
    onPrimary = Color(0xFFFFFFFF),  // White for text on primary
    primaryContainer = Color(0xFF212121),  // Dark Grey for primary container
    onPrimaryContainer = Color(0xFFE0E0E0),  // Light Grey for text on primary container

    secondary = Color(0xFFBDBDBD),  // Light Grey for secondary
    onSecondary = Color(0xFF000000),  // Black for text on secondary
    secondaryContainer = Color(0xFF757575),  // Medium Grey for secondary container
    onSecondaryContainer = Color(0xFFFFFFFF),  // White for text on secondary container

    tertiary = Color(0xFF90A4AE),  // Blue Grey
    onTertiary = Color(0xFFFFFFFF),  // White for text on tertiary
    tertiaryContainer = Color(0xFF607D8B),  // Dark Blue Grey for tertiary container
    onTertiaryContainer = Color(0xFFE0F7FA),  // Very Light Cyan for text on tertiary container

    background = Color(0xFF121212),  // Dark background
    onBackground = Color(0xFFFFFFFF),  // White for text on background

    surface = Color(0xFF121212),  // Dark surface
    onSurface = Color(0xFFFFFFFF),  // White for text on surface
    surfaceVariant = Color(0xFF424242),  // Dark Grey for surface variant
    onSurfaceVariant = Color(0xFFE0E0E0),  // Light Grey for text on surface variant

    surfaceTint = Color(0xFF000000),  // Black tint
    inverseSurface = Color(0xFFFFFFFF),  // White for inverse surface
    inverseOnSurface = Color(0xFF121212),  // Dark for text on inverse surface

    error = Color(0xFFD32F2F),  // Standard red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFFFE5E5),  // Light red for error container
    onErrorContainer = Color(0xFFD32F2F),  // Dark red for text on error container

    outline = Color(0xFFBDBDBD),  // Medium Grey for outline
    outlineVariant = Color(0xFFE0E0E0),  // Light Grey for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Monochrome
internal val MonochromeColorScheme = HlsmColorScheme(
    lightScheme = monochromeLightColorScheme,
    darkScheme = monochromeDarkColorScheme
)
