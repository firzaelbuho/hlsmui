package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Chocolate
private val chocolateLightColorScheme = lightColorScheme(
    primary = Color(0xFF7B3F00),  // Chocolate brown
    onPrimary = Color(0xFFFFFFFF),  // White text on chocolate
    primaryContainer = Color(0xFFA0522D),  // Lighter chocolate for container
    onPrimaryContainer = Color(0xFFFFFFFF),  // White text on primary container
    inversePrimary = Color(0xFFFFC107),  // Inverse primary color

    secondary = Color(0xFFB5651D),  // Caramel color
    onSecondary = Color(0xFFFFFFFF),  // White text on secondary
    secondaryContainer = Color(0xFFEDC9B5),  // Lighter caramel
    onSecondaryContainer = Color(0xFF000000),  // Black text on secondary container

    tertiary = Color(0xFFD1A152),  // Light tan color
    onTertiary = Color(0xFFFFFFFF),  // White text on tertiary
    tertiaryContainer = Color(0xFFFAE3D9),  // Lighter tan
    onTertiaryContainer = Color(0xFF000000),  // Black text on tertiary container

    background = Color(0xFFF6E4D7),  // Light background resembling milk chocolate
    onBackground = Color(0xFF000000),  // Black for text on background

    surface = Color(0xFFEAE3D2),  // Light surface color
    onSurface = Color(0xFF000000),  // Black for text on surface

    surfaceVariant = Color(0xFF8B5A2B),  // Darker variant for surface
    onSurfaceVariant = Color(0xFFFFFFFF),  // White text on surface variant

    surfaceTint = Color(0xFF7B3F00),  // Tint color for surfaces

    inverseSurface = Color(0xFF3E3E3E),  // Inverse surface color
    inverseOnSurface = Color(0xFFE0E0E0),  // Light text on inverse surface

    error = Color(0xFFD32F2F),  // Error color
    onError = Color(0xFFFFFFFF),  // White text on error
    errorContainer = Color(0xFFFFC107),  // Error container color
    onErrorContainer = Color(0xFFFFFFFF),  // White text on error container

    outline = Color(0xFF7B3F00),  // Outline color matching primary
    outlineVariant = Color(0xFFD1B1A1),  // Light variant for outline

    scrim = Color(0x80000000),  // Semi-transparent black scrim
    surfaceBright = Color(0xFFEAE3D2),  // Bright surface color
    surfaceContainer = Color(0xFFFAE3D9),  // Light pinkish container
    surfaceContainerHigh = Color(0xFFB5651D),  // High container for dark chocolate
    surfaceContainerHighest = Color(0xFF7B3F00),  // Highest container for chocolate
    surfaceContainerLow = Color(0xFFEDD9C4),  // Low container for soft chocolate
    surfaceContainerLowest = Color(0xFFD1B1A1),  // Lowest container for lighter chocolate
    surfaceDim = Color(0xFFB5651D)  // Dim surface color
)

// Dark Color Scheme for Chocolate
private val chocolateDarkColorScheme = darkColorScheme(
    primary = Color(0xFF7B3F00),  // Chocolate brown
    onPrimary = Color(0xFFFFFFFF),  // White text on chocolate
    primaryContainer = Color(0xFFA0522D),  // Darker shade for primary container
    onPrimaryContainer = Color(0xFFFFFFFF),  // White text on primary container

    secondary = Color(0xFFB5651D),  // Caramel color
    onSecondary = Color(0xFFFFFFFF),  // White text on secondary
    secondaryContainer = Color(0xFFEDC9B5),  // Darker caramel
    onSecondaryContainer = Color(0xFFFFFFFF),  // White text on secondary container

    tertiary = Color(0xFFD1A152),  // Light tan color
    onTertiary = Color(0xFFFFFFFF),  // White text on tertiary
    tertiaryContainer = Color(0xFFFAE3D9),  // Lighter tan
    onTertiaryContainer = Color(0xFFFFFFFF),  // White text on tertiary container

    background = Color(0xFF2C2C2C),  // Dark background
    onBackground = Color(0xFFE0E0E0),  // Light text for contrast

    surface = Color(0xFF3E3E3E),  // Dark surface color
    onSurface = Color(0xFFE0E0E0),  // Light text on surface

    surfaceVariant = Color(0xFF8B5A2B),  // Darker variant for surface
    onSurfaceVariant = Color(0xFFE0E0E0),  // Light text on surface variant

    surfaceTint = Color(0xFF7B3F00),  // Tint color for dark surfaces

    inverseSurface = Color(0xFFD0D0D0),  // Light color for inverse surface
    inverseOnSurface = Color(0xFF000000),  // Black text for inverse surface

    error = Color(0xFFD32F2F),  // Error color
    onError = Color(0xFFFFFFFF),  // White text on error
    errorContainer = Color(0xFFFFC107),  // Error container color
    onErrorContainer = Color(0xFFFFFFFF),  // White text on error container

    outline = Color(0xFFD1B1A1),  // Light outline
    outlineVariant = Color(0xFFB0B0B0),  // Light gray outline variant

    scrim = Color(0x80000000),  // Semi-transparent black scrim
    surfaceBright = Color(0xFF555555),  // Bright surface color in dark mode
    surfaceContainer = Color(0xFF3E3E3E),  // Dark container color
    surfaceContainerHigh = Color(0xFFB5651D),  // High container in dark mode
    surfaceContainerHighest = Color(0xFF7B3F00),  // Highest container in dark mode
    surfaceContainerLow = Color(0xFF444444),  // Low container in dark mode
    surfaceContainerLowest = Color(0xFF333333),  // Lowest container in dark mode
    surfaceDim = Color(0xFF222222)  // Dim surface color in dark mode
)

// Combine into HlsmColorScheme
internal val ChocolateColorScheme = HlsmColorScheme(
    lightScheme = chocolateLightColorScheme,
    darkScheme = chocolateDarkColorScheme
)
