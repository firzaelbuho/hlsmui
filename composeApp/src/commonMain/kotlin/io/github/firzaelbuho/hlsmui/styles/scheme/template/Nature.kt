package io.github.firzaelbuho.hlsmui.styles.scheme.template

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Nature
private val natureLightColorScheme = lightColorScheme(
    primary = Color(0xFF4CAF50),  // Hijau alam (daun)
    onPrimary = Color(0xFFFFFFFF),  // Teks putih di atas elemen hijau utama
    primaryContainer = Color(0xFFA5D6A7),  // Hijau yang lebih lembut
    onPrimaryContainer = Color(0xFF1B5E20),  // Hijau gelap untuk teks di kontainer utama

    secondary = Color(0xFF8BC34A),  // Hijau terang (rumput muda)
    onSecondary = Color(0xFFFFFFFF),  // Teks putih di atas elemen sekunder
    secondaryContainer = Color(0xFFDCEDC8),  // Kontainer hijau terang
    onSecondaryContainer = Color(0xFF33691E),  // Hijau tua di atas kontainer sekunder

    tertiary = Color(0xFFCDDC39),  // Hijau kekuningan (pepohonan)
    onTertiary = Color(0xFF000000),  // Teks hitam di atas elemen tersier
    tertiaryContainer = Color(0xFFF0F4C3),  // Kontainer hijau kekuningan yang lembut
    onTertiaryContainer = Color(0xFF827717),  // Hijau gelap untuk teks di kontainer tersier

    background = Color(0xFFF1F8E9),  // Warna latar belakang hijau muda alami
    onBackground = Color(0xFF263238),  // Teks abu-abu tua untuk kontras

    surface = Color(0xFFDCEDC8),  // Warna permukaan hijau lembut
    onSurface = Color(0xFF000000),  // Teks hitam di atas permukaan
    surfaceVariant = Color(0xFFC5E1A5),  // Warna permukaan varian hijau alami
    onSurfaceVariant = Color(0xFF2E7D32),  // Hijau tua di atas varian permukaan

    surfaceTint = Color(0xFF4CAF50),  // Tint permukaan dengan warna hijau utama
    inverseSurface = Color(0xFF2E7D32),  // Hijau tua untuk permukaan terbalik
    inverseOnSurface = Color(0xFFDCEDC8),  // Hijau lembut untuk teks di atas permukaan terbalik

    error = Color(0xFFD32F2F),  // Warna error merah gelap
    onError = Color(0xFFFFFFFF),  // Teks putih di atas warna error
    errorContainer = Color(0xFFFFCDD2),  // Kontainer error merah muda
    onErrorContainer = Color(0xFFB71C1C),  // Teks merah gelap di atas kontainer error

    outline = Color(0xFF4CAF50),  // Hijau utama untuk outline
    outlineVariant = Color(0xFFC8E6C9),  // Varian outline hijau lembut
    scrim = Color(0xFF000000)  // Hitam untuk scrim
)

// Dark Color Scheme for Nature
private val natureDarkColorScheme = darkColorScheme(
    primary = Color(0xFF81C784),  // Hijau yang lebih terang untuk tema gelap
    onPrimary = Color(0xFF1B5E20),  // Teks hijau tua di atas elemen hijau utama
    primaryContainer = Color(0xFF388E3C),  // Hijau gelap untuk kontainer utama
    onPrimaryContainer = Color(0xFFA5D6A7),  // Teks hijau lembut di kontainer utama

    secondary = Color(0xFF9CCC65),  // Hijau terang untuk elemen sekunder
    onSecondary = Color(0xFF33691E),  // Hijau tua di atas elemen sekunder
    secondaryContainer = Color(0xFF689F38),  // Kontainer hijau tua
    onSecondaryContainer = Color(0xFFDCEDC8),  // Teks hijau lembut di atas kontainer sekunder

    tertiary = Color(0xFFDCE775),  // Hijau kekuningan untuk elemen tersier
    onTertiary = Color(0xFF827717),  // Hijau tua di atas elemen tersier
    tertiaryContainer = Color(0xFFAFB42B),  // Kontainer hijau kekuningan gelap
    onTertiaryContainer = Color(0xFFF0F4C3),  // Teks hijau kekuningan lembut di atas kontainer tersier

    background = Color(0xFF263238),  // Warna latar belakang gelap
    onBackground = Color(0xFFF1F8E9),  // Teks hijau muda untuk kontras

    surface = Color(0xFF33691E),  // Warna permukaan hijau gelap
    onSurface = Color(0xFFDCEDC8),  // Teks hijau lembut di atas permukaan
    surfaceVariant = Color(0xFF689F38),  // Varian permukaan hijau tua
    onSurfaceVariant = Color(0xFFC8E6C9),  // Teks hijau lembut di atas varian permukaan

    surfaceTint = Color(0xFF81C784),  // Tint permukaan dengan warna hijau terang
    inverseSurface = Color(0xFFF1F8E9),  // Hijau lembut untuk permukaan terbalik
    inverseOnSurface = Color(0xFF33691E),  // Hijau tua untuk teks di atas permukaan terbalik

    error = Color(0xFFEF5350),  // Warna error merah terang untuk tema gelap
    onError = Color(0xFFB71C1C),  // Teks merah gelap di atas error
    errorContainer = Color(0xFFE57373),  // Kontainer error merah terang
    onErrorContainer = Color(0xFFEF9A9A),  // Teks merah lembut di atas kontainer error

    outline = Color(0xFF81C784),  // Hijau terang untuk outline
    outlineVariant = Color(0xFFC8E6C9),  // Varian outline hijau lembut
    scrim = Color(0xFF000000)  // Hitam untuk scrim
)

// HlsmColorScheme for Nature theme
internal val NatureColorScheme = HlsmColorScheme(
    lightScheme = natureLightColorScheme,
    darkScheme = natureDarkColorScheme
)
