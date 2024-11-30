package io.github.firzaelbuho.hlsmui.composable.input

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShapes

@Composable
fun ShapeSelector(
    currentHlsmFont: HlsmShapes,
    hlsmShapesList: List<HlsmShapes> = HlsmShapes.getAllShapes(),
    onHlsmShapesSelected: (HlsmShapes) -> Unit // Fungsi untuk menangani tema yang dipilih
) {
    var expanded by remember { mutableStateOf(false) } // Mengontrol apakah menu terbuka atau tidak


    Box(modifier = Modifier.fillMaxWidth(0.6f).height(40.dp)) {
        OutlinedButton(
            onClick = { expanded = true },
            modifier = Modifier.fillMaxWidth(),

//            colors = OutlinedButtonDefaults.(
//                contentColor = MaterialTheme.colorScheme.onPrimary // Ubah warna teks
//            ),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground) // Ubah warna border
        ) {
            Text(
                text = currentHlsmFont.name,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 12.sp

            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            hlsmShapesList.forEach { hlsmShapes ->
                DropdownMenuItem(

                    onClick = {
                        onHlsmShapesSelected(hlsmShapes) // Memanggil fungsi saat tema dipilih
                        expanded = false // Menutup dropdown
                    },
                    text = {
                        Text(
                            text = hlsmShapes.name,
//                            fontFamily = HlsmGeneratedFont.getFontFamily(hlsmFont),
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }
        }
    }
}