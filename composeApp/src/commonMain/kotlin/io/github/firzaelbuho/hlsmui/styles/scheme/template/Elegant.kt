package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Elegant
private val elegantLightColorScheme = lightColorScheme(
    primary = Color(0xFF3D5AFE),  // Elegant blue for primary color
    onPrimary = Color(0xFFFFFFFF),  // White text on primary
    primaryContainer = Color(0xFFE8EAF6),  // Light container for primary
    onPrimaryContainer = Color(0xFF000000),  // Black text on primary container
    inversePrimary = Color(0xFFFFC107),  // Inverse primary color

    secondary = Color(0xFF4CAF50),  // Elegant green for secondary
    onSecondary = Color(0xFFFFFFFF),  // White text on secondary
    secondaryContainer = Color(0xFFD8F8D4),  // Light green container
    onSecondaryContainer = Color(0xFF000000),  // Black text on secondary container

    tertiary = Color(0xFFFFC107),  // Gold for elegance
    onTertiary = Color(0xFF000000),  // Black text on tertiary
    tertiaryContainer = Color(0xFFFFF9C4),  // Light gold
    onTertiaryContainer = Color(0xFF000000),  // Black text on tertiary container

    background = Color(0xFFF5F5F5),  // Light gray background for elegance
    onBackground = Color(0xFF000000),  // Black for text on background

    surface = Color(0xFFFFFFFF),  // White surface color
    onSurface = Color(0xFF000000),  // Black text on surface

    surfaceVariant = Color(0xFFE0E0E0),  // Light gray variant for surface
    onSurfaceVariant = Color(0xFF000000),  // Black text on surface variant

    surfaceTint = Color(0xFF3D5AFE),  // Tint color for surfaces

    inverseSurface = Color(0xFF424242),  // Inverse surface color
    inverseOnSurface = Color(0xFFE0E0E0),  // Light text on inverse surface

    error = Color(0xFFD32F2F),  // Error color
    onError = Color(0xFFFFFFFF),  // White text on error
    errorContainer = Color(0xFFFFC1C1),  // Error container color
    onErrorContainer = Color(0xFF000000),  // Black text on error container

    outline = Color(0xFF3D5AFE),  // Outline color matching primary
    outlineVariant = Color(0xFFE0E0E0),  // Light variant for outline

    scrim = Color(0x80000000),  // Semi-transparent black scrim
    surfaceBright = Color(0xFFFFFFFF),  // Bright surface color
    surfaceContainer = Color(0xFFF5F5F5),  // Light container color
    surfaceContainerHigh = Color(0xFFE0E0E0),  // High container for soft elements
    surfaceContainerHighest = Color(0xFF3D5AFE),  // Highest container for accent
    surfaceContainerLow = Color(0xFFCCCCCC),  // Low container for subtle elements
    surfaceContainerLowest = Color(0xFFB0BEC5),  // Lowest container for even subtler elements
    surfaceDim = Color(0xFF9E9E9E)  // Dim surface color
)

// Dark Color Scheme for Elegant
private val elegantDarkColorScheme = darkColorScheme(
    primary = Color(0xFF3D5AFE),  // Elegant blue for primary color
    onPrimary = Color(0xFFFFFFFF),  // White text on primary
    primaryContainer = Color(0xFFE8EAF6),  // Darker shade for primary container
    onPrimaryContainer = Color(0xFF000000),  // Black text on primary container

    secondary = Color(0xFF4CAF50),  // Elegant green for secondary
    onSecondary = Color(0xFFFFFFFF),  // White text on secondary
    secondaryContainer = Color(0xFFD8F8D4),  // Darker green
    onSecondaryContainer = Color(0xFFFFFFFF),  // White text on secondary container

    tertiary = Color(0xFFFFC107),  // Gold for elegance
    onTertiary = Color(0xFF000000),  // Black text on tertiary
    tertiaryContainer = Color(0xFFFFF9C4),  // Lighter gold
    onTertiaryContainer = Color(0xFF000000),  // Black text on tertiary container

    background = Color(0xFF121212),  // Dark background
    onBackground = Color(0xFFE0E0E0),  // Light text for contrast

    surface = Color(0xFF1E1E1E),  // Dark surface color
    onSurface = Color(0xFFE0E0E0),  // Light text on surface

    surfaceVariant = Color(0xFFE0E0E0),  // Darker variant for surface
    onSurfaceVariant = Color(0xFFFFFFFF),  // White text on surface variant

    surfaceTint = Color(0xFF3D5AFE),  // Tint color for dark surfaces

    inverseSurface = Color(0xFFD0D0D0),  // Light color for inverse surface
    inverseOnSurface = Color(0xFF000000),  // Black text for inverse surface

    error = Color(0xFFD32F2F),  // Error color
    onError = Color(0xFFFFFFFF),  // White text on error
    errorContainer = Color(0xFFFFC1C1),  // Error container color
    onErrorContainer = Color(0xFF000000),  // Black text on error container

    outline = Color(0xFF3D5AFE),  // Light outline
    outlineVariant = Color(0xFFE0E0E0),  // Light gray outline variant

    scrim = Color(0x80000000),  // Semi-transparent black scrim
    surfaceBright = Color(0xFF555555),  // Bright surface color in dark mode
    surfaceContainer = Color(0xFF1E1E1E),  // Dark container color
    surfaceContainerHigh = Color(0xFF4CAF50),  // High container in dark mode
    surfaceContainerHighest = Color(0xFF3D5AFE),  // Highest container in dark mode
    surfaceContainerLow = Color(0xFFCCCCCC),  // Low container in dark mode
    surfaceContainerLowest = Color(0xFFB0BEC5),  // Lowest container in dark mode
    surfaceDim = Color(0xFF222222)  // Dim surface color in dark mode
)

// Combine into HlsmColorScheme
internal val ElegantColorScheme = HlsmColorScheme(
    lightScheme = elegantLightColorScheme,
    darkScheme = elegantDarkColorScheme
)

