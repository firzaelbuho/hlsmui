package io.github.firzaelbuho.hlsmui.styles.scheme.template
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

// Light Color Scheme for Lavender
private val lavenderLightColorScheme = lightColorScheme(
    primary = Color(0xFFB39DDB),  // Ungu muda lembut (lavender)
    onPrimary = Color(0xFF000000),  // Teks hitam di atas elemen utama
    primaryContainer = Color(0xFFEDE7F6),  // Kontainer ungu sangat muda
    onPrimaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer utama

    secondary = Color(0xFFCE93D8),  // Pink lembut
    onSecondary = Color(0xFF000000),  // Teks hitam di atas elemen sekunder
    secondaryContainer = Color(0xFFF8BBD0),  // Kontainer pink terang
    onSecondaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer sekunder

    tertiary = Color(0xFF80CBC4),  // Hijau kebiruan lembut untuk aksen
    onTertiary = Color(0xFF000000),  // Teks hitam di atas elemen aksen
    tertiaryContainer = Color(0xFFB2DFDB),  // Kontainer aksen terang
    onTertiaryContainer = Color(0xFF000000),  // Teks hitam di atas kontainer aksen

    background = Color(0xFFF3E5F5),  // Latar belakang ungu muda
    onBackground = Color(0xFF000000),  // Teks hitam di atas latar belakang

    surface = Color(0xFFFFFFFF),  // Warna permukaan putih
    onSurface = Color(0xFF000000),  // Teks hitam di atas permukaan

    surfaceVariant = Color(0xFFD1C4E9),  // Permukaan ungu lembut
    onSurfaceVariant = Color(0xFF000000),  // Teks hitam di atas permukaan variabel

    surfaceTint = Color(0xFFB39DDB),  // Tint untuk elemen permukaan

    inverseSurface = Color(0xFF121212),  // Warna gelap untuk permukaan terbalik
    inverseOnSurface = Color(0xFFFFFFFF),  // Teks putih untuk permukaan terbalik

    error = Color(0xFFD32F2F),  // Warna untuk status kesalahan
    onError = Color(0xFFFFFFFF),  // Teks putih di atas elemen kesalahan
    errorContainer = Color(0xFFFFC1C1),  // Kontainer kesalahan
    onErrorContainer = Color(0xFF000000),  // Teks hitam di atas kontainer kesalahan

    outline = Color(0xFFB39DDB),  // Warna outline ungu lembut
    outlineVariant = Color(0xFFEDE7F6),  // Variasi outline lebih cerah

    scrim = Color(0x80000000),  // Scrim semi-transparan
    surfaceBright = Color(0xFFFFFFFF),  // Permukaan cerah
    surfaceContainer = Color(0xFFF3E5F5),  // Kontainer permukaan
    surfaceContainerHigh = Color(0xFFD1C4E9),  // Kontainer tinggi
    surfaceContainerHighest = Color(0xFFD1C4E9),  // Kontainer tertinggi
    surfaceContainerLow = Color(0xFFCCCCCC),  // Kontainer rendah
    surfaceContainerLowest = Color(0xFFB0BEC5),  // Kontainer terendah
    surfaceDim = Color(0xFF9E9E9E)  // Permukaan gelap
)

// Dark Color Scheme for Lavender
private val lavenderDarkColorScheme = darkColorScheme(
    primary = Color(0xFFEDE7F6),  // Ungu muda sangat terang untuk elemen utama
    onPrimary = Color(0xFF000000),  // Teks hitam di atas elemen utama
    primaryContainer = Color(0xFFB39DDB),  // Kontainer ungu lembut
    onPrimaryContainer = Color(0xFFFFFFFF),  // Teks putih di atas kontainer utama

    secondary = Color(0xFFF8BBD0),  // Pink lembut terang
    onSecondary = Color(0xFF000000),  // Teks hitam di atas elemen sekunder
    secondaryContainer = Color(0xFFCE93D8),  // Kontainer pink lembut
    onSecondaryContainer = Color(0xFFFFFFFF),  // Teks putih di atas kontainer sekunder

    tertiary = Color(0xFFB2DFDB),  // Hijau kebiruan lembut
    onTertiary = Color(0xFF000000),  // Teks hitam di atas elemen aksen
    tertiaryContainer = Color(0xFF80CBC4),  // Kontainer aksen terang
    onTertiaryContainer = Color(0xFFFFFFFF),  // Teks putih di atas kontainer aksen

    background = Color(0xFF121212),  // Latar belakang gelap
    onBackground = Color(0xFFE0E0E0),  // Teks cerah untuk kontras

    surface = Color(0xFF1E1E1E),  // Permukaan gelap
    onSurface = Color(0xFFE0E0E0),  // Teks cerah di atas permukaan

    surfaceVariant = Color(0xFFD1C4E9),  // Variasi permukaan terang
    onSurfaceVariant = Color(0xFF000000),  // Teks hitam di atas permukaan variabel

    surfaceTint = Color(0xFFB39DDB),  // Tint untuk permukaan gelap

    inverseSurface = Color(0xFFD0D0D0),  // Warna cerah untuk permukaan terbalik
    inverseOnSurface = Color(0xFF000000),  // Teks hitam untuk permukaan terbalik

    error = Color(0xFFD32F2F),  // Warna untuk status kesalahan
    onError = Color(0xFFFFFFFF),  // Teks putih di atas elemen kesalahan
    errorContainer = Color(0xFFFFC1C1),  // Kontainer kesalahan
    onErrorContainer = Color(0xFF000000),  // Teks hitam di atas kontainer kesalahan

    outline = Color(0xFFB39DDB),  // Warna outline ungu lembut
    outlineVariant = Color(0xFFEDE7F6),  // Variasi outline lebih cerah

    scrim = Color(0x80000000),  // Scrim semi-transparan
    surfaceBright = Color(0xFF555555),  // Permukaan cerah dalam mode gelap
    surfaceContainer = Color(0xFF1E1E1E),  // Kontainer gelap
    surfaceContainerHigh = Color(0xFFD1C4E9),  // Kontainer tinggi dalam mode gelap
    surfaceContainerHighest = Color(0xFFD1C4E9),  // Kontainer tertinggi dalam mode gelap
    surfaceContainerLow = Color(0xFFCCCCCC),  // Kontainer rendah dalam mode gelap
    surfaceContainerLowest = Color(0xFFB0BEC5),  // Kontainer terendah dalam mode gelap
    surfaceDim = Color(0xFF222222)  // Permukaan gelap dalam mode gelap
)

// Combine into HlsmColorScheme
internal val LavenderColorScheme = HlsmColorScheme(
    lightScheme = lavenderLightColorScheme,
    darkScheme = lavenderDarkColorScheme
)

