package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Luxury
private val luxuryLightColorScheme = lightColorScheme(
    primary = Color(0xFFD4AF37),  // Gold
    onPrimary = Color(0xFF000000),  // Black for text on primary
    primaryContainer = Color(0xFFFFF8E1),  // Light cream for primary container
    onPrimaryContainer = Color(0xFF6A4B2C),  // Dark brown for text on primary container

    secondary = Color(0xFF8B4513),  // SaddleBrown
    onSecondary = Color(0xFFFFFFFF),  // White for text on secondary
    secondaryContainer = Color(0xFFFFE5D3),  // Light peach for secondary container
    onSecondaryContainer = Color(0xFF3E2723),  // Dark brown for text on secondary container

    tertiary = Color(0xFFBDB76B),  // DarkKhaki
    onTertiary = Color(0xFF000000),  // Black for text on tertiary
    tertiaryContainer = Color(0xFFE5E5B2),  // Light khaki for tertiary container
    onTertiaryContainer = Color(0xFF4A4E2A),  // Dark olive for text on tertiary container

    background = Color(0xFFF5F5F5),  // Light grey background
    onBackground = Color(0xFF3C3C3C),  // Dark grey for text on background

    surface = Color(0xFFFFFFFF),  // White surface
    onSurface = Color(0xFF3C3C3C),  // Dark grey for text on surface
    surfaceVariant = Color(0xFFEAE6D6),  // Light cream for surface variant
    onSurfaceVariant = Color(0xFF4E4E4E),  // Dark grey for text on surface variant

    surfaceTint = Color(0xFFD4AF37),  // Gold tint
    inverseSurface = Color(0xFF4E4E4E),  // Dark grey for inverse surface
    inverseOnSurface = Color(0xFFFFF8E1),  // Light cream for text on inverse surface

    error = Color(0xFFD32F2F),  // Standard red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFFFE5E5),  // Light red for error container
    onErrorContainer = Color(0xFFD32F2F),  // Dark red for text on error container

    outline = Color(0xFF8B4513),  // SaddleBrown for outline
    outlineVariant = Color(0xFFD4AF37),  // Gold for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Luxury
private val luxuryDarkColorScheme = darkColorScheme(
    primary = Color(0xFFD4AF37),  // Gold for primary
    onPrimary = Color(0xFF000000),  // Black for text on primary
    primaryContainer = Color(0xFF8B4513),  // SaddleBrown for primary container
    onPrimaryContainer = Color(0xFFFFF8E1),  // Light cream for text on primary container

    secondary = Color(0xFF8B4513),  // SaddleBrown for secondary
    onSecondary = Color(0xFFFFFFFF),  // White for text on secondary
    secondaryContainer = Color(0xFF3E2723),  // Dark brown for secondary container
    onSecondaryContainer = Color(0xFFFFE5D3),  // Light peach for text on secondary container

    tertiary = Color(0xFFBDB76B),  // DarkKhaki for tertiary
    onTertiary = Color(0xFF000000),  // Black for text on tertiary
    tertiaryContainer = Color(0xFF4A4E2A),  // Dark olive for tertiary container
    onTertiaryContainer = Color(0xFFE5E5B2),  // Light khaki for text on tertiary container

    background = Color(0xFF1A1A1A),  // Dark grey for background
    onBackground = Color(0xFFFFFFFF),  // White for text on background

    surface = Color(0xFF1A1A1A),  // Dark grey for surface
    onSurface = Color(0xFFFFFFFF),  // White for text on surface
    surfaceVariant = Color(0xFF8B4513),  // SaddleBrown for surface variant
    onSurfaceVariant = Color(0xFFD4AF37),  // Gold for text on surface variant

    surfaceTint = Color(0xFFD4AF37),  // Gold tint
    inverseSurface = Color(0xFFD4AF37),  // Gold for inverse surface
    inverseOnSurface = Color(0xFF1A1A1A),  // Dark grey for text on inverse surface

    error = Color(0xFFFFE5E5),  // Light red for error
    onError = Color(0xFFD32F2F),  // Dark red for text on error
    errorContainer = Color(0xFFD32F2F),  // Dark red for error container
    onErrorContainer = Color(0xFFFFE5E5),  // Light red for text on error container

    outline = Color(0xFFD4AF37),  // Gold for outline
    outlineVariant = Color(0xFF8B4513),  // SaddleBrown for outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Luxury
internal val LuxuryColorScheme = HlsmColorScheme(
    lightScheme = luxuryLightColorScheme,
    darkScheme = luxuryDarkColorScheme
)
