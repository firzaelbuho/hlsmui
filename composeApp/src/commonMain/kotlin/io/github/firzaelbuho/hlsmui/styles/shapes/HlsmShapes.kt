package io.github.firzaelbuho.hlsmui.styles.shapes

import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// Default shapes as you defined
private val defaultShapes = Shapes()

// Variants of Shapes for different themes
private val roundedShapes = Shapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(24.dp)
)

private val cutCornerShapes = Shapes(
    small = CutCornerShape(8.dp),
    medium = CutCornerShape(16.dp),
    large = CutCornerShape(24.dp)
)

private val smoothRoundedShapes = Shapes(
    small = RoundedCornerShape(50.dp),
    medium = RoundedCornerShape(50.dp),
    large = RoundedCornerShape(50.dp)
)

private val noRoundedShapes = Shapes(
    small = RoundedCornerShape(0.dp),
    medium = RoundedCornerShape(0.dp),
    large = RoundedCornerShape(0.dp)
)

private val slightRoundedShapes = Shapes(
    small = RoundedCornerShape(2.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(6.dp)
)

private val extremeRoundedShapes = Shapes(
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(32.dp),
    large = RoundedCornerShape(48.dp)
)

// Class for HlsmShapes with different options
class HlsmShapes(
    val name: String = "default",
    val shapes: Shapes = defaultShapes
) {
    companion object {
        val Default = HlsmShapes("Default", defaultShapes)
        val Rounded = HlsmShapes("Rounded", roundedShapes)
        val CutCorner = HlsmShapes("CutCorner", cutCornerShapes)
        val SmoothRounded = HlsmShapes("SmoothRounded", smoothRoundedShapes)
        val NoRounded = HlsmShapes("NoRounded", noRoundedShapes)
        val SlightRounded = HlsmShapes("SlightRounded", slightRoundedShapes)
        val ExtremeRounded = HlsmShapes("ExtremeRounded", extremeRoundedShapes)

        fun getAllShapes(): List<HlsmShapes> {
            return listOf(
                Default,
                Rounded,
                CutCorner,
                SmoothRounded,
                NoRounded,
                SlightRounded,
                ExtremeRounded
            )
        }
    }
}
