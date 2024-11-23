package io.github.firzaelbuho.hlsmui.styles.themes

import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont
import io.github.firzaelbuho.hlsmui.styles.font.HlsmGeneratedFont
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShapes
import io.github.firzaelbuho.hlsmui.styles.typography.HlsmTypography
import io.github.firzaelbuho.hlsmui.styles.typography.HlsmTypography.Companion.Candy
import io.github.firzaelbuho.hlsmui.styles.typography.template.CandyTypography

data class HlsmTheme (
    val name:String = "default",
    val hlsmFont: HlsmFont = HlsmFont.Montserrat,
    val hlsmColorScheme: HlsmColorScheme = HlsmColorScheme.Default,
    val hlsmShapes: HlsmShapes = HlsmShapes.Default
){

    @Composable
    fun getTypography(font:HlsmFont = this.hlsmFont): Typography {
        return when(font){

            HlsmFont.Agdasima -> createTypography(HlsmGeneratedFont.Agdasima())
            HlsmFont.Arima -> createTypography(HlsmGeneratedFont.Arima())
            HlsmFont.BebasNeue -> createTypography(HlsmGeneratedFont.BebasNeue())
            HlsmFont.ChelaOne -> createTypography(HlsmGeneratedFont.ChelaOne())
            HlsmFont.ComicNeue -> createTypography(HlsmGeneratedFont.ComicNeue())
            HlsmFont.Courgette -> createTypography(HlsmGeneratedFont.Courgette())
            HlsmFont.DancingScript -> createTypography(HlsmGeneratedFont.DancingScript())
            HlsmFont.Dynapuff -> createTypography(HlsmGeneratedFont.Dynapuff())

            HlsmFont.Karla -> createTypography(HlsmGeneratedFont.Karla())
            HlsmFont.LondrinaSketch -> createTypography(HlsmGeneratedFont.LondrinaSketch())
            HlsmFont.Montserrat -> createTypography(HlsmGeneratedFont.Montserrat())
            HlsmFont.NotoSans -> createTypography(HlsmGeneratedFont.NotoSans())
            HlsmFont.NotoSerif -> createTypography(HlsmGeneratedFont.NotoSerif())
            HlsmFont.Outfit -> createTypography(HlsmGeneratedFont.Outfit())
            HlsmFont.Pacifico -> createTypography(HlsmGeneratedFont.Pacifico())
            HlsmFont.PlaywriteGbs -> createTypography(HlsmGeneratedFont.PlaywriteGbs())
            HlsmFont.PlusJakartaSans -> createTypography(HlsmGeneratedFont.PlusJakartaSans())
            HlsmFont.Quicksand -> createTypography(HlsmGeneratedFont.QuickSand())
            HlsmFont.Roboto -> createTypography(HlsmGeneratedFont.Roboto())
            HlsmFont.RobotoMono -> createTypography(HlsmGeneratedFont.RobotoMono())

            else -> Typography()
        }

    }

    private fun createTypography(fontFamily: FontFamily):Typography{
        return Typography(
            displayLarge = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 57.sp,
                lineHeight = 64.sp,
                letterSpacing = (-0.25).sp
            ),
            displayMedium = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 45.sp,
                lineHeight = 52.sp,
                letterSpacing = 0.sp
            ),
            displaySmall = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 36.sp,
                lineHeight = 44.sp,
                letterSpacing = 0.sp
            ),
            headlineLarge = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                lineHeight = 40.sp,
                letterSpacing = 0.sp
            ),
            headlineMedium = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                lineHeight = 36.sp,
                letterSpacing = 0.sp
            ),
            headlineSmall = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                lineHeight = 32.sp,
                letterSpacing = 0.sp
            ),
            titleLarge = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                letterSpacing = 0.sp
            ),
            titleMedium = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.15.sp
            ),
            titleSmall = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.1.sp
            ),
            bodyLarge = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
            ),
            bodyMedium = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.25.sp
            ),
            bodySmall = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.4.sp
            ),
            labelLarge = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.1.sp
            ),
            labelMedium = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp
            ),
            labelSmall = TextStyle(
                fontFamily = fontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 11.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp
            )
        )
    }

    companion object{

        val Default = HlsmTheme()
        val Candy = HlsmTheme(
            name = "Candy",
            hlsmColorScheme = HlsmColorScheme.Candy,

        )
        val Chocolate = HlsmTheme(
            name = "Chocolate",
            hlsmColorScheme = HlsmColorScheme.Chocolate,
        )

        val Cupcake = HlsmTheme(
            name = "Cupcake",
            hlsmColorScheme = HlsmColorScheme.Cupcake,
        )
        val Elegant = HlsmTheme(
            name = "Elegant",
            hlsmColorScheme = HlsmColorScheme.Elegant,
        )

        val Emerald = HlsmTheme(
            name = "Emerald",
            hlsmColorScheme = HlsmColorScheme.Emerald,
        )

        val Forest = HlsmTheme(
            name = "Forest",
            hlsmColorScheme = HlsmColorScheme.Forest,
        )

        val Galaxy = HlsmTheme(
            name = "Galaxy",
            hlsmColorScheme = HlsmColorScheme.Galaxy,
        )

        val LangitBiru = HlsmTheme(
            name = "LangitBiru",
            hlsmColorScheme = HlsmColorScheme.LangitBiru,
            hlsmFont = HlsmFont.Quicksand
        )

        val Lavender = HlsmTheme(
            name = "Lavender",
            hlsmColorScheme = HlsmColorScheme.Lavender,

        )

        val Luxury = HlsmTheme(
            name = "Luxury",
            hlsmColorScheme = HlsmColorScheme.Luxury,

        )

        val Nature = HlsmTheme(
            name = "Nature",
            hlsmColorScheme = HlsmColorScheme.Nature,
        )

        val Ocean = HlsmTheme(
            name = "Ocean",
            hlsmColorScheme = HlsmColorScheme.Ocean,

        )


        val Pastel = HlsmTheme(
            name = "Pastel",
            hlsmColorScheme = HlsmColorScheme.Pastel,
        )


        val RedGroup = HlsmTheme(
            name = "RedGroup",
            hlsmColorScheme = HlsmColorScheme.RedGroup,
        )

        val Sky = HlsmTheme(
            name = "Sky",
            hlsmColorScheme = HlsmColorScheme.Sky,
        )

        val Sunset = HlsmTheme(
            name = "Sunset",
            hlsmColorScheme = HlsmColorScheme.Sunset,
        )

        val Vintange = HlsmTheme(
            name = "Vintange",
            hlsmColorScheme = HlsmColorScheme.Vintange,
        )

        val Sakura = HlsmTheme(
            name = "Sakura",
            hlsmColorScheme = HlsmColorScheme.Sakura,

        )
        val Snow = HlsmTheme(
            name = "Snow",
            hlsmColorScheme = HlsmColorScheme.Snow,
        )
        val Monochrome = HlsmTheme(
            name = "Monochrome",
            hlsmColorScheme = HlsmColorScheme.Monochrome,
        )

        val JakartaBus = HlsmTheme(
            name = "Jakarta Bus",
            hlsmColorScheme = HlsmColorScheme.JakartaBus,

        )


        fun getAllThemes():List<HlsmTheme>{
            val themes = listOf(
                HlsmTheme.Default,

                HlsmTheme.Candy,
                HlsmTheme.Chocolate,
                HlsmTheme.Cupcake,

                HlsmTheme.Elegant,
                HlsmTheme.Emerald,

                HlsmTheme.Forest,


                HlsmTheme.Galaxy,

                HlsmTheme.JakartaBus,
                HlsmTheme.LangitBiru,
                HlsmTheme.Lavender,
                HlsmTheme.Luxury,

                HlsmTheme.Monochrome,
                HlsmTheme.Nature,
                HlsmTheme.Ocean,
                HlsmTheme.Pastel,
                HlsmTheme.RedGroup,

                HlsmTheme.Sunset,
                HlsmTheme.Sakura,
                HlsmTheme.Sky,
                HlsmTheme.Snow,

                HlsmTheme.Vintange
                )
            return themes
        }

    }
}