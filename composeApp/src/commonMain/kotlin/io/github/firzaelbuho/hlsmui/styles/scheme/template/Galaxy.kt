package io.github.firzaelbuho.hlsmui.styles.scheme.template


import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Galaxy
private val galaxyLightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EE),  // Ungu gelap untuk elemen utama
    onPrimary = Color(0xFFFFFFFF),  // Teks putih di atas elemen utama
    primaryContainer = Color(0xFFBB86FC),  // Kontainer ungu terang
    onPrimaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer utama
    inversePrimary = Color(0xFF3700B3),  // Warna terbalik untuk elemen utama

    secondary = Color(0xFF03DAC6),  // Cyan untuk elemen sekunder
    onSecondary = Color(0xFF000000),  // Teks hitam di atas elemen sekunder
    secondaryContainer = Color(0xFFB2F1EA),  // Kontainer cyan terang
    onSecondaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer sekunder

    tertiary = Color(0xFF03A9F4),  // Biru untuk aksen
    onTertiary = Color(0xFFFFFFFF),  // Teks putih di atas elemen aksen
    tertiaryContainer = Color(0xFFBBDEFB),  // Kontainer biru muda
    onTertiaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer aksen

    background = Color(0xFFE3F2FD),  // Latar belakang biru muda
    onBackground = Color(0xFF000000),  // Teks hitam di atas latar belakang

    surface = Color(0xFFFFFFFF),  // Warna permukaan putih
    onSurface = Color(0xFF000000),  // Teks hitam di atas permukaan

    surfaceVariant = Color(0xFFE0E0E0),  // Warna permukaan variabel
    onSurfaceVariant = Color(0xFF000000),  // Teks hitam di atas permukaan variabel

    surfaceTint = Color(0xFF6200EE),  // Tint untuk elemen permukaan

    inverseSurface = Color(0xFF121212),  // Warna gelap untuk permukaan terbalik
    inverseOnSurface = Color(0xFFFFFFFF),  // Teks putih untuk permukaan terbalik

    error = Color(0xFFD32F2F),  // Warna untuk status kesalahan
    onError = Color(0xFFFFFFFF),  // Teks putih di atas elemen kesalahan
    errorContainer = Color(0xFFFFC1C1),  // Kontainer kesalahan
    onErrorContainer = Color(0xFF000000),  // Teks hitam di atas kontainer kesalahan

    outline = Color(0xFF6200EE),  // Warna outline ungu
    outlineVariant = Color(0xFFE0E0E0),  // Variasi outline yang lebih cerah

    scrim = Color(0x80000000),  // Scrim semi-transparan
    surfaceBright = Color(0xFFFFFFFF),  // Permukaan cerah
    surfaceContainer = Color(0xFFE3F2FD),  // Kontainer permukaan
    surfaceContainerHigh = Color(0xFFBB86FC),  // Kontainer tinggi
    surfaceContainerHighest = Color(0xFFBB86FC),  // Kontainer tertinggi
    surfaceContainerLow = Color(0xFFCCCCCC),  // Kontainer rendah
    surfaceContainerLowest = Color(0xFFB0BEC5),  // Kontainer terendah
    surfaceDim = Color(0xFF9E9E9E)  // Permukaan gelap
)

// Dark Color Scheme for Galaxy
private val galaxyDarkColorScheme = darkColorScheme(
    primary = Color(0xFFBB86FC),  // Ungu terang untuk elemen utama
    onPrimary = Color(0xFF000000),  // Teks hitam di atas elemen utama
    primaryContainer = Color(0xFF6200EE),  // Kontainer ungu gelap
    onPrimaryContainer = Color(0xFFFFFFFF),  // Teks putih di atas kontainer utama

    secondary = Color(0xFF03DAC6),  // Cyan untuk elemen sekunder
    onSecondary = Color(0xFF000000),  // Teks hitam di atas elemen sekunder
    secondaryContainer = Color(0xFFB2F1EA),  // Kontainer cyan terang
    onSecondaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer sekunder

    tertiary = Color(0xFF03A9F4),  // Biru untuk aksen
    onTertiary = Color(0xFFFFFFFF),  // Teks putih di atas elemen aksen
    tertiaryContainer = Color(0xFFBBDEFB),  // Kontainer biru muda
    onTertiaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer aksen

    background = Color(0xFF121212),  // Latar belakang gelap
    onBackground = Color(0xFFE0E0E0),  // Teks cerah untuk kontras

    surface = Color(0xFF1E1E1E),  // Permukaan gelap
    onSurface = Color(0xFFE0E0E0),  // Teks cerah di atas permukaan

    surfaceVariant = Color(0xFFE0E0E0),  // Variasi gelap untuk permukaan
    onSurfaceVariant = Color(0xFF000000),  // Teks hitam di atas permukaan variabel

    surfaceTint = Color(0xFFBB86FC),  // Tint untuk permukaan gelap

    inverseSurface = Color(0xFFD0D0D0),  // Warna cerah untuk permukaan terbalik
    inverseOnSurface = Color(0xFF000000),  // Teks hitam untuk permukaan terbalik

    error = Color(0xFFD32F2F),  // Warna untuk status kesalahan
    onError = Color(0xFFFFFFFF),  // Teks putih di atas elemen kesalahan
    errorContainer = Color(0xFFFFC1C1),  // Kontainer kesalahan
    onErrorContainer = Color(0xFF000000),  // Teks hitam di atas kontainer kesalahan

    outline = Color(0xFFBB86FC),  // Warna outline ungu
    outlineVariant = Color(0xFFE0E0E0),  // Variasi outline yang lebih cerah

    scrim = Color(0x80000000),  // Scrim semi-transparan
    surfaceBright = Color(0xFF555555),  // Permukaan cerah dalam mode gelap
    surfaceContainer = Color(0xFF1E1E1E),  // Kontainer gelap
    surfaceContainerHigh = Color(0xFFBB86FC),  // Kontainer tinggi dalam mode gelap
    surfaceContainerHighest = Color(0xFFBB86FC),  // Kontainer tertinggi dalam mode gelap
    surfaceContainerLow = Color(0xFFCCCCCC),  // Kontainer rendah dalam mode gelap
    surfaceContainerLowest = Color(0xFFB0BEC5),  // Kontainer terendah dalam mode gelap
    surfaceDim = Color(0xFF222222)  // Permukaan gelap dalam mode gelap
)

// Combine into HlsmColorScheme
internal val GalaxyColorScheme = HlsmColorScheme(
    lightScheme = galaxyLightColorScheme,
    darkScheme = galaxyDarkColorScheme
)
