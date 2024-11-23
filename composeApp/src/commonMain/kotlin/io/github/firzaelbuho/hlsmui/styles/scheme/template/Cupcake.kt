package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Cupcake
private val cupcakeLightColorScheme = lightColorScheme(
    primary = Color(0xFFFF6F61),  // Pinkish color for cupcake frosting
    onPrimary = Color(0xFFFFFFFF),  // White text on primary
    primaryContainer = Color(0xFFFFC1C1),  // Light pink for container
    onPrimaryContainer = Color(0xFF000000),  // Black text on primary container
    inversePrimary = Color(0xFFD32F2F),  // Inverse primary color

    secondary = Color(0xFF66BB6A),  // Green for cupcake decoration
    onSecondary = Color(0xFFFFFFFF),  // White text on secondary
    secondaryContainer = Color(0xFFA5D6A7),  // Lighter green
    onSecondaryContainer = Color(0xFF000000),  // Black text on secondary container

    tertiary = Color(0xFFFFD54F),  // Yellow for sprinkles
    onTertiary = Color(0xFF000000),  // Black text on tertiary
    tertiaryContainer = Color(0xFFFFF9C4),  // Light yellow
    onTertiaryContainer = Color(0xFF000000),  // Black text on tertiary container

    background = Color(0xFFF8BBD0),  // Light background resembling cupcake base
    onBackground = Color(0xFF000000),  // Black for text on background

    surface = Color(0xFFFFEBEE),  // Light surface color
    onSurface = Color(0xFF000000),  // Black for text on surface

    surfaceVariant = Color(0xFFE0B2B2),  // Darker variant for surface
    onSurfaceVariant = Color(0xFF000000),  // Black text on surface variant

    surfaceTint = Color(0xFFFF6F61),  // Tint color for surfaces

    inverseSurface = Color(0xFF424242),  // Inverse surface color
    inverseOnSurface = Color(0xFFE0E0E0),  // Light text on inverse surface

    error = Color(0xFFD32F2F),  // Error color
    onError = Color(0xFFFFFFFF),  // White text on error
    errorContainer = Color(0xFFFFC1C1),  // Error container color
    onErrorContainer = Color(0xFF000000),  // Black text on error container

    outline = Color(0xFFFF6F61),  // Outline color matching primary
    outlineVariant = Color(0xFFE57373),  // Light variant for outline

    scrim = Color(0x80000000),  // Semi-transparent black scrim
    surfaceBright = Color(0xFFFFEBEE),  // Bright surface color
    surfaceContainer = Color(0xFFFAFAFA),  // Light container color
    surfaceContainerHigh = Color(0xFFFFC1C1),  // High container for frosting
    surfaceContainerHighest = Color(0xFFFF6F61),  // Highest container for frosting
    surfaceContainerLow = Color(0xFFEF9A9A),  // Low container for soft cupcake
    surfaceContainerLowest = Color(0xFFE57373),  // Lowest container for darker pink
    surfaceDim = Color(0xFFEF5350)  // Dim surface color
)

// Dark Color Scheme for Cupcake
private val cupcakeDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFF6F61),  // Pinkish color for cupcake frosting
    onPrimary = Color(0xFFFFFFFF),  // White text on primary
    primaryContainer = Color(0xFFFFC1C1),  // Darker shade for primary container
    onPrimaryContainer = Color(0xFF000000),  // Black text on primary container

    secondary = Color(0xFF66BB6A),  // Green for cupcake decoration
    onSecondary = Color(0xFFFFFFFF),  // White text on secondary
    secondaryContainer = Color(0xFFA5D6A7),  // Darker green
    onSecondaryContainer = Color(0xFFFFFFFF),  // White text on secondary container

    tertiary = Color(0xFFFFD54F),  // Yellow for sprinkles
    onTertiary = Color(0xFF000000),  // Black text on tertiary
    tertiaryContainer = Color(0xFFFFF9C4),  // Lighter yellow
    onTertiaryContainer = Color(0xFF000000),  // Black text on tertiary container

    background = Color(0xFF424242),  // Dark background
    onBackground = Color(0xFFE0E0E0),  // Light text for contrast

    surface = Color(0xFF3E3E3E),  // Dark surface color
    onSurface = Color(0xFFE0E0E0),  // Light text on surface

    surfaceVariant = Color(0xFFE0B2B2),  // Darker variant for surface
    onSurfaceVariant = Color(0xFFFFFFFF),  // White text on surface variant

    surfaceTint = Color(0xFFFF6F61),  // Tint color for dark surfaces

    inverseSurface = Color(0xFFD0D0D0),  // Light color for inverse surface
    inverseOnSurface = Color(0xFF000000),  // Black text for inverse surface

    error = Color(0xFFD32F2F),  // Error color
    onError = Color(0xFFFFFFFF),  // White text on error
    errorContainer = Color(0xFFFFC1C1),  // Error container color
    onErrorContainer = Color(0xFF000000),  // Black text on error container

    outline = Color(0xFFFF6F61),  // Light outline
    outlineVariant = Color(0xFFE57373),  // Light gray outline variant

    scrim = Color(0x80000000),  // Semi-transparent black scrim
    surfaceBright = Color(0xFF555555),  // Bright surface color in dark mode
    surfaceContainer = Color(0xFF3E3E3E),  // Dark container color
    surfaceContainerHigh = Color(0xFF66BB6A),  // High container in dark mode
    surfaceContainerHighest = Color(0xFFFF6F61),  // Highest container in dark mode
    surfaceContainerLow = Color(0xFF444444),  // Low container in dark mode
    surfaceContainerLowest = Color(0xFF333333),  // Lowest container in dark mode
    surfaceDim = Color(0xFF222222)  // Dim surface color in dark mode
)

// Combine into HlsmColorScheme
internal val CupcakeColorScheme = HlsmColorScheme(
    lightScheme = cupcakeLightColorScheme,
    darkScheme = cupcakeDarkColorScheme
)
