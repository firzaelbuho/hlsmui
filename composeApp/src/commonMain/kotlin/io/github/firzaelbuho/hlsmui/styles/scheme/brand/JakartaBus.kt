package io.github.firzaelbuho.hlsmui.styles.scheme.brand

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorSchemeCategory

// Light Color Scheme for Jakarta Bus
private val jakartaBusLightColorScheme = lightColorScheme(
    primary = Color(0xFFFF6F00),  // Oranye sebagai warna utama
    onPrimary = Color(0xFFFFFFFF),  // Putih untuk teks di atas warna utama
    primaryContainer = Color(0xFFFFD180),  // Warna container yang lebih terang
    onPrimaryContainer = Color(0xFF000000),  // Hitam untuk teks di container utama
    inversePrimary = Color(0xFF4D4D4D),  // Inverse primary color

    secondary = Color(0xFF303F9F),  // Biru gelap untuk warna sekunder
    onSecondary = Color(0xFFFFFFFF),  // Putih untuk teks di atas warna sekunder
    secondaryContainer = Color(0xFFD1C4E9),  // Warna container sekunder yang lebih terang
    onSecondaryContainer = Color(0xFF000000),  // Hitam untuk teks di container sekunder

    tertiary = Color(0xFF00ACC1),  // Cyan untuk elemen tambahan
    onTertiary = Color(0xFF000000),  // Hitam untuk teks di atas warna tambahan
    tertiaryContainer = Color(0xFFE0F7FA),  // Container yang lebih terang untuk warna tambahan
    onTertiaryContainer = Color(0xFF000000),  // Hitam untuk teks di container tambahan

    background = Color(0xFFF5F5F5),  // Warna latar belakang terang
    onBackground = Color(0xFF000000),  // Hitam untuk teks di latar belakang

    surface = Color(0xFFFFFFFF),  // Warna surface putih
    onSurface = Color(0xFF000000),  // Hitam untuk teks di atas surface

    surfaceVariant = Color(0xFFE0E0E0),  // Variasi surface yang lebih terang
    onSurfaceVariant = Color(0xFF000000),  // Hitam untuk teks di surface variant

    surfaceTint = Color(0xFFFF6F00),  // Tint warna untuk surface

    inverseSurface = Color(0xFF424242),  // Warna invers untuk surface
    inverseOnSurface = Color(0xFFE0E0E0),  // Teks terang untuk invers surface

    error = Color(0xFFD32F2F),  // Warna error merah
    onError = Color(0xFFFFFFFF),  // Putih untuk teks di atas warna error
    errorContainer = Color(0xFFFFC1C1),  // Warna container untuk error
    onErrorContainer = Color(0xFF000000),  // Hitam untuk teks di container error

    outline = Color(0xFFFF6F00),  // Warna outline yang matching dengan warna utama
    outlineVariant = Color(0xFFE0E0E0),  // Variasi outline yang lebih terang

    scrim = Color(0x80000000),  // Scrim hitam semi-transparan
)

// Dark Color Scheme for Jakarta Bus
private val jakartaBusDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFF6F00),  // Oranye untuk warna utama
    onPrimary = Color(0xFFFFFFFF),  // Putih untuk teks di atas warna utama
    primaryContainer = Color(0xFFD7C49E),  // Warna container yang lebih gelap
    onPrimaryContainer = Color(0xFF000000),  // Hitam untuk teks di container utama

    secondary = Color(0xFF303F9F),  // Biru gelap untuk warna sekunder
    onSecondary = Color(0xFFFFFFFF),  // Putih untuk teks di atas warna sekunder
    secondaryContainer = Color(0xFFB2C7E0),  // Variasi container sekunder yang lebih gelap
    onSecondaryContainer = Color(0xFFFFFFFF),  // Putih untuk teks di container sekunder

    tertiary = Color(0xFF00ACC1),  // Cyan untuk elemen tambahan
    onTertiary = Color(0xFFFFFFFF),  // Putih untuk teks di atas warna tambahan
    tertiaryContainer = Color(0xFFB2EBF2),  // Variasi container yang lebih terang untuk warna tambahan
    onTertiaryContainer = Color(0xFF000000),  // Hitam untuk teks di container tambahan

    background = Color(0xFF121212),  // Latar belakang gelap
    onBackground = Color(0xFFE0E0E0),  // Teks terang untuk kontras

    surface = Color(0xFF1E1E1E),  // Warna surface gelap
    onSurface = Color(0xFFE0E0E0),  // Teks terang di surface

    surfaceVariant = Color(0xFFE0E0E0),  // Variasi surface yang lebih gelap
    onSurfaceVariant = Color(0xFF000000),  // Hitam untuk teks di surface variant

    surfaceTint = Color(0xFFFF6F00),  // Tint untuk surface gelap

    inverseSurface = Color(0xFFD0D0D0),  // Warna terang untuk invers surface
    inverseOnSurface = Color(0xFF000000),  // Hitam untuk teks invers surface

    error = Color(0xFFD32F2F),  // Warna error merah
    onError = Color(0xFFFFFFFF),  // Putih untuk teks di atas error
    errorContainer = Color(0xFFFFC1C1),  // Warna container error
    onErrorContainer = Color(0xFF000000),  // Hitam untuk teks di container error

    outline = Color(0xFFFF6F00),  // Outline yang matching dengan warna utama
    outlineVariant = Color(0xFFE0E0E0),  // Variasi outline yang lebih terang

    scrim = Color(0x80000000),  // Scrim hitam semi-transparan
)

// Combine into HlsmColorScheme
internal val JakartaBusColorScheme = HlsmColorScheme(
    name = "Jakarta Bus",
    categories = listOf(HlsmColorSchemeCategory.Brand),
    lightScheme = jakartaBusLightColorScheme,
    darkScheme = jakartaBusDarkColorScheme
)
