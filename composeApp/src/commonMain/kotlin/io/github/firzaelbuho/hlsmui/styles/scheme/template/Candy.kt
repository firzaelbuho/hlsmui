package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Candy
private val candyLightColorScheme = lightColorScheme(
    primary = Color(0xFFFFC0CB),  // Pink pastel
    onPrimary = Color(0xFF000000),  // Black for text on pink
    primaryContainer = Color(0xFFFFB6C1),  // Lighter pink
    onPrimaryContainer = Color(0xFF000000),  // Black for text on primary container
    inversePrimary = Color(0xFF6200EE),  // Inverse primary color

    secondary = Color(0xFFADD8E6),  // Light blue pastel
    onSecondary = Color(0xFF000000),  // Black text on secondary
    secondaryContainer = Color(0xFFB0E0E6),  // Lighter blue
    onSecondaryContainer = Color(0xFF000000),  // Black text on secondary container

    tertiary = Color(0xFF90EE90),  // Light green pastel
    onTertiary = Color(0xFF000000),  // Black text on tertiary
    tertiaryContainer = Color(0xFF98FB98),  // Lighter green
    onTertiaryContainer = Color(0xFF000000),  // Black text on tertiary container

    background = Color(0xFFFFEFD5),  // Peach puff background
    onBackground = Color(0xFF000000),  // Black for text on background

    surface = Color(0xFFFFF8DC),  // Light yellow surface
    onSurface = Color(0xFF000000),  // Black for text on surface

    surfaceVariant = Color(0xFFFFD700),  // Gold surface variant
    onSurfaceVariant = Color(0xFF000000),  // Black for text on surface variant

    surfaceTint = Color(0xFFFFC0CB),  // Tint color for surfaces

    inverseSurface = Color(0xFF3E3E3E),  // Inverse surface color
    inverseOnSurface = Color(0xFFE0E0E0),  // Light text on inverse surface

    error = Color(0xFFFF6347),  // Tomato red
    onError = Color(0xFFFFFFFF),  // White text on error
    errorContainer = Color(0xFFD32F2F),  // Darker red for error container
    onErrorContainer = Color(0xFFFFFFFF),  // White text on error container

    outline = Color(0xFF000000),  // Black outline
    outlineVariant = Color(0xFFB0B0B0),  // Gray outline variant

    scrim = Color(0x80000000),  // Semi-transparent black scrim
    surfaceBright = Color(0xFFFFF8DC),  // Bright surface color
    surfaceContainer = Color(0xFFFFE0E0),  // Light pink container
    surfaceContainerHigh = Color(0xFFFFC0CB),  // Higher pink container
    surfaceContainerHighest = Color(0xFFFFB6C1),  // Highest pink container
    surfaceContainerLow = Color(0xFFF0F0F0),  // Light gray container
    surfaceContainerLowest = Color(0xFFD0D0D0),  // Darker gray container
    surfaceDim = Color(0xFFC0C0C0)   // Dim surface color
)

// Dark Color Scheme for Candy
private val candyDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFC0CB),  // Pink pastel
    onPrimary = Color(0xFF000000),  // Black for text on pink
    primaryContainer = Color(0xFFB0004E),  // Darker shade for primary container
    onPrimaryContainer = Color(0xFFFFFFFF),  // White text on primary container
    inversePrimary = Color(0xFF6200EE),  // Inverse primary color

    secondary = Color(0xFFADD8E6),  // Light blue pastel
    onSecondary = Color(0xFF000000),  // Black text on secondary
    secondaryContainer = Color(0xFF4682B4),  // Darker blue
    onSecondaryContainer = Color(0xFFFFFFFF),  // White text on secondary container

    tertiary = Color(0xFF90EE90),  // Light green pastel
    onTertiary = Color(0xFF000000),  // Black text on tertiary
    tertiaryContainer = Color(0xFF98FB98),  // Lighter green
    onTertiaryContainer = Color(0xFFFFFFFF),  // White text on tertiary container

    background = Color(0xFF2C2C2C),  // Dark background
    onBackground = Color(0xFFE0E0E0),  // Light text for contrast

    surface = Color(0xFF3E3E3E),  // Dark surface color
    onSurface = Color(0xFFE0E0E0),  // Light text on surface

    surfaceVariant = Color(0xFF555555),  // Darker variant for surface
    onSurfaceVariant = Color(0xFFE0E0E0),  // Light text on surface variant

    surfaceTint = Color(0xFFFFC0CB),  // Tint color for dark surfaces

    inverseSurface = Color(0xFFD0D0D0),  // Light color for inverse surface
    inverseOnSurface = Color(0xFF000000),  // Black text on inverse surface

    error = Color(0xFFD32F2F),  // Error color
    onError = Color(0xFFFFFFFF),  // White text on error
    errorContainer = Color(0xFFFF6347),  // Error container color
    onErrorContainer = Color(0xFFFFFFFF),  // White text on error container

    outline = Color(0xFFD0D0D0),  // Light outline
    outlineVariant = Color(0xFFB0B0B0),  // Light gray outline variant

    scrim = Color(0x80000000),  // Semi-transparent black scrim
    surfaceBright = Color(0xFF555555),  // Bright surface color in dark mode
    surfaceContainer = Color(0xFF3E3E3E),  // Dark container color
    surfaceContainerHigh = Color(0xFF555555),  // High container in dark mode
    surfaceContainerHighest = Color(0xFF7F7F7F),  // Highest container in dark mode
    surfaceContainerLow = Color(0xFF444444),  // Low container in dark mode
    surfaceContainerLowest = Color(0xFF333333),  // Lowest container in dark mode
    surfaceDim = Color(0xFF222222)  // Dim surface color in dark mode
)

// Combine into HlsmColorScheme
internal val CandyColorScheme = HlsmColorScheme(
    lightScheme = candyLightColorScheme,
    darkScheme = candyDarkColorScheme
)
