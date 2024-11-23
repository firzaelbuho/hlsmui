package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Forest
private val forestLightColorScheme = lightColorScheme(
    primary = Color(0xFF4CAF50),  // Hijau untuk elemen utama
    onPrimary = Color(0xFFFFFFFF),  // Teks putih di atas elemen utama
    primaryContainer = Color(0xFFD7E8B0),  // Kontainer hijau terang
    onPrimaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer utama
    inversePrimary = Color(0xFF76FF03),  // Warna terbalik untuk elemen utama

    secondary = Color(0xFF3E8E41),  // Hijau tua untuk elemen sekunder
    onSecondary = Color(0xFFFFFFFF),  // Teks putih di atas elemen sekunder
    secondaryContainer = Color(0xFFC8E6C9),  // Kontainer hijau tua terang
    onSecondaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer sekunder

    tertiary = Color(0xFF8D6E63),  // Warna cokelat untuk aksen
    onTertiary = Color(0xFFFFFFFF),  // Teks putih di atas elemen aksen
    tertiaryContainer = Color(0xFFEFEBE9),  // Kontainer cokelat muda
    onTertiaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer aksen

    background = Color(0xFFF1F8E9),  // Latar belakang hijau terang
    onBackground = Color(0xFF000000),  // Teks hitam di atas latar belakang

    surface = Color(0xFFFFFFFF),  // Warna permukaan putih
    onSurface = Color(0xFF000000),  // Teks hitam di atas permukaan

    surfaceVariant = Color(0xFFE8F5E9),  // Warna permukaan variabel
    onSurfaceVariant = Color(0xFF000000),  // Teks hitam di atas permukaan variabel

    surfaceTint = Color(0xFF4CAF50),  // Tint untuk elemen permukaan

    inverseSurface = Color(0xFF424242),  // Warna terbalik untuk permukaan
    inverseOnSurface = Color(0xFFE0E0E0),  // Teks cerah di atas permukaan terbalik

    error = Color(0xFFD32F2F),  // Warna untuk status kesalahan
    onError = Color(0xFFFFFFFF),  // Teks putih di atas elemen kesalahan
    errorContainer = Color(0xFFFFC1C1),  // Kontainer kesalahan
    onErrorContainer = Color(0xFF000000),  // Teks hitam di atas kontainer kesalahan

    outline = Color(0xFF4CAF50),  // Warna outline hijau
    outlineVariant = Color(0xFFE0E0E0),  // Variasi outline yang lebih cerah

    scrim = Color(0x80000000),  // Scrim semi-transparan
    surfaceBright = Color(0xFFFFFFFF),  // Permukaan cerah
    surfaceContainer = Color(0xFFF1F8E9),  // Kontainer permukaan
    surfaceContainerHigh = Color(0xFF4CAF50),  // Kontainer tinggi
    surfaceContainerHighest = Color(0xFF4CAF50),  // Kontainer tertinggi
    surfaceContainerLow = Color(0xFFCCCCCC),  // Kontainer rendah
    surfaceContainerLowest = Color(0xFFB0BEC5),  // Kontainer terendah
    surfaceDim = Color(0xFF9E9E9E)  // Permukaan gelap
)

// Dark Color Scheme for Forest
private val forestDarkColorScheme = darkColorScheme(
    primary = Color(0xFF4CAF50),  // Hijau untuk elemen utama
    onPrimary = Color(0xFFFFFFFF),  // Teks putih di atas elemen utama
    primaryContainer = Color(0xFFD7E8B0),  // Kontainer hijau terang
    onPrimaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer utama

    secondary = Color(0xFF3E8E41),  // Hijau tua untuk elemen sekunder
    onSecondary = Color(0xFFFFFFFF),  // Teks putih di atas elemen sekunder
    secondaryContainer = Color(0xFFC8E6C9),  // Kontainer hijau tua terang
    onSecondaryContainer = Color(0xFFFFFFFF),  // Teks putih di atas kontainer sekunder

    tertiary = Color(0xFF8D6E63),  // Warna cokelat untuk aksen
    onTertiary = Color(0xFFFFFFFF),  // Teks putih di atas elemen aksen
    tertiaryContainer = Color(0xFFEFEBE9),  // Kontainer cokelat muda
    onTertiaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer aksen

    background = Color(0xFF121212),  // Latar belakang gelap
    onBackground = Color(0xFFE0E0E0),  // Teks cerah untuk kontras

    surface = Color(0xFF1E1E1E),  // Permukaan gelap
    onSurface = Color(0xFFE0E0E0),  // Teks cerah di atas permukaan

    surfaceVariant = Color(0xFFE0E0E0),  // Variasi gelap untuk permukaan
    onSurfaceVariant = Color(0xFFFFFFFF),  // Teks putih di atas permukaan variabel

    surfaceTint = Color(0xFF4CAF50),  // Tint untuk permukaan gelap

    inverseSurface = Color(0xFFD0D0D0),  // Warna cerah untuk permukaan terbalik
    inverseOnSurface = Color(0xFF000000),  // Teks hitam untuk permukaan terbalik

    error = Color(0xFFD32F2F),  // Warna untuk status kesalahan
    onError = Color(0xFFFFFFFF),  // Teks putih di atas elemen kesalahan
    errorContainer = Color(0xFFFFC1C1),  // Kontainer kesalahan
    onErrorContainer = Color(0xFF000000),  // Teks hitam di atas kontainer kesalahan

    outline = Color(0xFF4CAF50),  // Warna outline hijau
    outlineVariant = Color(0xFFE0E0E0),  // Variasi outline yang lebih cerah

    scrim = Color(0x80000000),  // Scrim semi-transparan
    surfaceBright = Color(0xFF555555),  // Permukaan cerah dalam mode gelap
    surfaceContainer = Color(0xFF1E1E1E),  // Kontainer gelap
    surfaceContainerHigh = Color(0xFF4CAF50),  // Kontainer tinggi dalam mode gelap
    surfaceContainerHighest = Color(0xFF4CAF50),  // Kontainer tertinggi dalam mode gelap
    surfaceContainerLow = Color(0xFFCCCCCC),  // Kontainer rendah dalam mode gelap
    surfaceContainerLowest = Color(0xFFB0BEC5),  // Kontainer terendah dalam mode gelap
    surfaceDim = Color(0xFF222222)  // Permukaan gelap dalam mode gelap
)

// Combine into HlsmColorScheme
internal val ForestColorScheme = HlsmColorScheme(
    lightScheme = forestLightColorScheme,
    darkScheme = forestDarkColorScheme
)
