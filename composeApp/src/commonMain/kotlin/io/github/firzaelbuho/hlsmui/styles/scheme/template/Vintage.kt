package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Vintage
private val vintageLightColorScheme = lightColorScheme(
    primary = Color(0xFF8B4513),  // Saddle Brown for vintage look
    onPrimary = Color(0xFFFFFFFF),  // White for text on primary
    primaryContainer = Color(0xFFCD853F),  // Peru color for primary container
    onPrimaryContainer = Color(0xFF3E2F20),  // Dark brown for text on primary container

    secondary = Color(0xFF556B2F),  // Olive green for secondary
    onSecondary = Color(0xFFFFFFFF),  // White for text on secondary
    secondaryContainer = Color(0xFFBDB76B),  // Khaki for secondary container
    onSecondaryContainer = Color(0xFF343D1C),  // Dark olive for text on secondary container

    tertiary = Color(0xFFB22222),  // Firebrick for accent
    onTertiary = Color(0xFFFFFFFF),  // White for text on tertiary
    tertiaryContainer = Color(0xFFCD5C5C),  // Indian red for tertiary container
    onTertiaryContainer = Color(0xFF4B1E1E),  // Dark brownish red for text on tertiary container

    background = Color(0xFFF5F5DC),  // Beige for vintage background
    onBackground = Color(0xFF3E2F20),  // Dark brown for text on background

    surface = Color(0xFFF5F5DC),  // Beige for vintage surface
    onSurface = Color(0xFF3E2F20),  // Dark brown for text on surface
    surfaceVariant = Color(0xFFD2B48C),  // Tan for surface variant
    onSurfaceVariant = Color(0xFF5A4A38),  // Dark tan for text on surface variant

    surfaceTint = Color(0xFF8B4513),  // Tint with vintage brown
    inverseSurface = Color(0xFF3E2F20),  // Dark brown for inverse surface
    inverseOnSurface = Color(0xFFF5F5DC),  // Beige for text on inverse surface

    error = Color(0xFFB22222),  // Firebrick red for error
    onError = Color(0xFFFFFFFF),  // White for text on error
    errorContainer = Color(0xFFCD5C5C),  // Indian red for error container
    onErrorContainer = Color(0xFF4B1E1E),  // Dark red for text on error container

    outline = Color(0xFF8B7D6B),  // Light brown outline
    outlineVariant = Color(0xFFD2B48C),  // Tan outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Dark Color Scheme for Vintage
private val vintageDarkColorScheme = darkColorScheme(
    primary = Color(0xFFCD853F),  // Peru color for primary
    onPrimary = Color(0xFF3E2F20),  // Dark brown for text on primary
    primaryContainer = Color(0xFF8B4513),  // Saddle brown for primary container
    onPrimaryContainer = Color(0xFFF5E8C8),  // Light beige for text on primary container

    secondary = Color(0xFFBDB76B),  // Khaki for secondary
    onSecondary = Color(0xFF343D1C),  // Dark olive for text on secondary
    secondaryContainer = Color(0xFF556B2F),  // Olive green for secondary container
    onSecondaryContainer = Color(0xFFDEDEBE),  // Light tan for text on secondary container

    tertiary = Color(0xFFCD5C5C),  // Indian red for tertiary
    onTertiary = Color(0xFF4B1E1E),  // Dark brownish red for text on tertiary
    tertiaryContainer = Color(0xFFB22222),  // Firebrick for tertiary container
    onTertiaryContainer = Color(0xFFFAD8D8),  // Light pink for text on tertiary container

    background = Color(0xFF3E2F20),  // Dark brown for vintage background
    onBackground = Color(0xFFF5F5DC),  // Beige for text on background

    surface = Color(0xFF3E2F20),  // Dark brown for surface
    onSurface = Color(0xFFF5F5DC),  // Beige for text on surface
    surfaceVariant = Color(0xFF5A4A38),  // Dark tan for surface variant
    onSurfaceVariant = Color(0xFFD2B48C),  // Tan for text on surface variant

    surfaceTint = Color(0xFFCD853F),  // Tint with Peru color
    inverseSurface = Color(0xFFF5F5DC),  // Beige for inverse surface
    inverseOnSurface = Color(0xFF3E2F20),  // Dark brown for text on inverse surface

    error = Color(0xFFCD5C5C),  // Indian red for error
    onError = Color(0xFF4B1E1E),  // Dark brown for text on error
    errorContainer = Color(0xFFB22222),  // Firebrick for error container
    onErrorContainer = Color(0xFFFAD8D8),  // Light pink for text on error container

    outline = Color(0xFFD2B48C),  // Tan outline
    outlineVariant = Color(0xFF8B7D6B),  // Light brown outline variant
    scrim = Color(0xFF000000)  // Black scrim
)

// Combine Light and Dark Color Schemes into HlsmColorScheme for Vintage
internal val VintageColorScheme = HlsmColorScheme(
    lightScheme = vintageLightColorScheme,
    darkScheme = vintageDarkColorScheme
)
