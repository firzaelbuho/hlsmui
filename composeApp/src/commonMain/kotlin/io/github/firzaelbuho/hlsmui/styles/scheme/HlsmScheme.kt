package io.github.firzaelbuho.hlsmui.styles.scheme


import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.template.*


class HlsmColorScheme (
    val lightScheme : ColorScheme = lightColorScheme(),
    val darkScheme : ColorScheme = darkColorScheme()
){
    companion object{
        val Default = HlsmColorScheme()
        val Candy = CandyColorScheme
        val Chocolate = ChocolateColorScheme
        val Elegant = ElegantColorScheme
        val Forest = ForestColorScheme
        val LangitBiru = LangitBiruColorScheme
        val RedGroup = RedGroupColorScheme

        val Nature = NatureColorScheme
        val Galaxy = GalaxyColorScheme

        val Ocean = OceanColorScheme
        val Pastel = PastelColorScheme
//
        val Cupcake = CupcakeColorScheme
//
//
        val Sunset = SunsetColorScheme
        val Lavender = LavenderColorScheme
        val Emerald = EmeraldColorScheme
        val Sky = SkyColorScheme
        val Vintange = VintageColorScheme
        val Luxury = LuxuryColorScheme

        val Sakura = SakuraColorScheme
        val Snow = SnowColorScheme
        val Monochrome = MonochromeColorScheme
        val JakartaBus = JakartaBusColorScheme





//        fun generateVibrantColors(baseColor: Color): HlsmScheme {
//
//            return HlsmScheme()
//
//        }


    }
}
