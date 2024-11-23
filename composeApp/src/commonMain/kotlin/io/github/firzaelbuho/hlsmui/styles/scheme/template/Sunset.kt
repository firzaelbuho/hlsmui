package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Sunset
private val sunsetLightColorScheme = lightColorScheme(
    primary = Color(0xFFFF4500),  // Sunset orange
    onPrimary = Color(0xFF7F2400),  // Dark orange for contrast on primary
    primaryContainer = Color(0xFFFF6F4A),  // Lighter orange for container
    onPrimaryContainer = Color(0xFF4F1500),  // Darker red-orange for text on container

    secondary = Color(0xFFFF8C00),  // Deep orange
    onSecondary = Color(0xFF5F3200),  // Dark brown-orange for contrast
    secondaryContainer = Color(0xFFFFAD66),  // Lighter orange for container
    onSecondaryContainer = Color(0xFF3F1E00),  // Darker brown for contrast

    tertiary = Color(0xFFFC5E72),  // Sunset pink
    onTertiary = Color(0xFF640024),  // Deep red-pink for contrast on tertiary
    tertiaryContainer = Color(0xFFFF94A8),  // Lighter pink for container
    onTertiaryContainer = Color(0xFF3E0012),  // Darker red for contrast

    background = Color(0xFFFFF4E1),  // Light warm beige
    onBackground = Color(0xFF7F2400),  // Dark orange for text on background

    surface = Color(0xFFFFF4E1),  // Light beige for surface
    onSurface = Color(0xFF7F2400),  // Dark orange for text on surface
    surfaceVariant = Color(0xFFFFC2A1),  // Light orange for surface variant
    onSurfaceVariant = Color(0xFF5F3200),  // Dark brown-orange for contrast

    surfaceTint = Color(0xFFFF4500),  // Tint with sunset orange
    inverseSurface = Color(0xFF7F2400),  // Dark orange surface inverse
    inverseOnSurface = Color(0xFFFFE1D4),  // Light beige text for contrast

    error = Color(0xFFB3261E),  // Dark red for error
    onError = Color(0xFFFFDAD4),  // Light pink for text on error
    errorContainer = Color(0xFFFFB4AB),  // Light red container for error
    onErrorContainer = Color(0xFF410E0B),  // Dark red contrast in error container

    outline = Color(0xFF8D4500),  // Brownish-orange outline
    outlineVariant = Color(0xFFFFA070),  // Lighter orange outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Sunset
private val sunsetDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFF6F4A),  // Sunset orange
    onPrimary = Color(0xFF4F1500),  // Darker red-orange for contrast
    primaryContainer = Color(0xFF7F2400),  // Dark orange container
    onPrimaryContainer = Color(0xFFFFAD66),  // Lighter orange for contrast

    secondary = Color(0xFFFFAD66),  // Light orange for secondary
    onSecondary = Color(0xFF5F3200),  // Dark brown-orange for contrast
    secondaryContainer = Color(0xFF5F3200),  // Dark brown container
    onSecondaryContainer = Color(0xFFFFAD66),  // Lighter orange for contrast

    tertiary = Color(0xFFFF94A8),  // Sunset pink
    onTertiary = Color(0xFF3E0012),  // Darker red-pink for contrast
    tertiaryContainer = Color(0xFF640024),  // Deep red container for tertiary
    onTertiaryContainer = Color(0xFFFF94A8),  // Lighter pink for contrast

    background = Color(0xFF4F1500),  // Dark sunset orange for background
    onBackground = Color(0xFFFFE1D4),  // Light warm beige for contrast

    surface = Color(0xFF4F1500),  // Dark orange surface
    onSurface = Color(0xFFFFE1D4),  // Light warm beige for contrast
    surfaceVariant = Color(0xFF7F2400),  // Darker surface variant
    onSurfaceVariant = Color(0xFFFFC2A1),  // Lighter orange for contrast

    surfaceTint = Color(0xFFFF6F4A),  // Tint with sunset orange
    inverseSurface = Color(0xFFFFE1D4),  // Light warm surface inverse
    inverseOnSurface = Color(0xFF4F1500),  // Dark text on light inverse surface

    error = Color(0xFFB3261E),  // Dark red for error
    onError = Color(0xFFFFDAD4),  // Light pink for text on error
    errorContainer = Color(0xFF8C1D18),  // Darker red for error container
    onErrorContainer = Color(0xFFFFB4AB),  // Light red for contrast

    outline = Color(0xFFFFA070),  // Lighter orange outline
    outlineVariant = Color(0xFF8D4500),  // Brownish-orange outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Sunset
internal val SunsetColorScheme = HlsmColorScheme(
    lightScheme = sunsetLightColorScheme,
    darkScheme = sunsetDarkColorScheme
)
