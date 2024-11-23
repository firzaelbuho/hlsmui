package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Pastel
private val pastelLightColorScheme = lightColorScheme(
    primary = Color(0xFFFFC1E3),  // Pink pastel lembut
    onPrimary = Color(0xFF4D3750),  // Teks ungu tua di atas elemen pink pastel
    primaryContainer = Color(0xFFFFE4EC),  // Pink pastel yang lebih terang
    onPrimaryContainer = Color(0xFF7C4A71),  // Ungu pastel tua di kontainer utama

    secondary = Color(0xFFB3E5FC),  // Biru pastel terang
    onSecondary = Color(0xFF004D6F),  // Teks biru tua di atas elemen biru pastel
    secondaryContainer = Color(0xFFE1F5FE),  // Kontainer biru pastel yang lebih terang
    onSecondaryContainer = Color(0xFF0277BD),  // Teks biru tua di atas kontainer biru

    tertiary = Color(0xFFFFF9C4),  // Kuning pastel lembut
    onTertiary = Color(0xFF827717),  // Teks hijau tua di atas elemen kuning pastel
    tertiaryContainer = Color(0xFFFFFDE7),  // Kontainer kuning pastel
    onTertiaryContainer = Color(0xFFFBC02D),  // Teks kuning tua di kontainer tersier

    background = Color(0xFFFFF8E1),  // Latar belakang pastel krem lembut
    onBackground = Color(0xFF4A4A4A),  // Teks abu-abu tua untuk kontras

    surface = Color(0xFFEDE7F6),  // Permukaan pastel ungu muda
    onSurface = Color(0xFF512DA8),  // Teks ungu tua di atas permukaan
    surfaceVariant = Color(0xFFF3E5F5),  // Warna permukaan varian ungu pastel
    onSurfaceVariant = Color(0xFF7B1FA2),  // Ungu tua di atas varian permukaan

    surfaceTint = Color(0xFFFFC1E3),  // Tint permukaan dengan warna pink pastel
    inverseSurface = Color(0xFF512DA8),  // Ungu tua untuk permukaan terbalik
    inverseOnSurface = Color(0xFFEDE7F6),  // Pastel ungu muda di atas permukaan terbalik

    error = Color(0xFFFFAB91),  // Warna error merah pastel
    onError = Color(0xFFBF360C),  // Teks merah tua di atas error pastel
    errorContainer = Color(0xFFFFCCBC),  // Kontainer error merah pastel lembut
    onErrorContainer = Color(0xFFD84315),  // Teks merah tua di kontainer error

    outline = Color(0xFFB3E5FC),  // Biru pastel terang untuk outline
    outlineVariant = Color(0xFFFFE4EC),  // Varian outline dengan warna pink pastel terang
    scrim = Color(0xFF000000)  // Hitam untuk scrim
)

// Dark Color Scheme for Pastel
private val pastelDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFFC1E3),  // Pink pastel lembut untuk tema gelap
    onPrimary = Color(0xFF4D3750),  // Teks ungu tua di atas elemen pink pastel
    primaryContainer = Color(0xFF7C4A71),  // Ungu pastel tua di kontainer utama
    onPrimaryContainer = Color(0xFFFFE4EC),  // Teks pink pastel terang di kontainer utama

    secondary = Color(0xFFB3E5FC),  // Biru pastel terang untuk tema gelap
    onSecondary = Color(0xFF004D6F),  // Teks biru tua di atas elemen biru pastel
    secondaryContainer = Color(0xFF0277BD),  // Kontainer biru tua
    onSecondaryContainer = Color(0xFFE1F5FE),  // Teks biru terang di atas kontainer biru pastel

    tertiary = Color(0xFFFFF9C4),  // Kuning pastel lembut
    onTertiary = Color(0xFF827717),  // Hijau tua di atas elemen kuning pastel
    tertiaryContainer = Color(0xFFFBC02D),  // Kuning tua untuk kontainer tersier
    onTertiaryContainer = Color(0xFFFFFDE7),  // Teks pastel kuning terang di kontainer tersier

    background = Color(0xFF4A4A4A),  // Latar belakang abu-abu tua
    onBackground = Color(0xFFFFF8E1),  // Teks pastel krem lembut di latar belakang gelap

    surface = Color(0xFF512DA8),  // Permukaan ungu tua
    onSurface = Color(0xFFEDE7F6),  // Teks pastel ungu muda di atas permukaan gelap
    surfaceVariant = Color(0xFF7B1FA2),  // Varian permukaan ungu tua
    onSurfaceVariant = Color(0xFFF3E5F5),  // Teks pastel ungu terang di atas varian permukaan

    surfaceTint = Color(0xFFFFC1E3),  // Tint permukaan dengan warna pink pastel
    inverseSurface = Color(0xFFEDE7F6),  // Pastel ungu muda untuk permukaan terbalik
    inverseOnSurface = Color(0xFF512DA8),  // Ungu tua di atas permukaan terbalik

    error = Color(0xFFFFAB91),  // Warna error merah pastel
    onError = Color(0xFFBF360C),  // Teks merah tua di atas error pastel
    errorContainer = Color(0xFFFFCCBC),  // Kontainer error merah pastel lembut
    onErrorContainer = Color(0xFFD84315),  // Teks merah tua di kontainer error

    outline = Color(0xFFB3E5FC),  // Biru pastel terang untuk outline
    outlineVariant = Color(0xFFFFE4EC),  // Varian outline pink pastel terang
    scrim = Color(0xFF000000)  // Hitam untuk scrim
)

// HlsmColorScheme for Pastel theme
internal val PastelColorScheme = HlsmColorScheme(
    lightScheme = pastelLightColorScheme,
    darkScheme = pastelDarkColorScheme
)
