package io.github.firzaelbuho.hlsmui.styles.font

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import hlsmui.composeapp.generated.resources.Res
import hlsmui.composeapp.generated.resources.*


import org.jetbrains.compose.resources.Font

class HlsmGeneratedFont {
    companion object{


        @Composable
        fun getFontFamily(font:HlsmFont): FontFamily {
            return when(font){

                HlsmFont.Agdasima -> (HlsmGeneratedFont.Agdasima())
                HlsmFont.Arima -> (HlsmGeneratedFont.Arima())
                HlsmFont.BebasNeue -> (HlsmGeneratedFont.BebasNeue())
                HlsmFont.ChelaOne -> (HlsmGeneratedFont.ChelaOne())
                HlsmFont.ComicNeue -> (HlsmGeneratedFont.ComicNeue())
                HlsmFont.Courgette -> (HlsmGeneratedFont.Courgette())
                HlsmFont.DancingScript -> (HlsmGeneratedFont.DancingScript())
                HlsmFont.Dynapuff -> (HlsmGeneratedFont.Dynapuff())

                HlsmFont.Karla -> (HlsmGeneratedFont.Karla())
                HlsmFont.LondrinaSketch ->(HlsmGeneratedFont.LondrinaSketch())
                HlsmFont.Montserrat -> (HlsmGeneratedFont.Montserrat())
                HlsmFont.NotoSans -> (HlsmGeneratedFont.NotoSans())
                HlsmFont.NotoSerif ->(HlsmGeneratedFont.NotoSerif())
                HlsmFont.Outfit -> (HlsmGeneratedFont.Outfit())
                HlsmFont.Pacifico -> (HlsmGeneratedFont.Pacifico())
                HlsmFont.PlaywriteGbs -> (HlsmGeneratedFont.PlaywriteGbs())
                HlsmFont.PlusJakartaSans -> (HlsmGeneratedFont.PlusJakartaSans())
                HlsmFont.Quicksand -> (HlsmGeneratedFont.QuickSand())
                HlsmFont.Roboto -> (HlsmGeneratedFont.Roboto())
                HlsmFont.RobotoMono -> (HlsmGeneratedFont.RobotoMono())

                else -> HlsmGeneratedFont.Default()
            }

        }


        fun Default() = FontFamily.Default
        fun Serif() = FontFamily.Serif
        fun SansSerif() = FontFamily.SansSerif
        fun Cursive() = FontFamily.Cursive
        fun Monospace() = FontFamily.Monospace


        @Composable
        fun Agdasima() = FontFamily(Font(Res.font.agdasima_regular))
        @Composable
        fun Arima() = FontFamily(Font(Res.font.arima_regular))

        @Composable
        fun BebasNeue() = FontFamily(Font(Res.font.bebasneue_regular))

        @Composable
        fun ChelaOne() = FontFamily(Font(Res.font.chelaone_regular))
        @Composable
        fun ComicNeue() = FontFamily(Font(Res.font.comicneue_regular))
        @Composable
        fun Courgette() = FontFamily(Font(Res.font.courgette_regular))
        @Composable
        fun DancingScript() = FontFamily(Font(Res.font.dancingscript_regular))
        @Composable
        fun Dynapuff() = FontFamily(Font(Res.font.dynapuff_regular))

        @Composable
        fun Karla() = FontFamily(Font(Res.font.karla_regular))

        @Composable
        fun LondrinaSketch() = FontFamily(Font(Res.font.londrinasketch_regular))

        @Composable
        fun Montserrat() = FontFamily(Font(Res.font.montserrat_regular))

        @Composable
        fun NotoSans() = FontFamily(Font(Res.font.notosans_regular))
        @Composable
        fun NotoSerif() = FontFamily(Font(Res.font.notoserif_regular))
        @Composable
        fun Outfit() = FontFamily(Font(Res.font.outfit_regular))
        @Composable
        fun PlaywriteGbs() = FontFamily(Font(Res.font.playwritegbs_regular))
        @Composable
        fun PlusJakartaSans() = FontFamily(Font(Res.font.plusjakartasans_regular))
        @Composable
        fun Pacifico() = FontFamily(Font(Res.font.pacifico_regular))
        @Composable
        fun QuickSand() = FontFamily(Font(Res.font.quicksand_regular))
        @Composable
        fun Roboto() = FontFamily(Font(Res.font.roboto_regular))
        @Composable
        fun RobotoMono() = FontFamily(Font(Res.font.robotomono_regular))


    }
}