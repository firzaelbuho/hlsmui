package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Ocean
private val oceanLightColorScheme = lightColorScheme(
    primary = Color(0xFF0288D1),  // Biru laut dalam
    onPrimary = Color(0xFFFFFFFF),  // Teks putih di atas elemen biru utama
    primaryContainer = Color(0xFFB3E5FC),  // Biru laut yang lebih lembut
    onPrimaryContainer = Color(0xFF01579B),  // Biru gelap untuk teks di kontainer utama

    secondary = Color(0xFF26C6DA),  // Biru terang (ombak laut)
    onSecondary = Color(0xFF000000),  // Teks hitam di atas elemen sekunder
    secondaryContainer = Color(0xFFB2EBF2),  // Kontainer biru terang lembut
    onSecondaryContainer = Color(0xFF00796B),  // Biru tua di atas kontainer sekunder

    tertiary = Color(0xFF00ACC1),  // Biru kehijauan (samudera dalam)
    onTertiary = Color(0xFFFFFFFF),  // Teks putih di atas elemen tersier
    tertiaryContainer = Color(0xFFB2DFDB),  // Kontainer biru kehijauan lembut
    onTertiaryContainer = Color(0xFF004D40),  // Hijau laut gelap di kontainer tersier

    background = Color(0xFFE0F7FA),  // Warna latar belakang biru muda
    onBackground = Color(0xFF004D40),  // Teks hijau laut gelap untuk kontras

    surface = Color(0xFFE0F2F1),  // Warna permukaan biru kehijauan
    onSurface = Color(0xFF004D40),  // Teks hijau laut gelap di atas permukaan
    surfaceVariant = Color(0xFF80DEEA),  // Warna permukaan varian biru terang
    onSurfaceVariant = Color(0xFF006064),  // Biru laut gelap di atas varian permukaan

    surfaceTint = Color(0xFF0288D1),  // Tint permukaan dengan warna biru laut utama
    inverseSurface = Color(0xFF004D40),  // Hijau laut gelap untuk permukaan terbalik
    inverseOnSurface = Color(0xFFE0F7FA),  // Biru lembut untuk teks di atas permukaan terbalik

    error = Color(0xFFD32F2F),  // Warna error merah gelap
    onError = Color(0xFFFFFFFF),  // Teks putih di atas warna error
    errorContainer = Color(0xFFFFCDD2),  // Kontainer error merah muda
    onErrorContainer = Color(0xFFB71C1C),  // Teks merah gelap di atas kontainer error

    outline = Color(0xFF0288D1),  // Biru utama untuk outline
    outlineVariant = Color(0xFFB3E5FC),  // Varian outline biru lembut
    scrim = Color(0xFF000000)  // Hitam untuk scrim
)

// Dark Color Scheme for Ocean
private val oceanDarkColorScheme = darkColorScheme(
    primary = Color(0xFF4FC3F7),  // Biru laut yang lebih terang untuk tema gelap
    onPrimary = Color(0xFF01579B),  // Teks biru tua di atas elemen biru terang
    primaryContainer = Color(0xFF0288D1),  // Biru laut untuk kontainer utama
    onPrimaryContainer = Color(0xFFB3E5FC),  // Teks biru lembut di kontainer utama

    secondary = Color(0xFF4DD0E1),  // Biru terang untuk elemen sekunder
    onSecondary = Color(0xFF004D40),  // Biru kehijauan tua di atas elemen sekunder
    secondaryContainer = Color(0xFF00796B),  // Kontainer biru kehijauan gelap
    onSecondaryContainer = Color(0xFFB2EBF2),  // Teks biru lembut di atas kontainer sekunder

    tertiary = Color(0xFF00BCD4),  // Biru kehijauan terang untuk elemen tersier
    onTertiary = Color(0xFF004D40),  // Hijau laut tua di atas elemen tersier
    tertiaryContainer = Color(0xFF00838F),  // Kontainer hijau laut tua
    onTertiaryContainer = Color(0xFFB2DFDB),  // Teks hijau lembut di kontainer tersier

    background = Color(0xFF004D40),  // Warna latar belakang hijau laut gelap
    onBackground = Color(0xFFE0F7FA),  // Teks biru muda untuk kontras

    surface = Color(0xFF00796B),  // Warna permukaan biru tua
    onSurface = Color(0xFFE0F2F1),  // Teks biru lembut di atas permukaan
    surfaceVariant = Color(0xFF004D40),  // Varian permukaan hijau laut tua
    onSurfaceVariant = Color(0xFF80DEEA),  // Teks biru terang di atas varian permukaan

    surfaceTint = Color(0xFF4FC3F7),  // Tint permukaan dengan warna biru terang
    inverseSurface = Color(0xFFE0F7FA),  // Biru lembut untuk permukaan terbalik
    inverseOnSurface = Color(0xFF004D40),  // Hijau laut tua untuk teks di atas permukaan terbalik

    error = Color(0xFFEF5350),  // Warna error merah terang untuk tema gelap
    onError = Color(0xFFB71C1C),  // Teks merah gelap di atas error
    errorContainer = Color(0xFFE57373),  // Kontainer error merah terang
    onErrorContainer = Color(0xFFEF9A9A),  // Teks merah lembut di atas kontainer error

    outline = Color(0xFF4FC3F7),  // Biru terang untuk outline
    outlineVariant = Color(0xFFB3E5FC),  // Varian outline biru lembut
    scrim = Color(0xFF000000)  // Hitam untuk scrim
)

// HlsmColorScheme for Ocean theme
internal val OceanColorScheme = HlsmColorScheme(
    lightScheme = oceanLightColorScheme,
    darkScheme = oceanDarkColorScheme
)
