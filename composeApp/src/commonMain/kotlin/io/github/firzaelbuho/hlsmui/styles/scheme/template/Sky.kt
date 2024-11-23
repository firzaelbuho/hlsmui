package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Sky
private val skyLightColorScheme = lightColorScheme(
    primary = Color(0xFF87CEEB),  // Sky blue
    onPrimary = Color(0xFF003366),  // Dark blue for contrast on primary
    primaryContainer = Color(0xFFB0E2FF),  // Light sky blue for container
    onPrimaryContainer = Color(0xFF00294D),  // Darker blue for contrast in container

    secondary = Color(0xFFADD8E6),  // Light blue
    onSecondary = Color(0xFF004466),  // Medium dark blue for contrast
    secondaryContainer = Color(0xFFCCE7FF),  // Lighter blue for container
    onSecondaryContainer = Color(0xFF003366),  // Darker blue for text on container

    tertiary = Color(0xFF00BFFF),  // Deep sky blue
    onTertiary = Color(0xFF00263F),  // Dark blue for contrast on tertiary
    tertiaryContainer = Color(0xFF66CFFF),  // Lighter deep sky blue for container
    onTertiaryContainer = Color(0xFF001B2D),  // Darker blue for contrast on container

    background = Color(0xFFE0F7FA),  // Very light cyan for background
    onBackground = Color(0xFF003366),  // Dark blue for text on background

    surface = Color(0xFFE0F7FA),  // Light cyan for surface
    onSurface = Color(0xFF003366),  // Dark blue for contrast on surface
    surfaceVariant = Color(0xFFB0E2FF),  // Light sky blue for surface variant
    onSurfaceVariant = Color(0xFF00294D),  // Dark blue for contrast on variant

    surfaceTint = Color(0xFF87CEEB),  // Tint with sky blue
    inverseSurface = Color(0xFF003366),  // Inverse surface in dark blue
    inverseOnSurface = Color(0xFFE0F7FA),  // Light text on dark inverse surface

    error = Color(0xFFFF6347),  // Tomato red for error
    onError = Color(0xFF660000),  // Dark red for contrast on error
    errorContainer = Color(0xFFFFCCCB),  // Light pink error container
    onErrorContainer = Color(0xFF660000),  // Dark red for contrast in error container

    outline = Color(0xFFADD8E6),  // Light blue outline
    outlineVariant = Color(0xFF87CEEB),  // Sky blue outline variant
    scrim = Color(0xFF000000)  // Black for scrim
)

// Dark Color Scheme for Sky
private val skyDarkColorScheme = darkColorScheme(
    primary = Color(0xFF87CEEB),  // Sky blue
    onPrimary = Color(0xFF003366),  // Dark blue for contrast
    primaryContainer = Color(0xFF004F7A),  // Darker sky blue container
    onPrimaryContainer = Color(0xFFB0E2FF),  // Lighter blue for contrast

    secondary = Color(0xFFADD8E6),  // Light blue for secondary
    onSecondary = Color(0xFF003366),  // Darker blue for contrast
    secondaryContainer = Color(0xFF004C73),  // Darker container blue
    onSecondaryContainer = Color(0xFFCCE7FF),  // Light blue for contrast

    tertiary = Color(0xFF00BFFF),  // Deep sky blue
    onTertiary = Color(0xFF00394D),  // Darker blue for contrast
    tertiaryContainer = Color(0xFF0072A3),  // Darker sky blue for container
    onTertiaryContainer = Color(0xFF66CFFF),  // Lighter blue for contrast

    background = Color(0xFF003366),  // Dark blue for background
    onBackground = Color(0xFFE0F7FA),  // Light cyan text for contrast

    surface = Color(0xFF003366),  // Dark blue surface
    onSurface = Color(0xFFE0F7FA),  // Light cyan for text on surface
    surfaceVariant = Color(0xFF004F7A),  // Darker sky blue for surface variant
    onSurfaceVariant = Color(0xFFB0E2FF),  // Lighter blue for contrast

    surfaceTint = Color(0xFF87CEEB),  // Tint with sky blue
    inverseSurface = Color(0xFFE0F7FA),  // Light cyan surface inverse
    inverseOnSurface = Color(0xFF003366),  // Dark text on light inverse surface

    error = Color(0xFFFF6347),  // Tomato red for error
    onError = Color(0xFFFFE5E5),  // Light text on error
    errorContainer = Color(0xFF660000),  // Dark red error container
    onErrorContainer = Color(0xFFFF6347),  // Light red for contrast

    outline = Color(0xFFADD8E6),  // Light blue outline
    outlineVariant = Color(0xFF87CEEB),  // Sky blue outline variant
    scrim = Color(0xFF000000)  // Black for scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Sky
internal val SkyColorScheme = HlsmColorScheme(
    lightScheme = skyLightColorScheme,
    darkScheme = skyDarkColorScheme
)

