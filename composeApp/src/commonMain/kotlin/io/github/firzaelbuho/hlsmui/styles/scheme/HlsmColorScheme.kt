package io.github.firzaelbuho.hlsmui.styles.scheme


import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.astronomy.BlackHoleColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.astronomy.EclipseColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.brand.JakartaBusColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.brand.LangitBiruColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.brand.RedGroupColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.nature.EmeraldColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.nature.ForestColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.astronomy.GalaxyColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.astronomy.MoonlightColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.nature.LavenderColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.nature.WoodColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.nature.OceanColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.nature.SakuraColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.astronomy.SkyColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.nature.SnowColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.astronomy.SunriseColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.astronomy.SunsetColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.brand.SearchEngineColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.classic.MonochromeColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.classic.VintageColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.colorful.CandyColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.colorful.ChocolateColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.colorful.CupcakeColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.colorful.LolipopColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.colorful.PastelColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.neutral.ElegantColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.neutral.GoldenLuxuryColorScheme
import io.github.firzaelbuho.hlsmui.styles.scheme.neutral.LuxuryColorScheme

enum class HlsmColorSchemeCategory{
    All, Nature, Fantasy, Anime, Brand, Art, Digital, Classic, Modern, Astronomy, Colorful, Neutral

}

data class HlsmColorScheme (
    val name : String = "Default",
    val lightScheme : ColorScheme = lightColorScheme(),
    val darkScheme : ColorScheme = darkColorScheme(),
    val description : String = "",
    val categories : List<HlsmColorSchemeCategory> = emptyList()
){
    companion object{

        // Brand

        val LangitBiru = LangitBiruColorScheme
        val RedGroup = RedGroupColorScheme
        val JakartaBus = JakartaBusColorScheme
        val SearchEngine = SearchEngineColorScheme


        // Nature

        val Forest = ForestColorScheme
        val Ocean = OceanColorScheme
        val Lavender = LavenderColorScheme
        val Sakura = SakuraColorScheme
        val Snow = SnowColorScheme
        val Emerald = EmeraldColorScheme
        val Wood = WoodColorScheme


        // Astronomy
        val Blackhole = BlackHoleColorScheme
        val Sunset = SunsetColorScheme
        val Sky = SkyColorScheme
        val Galaxy = GalaxyColorScheme
        val Sunrise = SunriseColorScheme
        val Eclipse = EclipseColorScheme
        val Moonlight = MoonlightColorScheme

        // Neutral
        val Elegant = ElegantColorScheme
        val Luxury = LuxuryColorScheme
        val GoldenLuxury = GoldenLuxuryColorScheme

        // Default
        val Default = HlsmColorScheme()

        // Colorful
        val Candy = CandyColorScheme
        val Chocolate = ChocolateColorScheme
        val Pastel = PastelColorScheme
        val Lolipop = LolipopColorScheme
        val Cupcake = CupcakeColorScheme
//
//

        // Classic
        val Vintange = VintageColorScheme
        val Monochrome = MonochromeColorScheme

        fun getAll():List<HlsmColorScheme>{
            return listOf(
                Default,

                RedGroup, JakartaBus, LangitBiru, SearchEngine,

                Forest, Ocean,  Lavender,  Sakura, Snow, Emerald, Wood,

                Sunset, Sky, Galaxy, Sunrise, Eclipse, Moonlight, Blackhole,

                Candy, Chocolate, Cupcake, Pastel, Lolipop,

                Luxury, Elegant, GoldenLuxury,

                Monochrome, Vintange



            ).sortedBy { it.name }
        }


    }
}
