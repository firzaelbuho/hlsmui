package io.github.firzaelbuho.hlsmui.composable.input

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.firzaelbuho.hlsmui.model.SchemeMode
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme

@Composable
fun ColorSchemeSelector(
    currentSchemeMode: SchemeMode,
    currentHlsmTheme: HlsmColorScheme,
    colorSchemeList: List<HlsmColorScheme> = emptyList(),
    onColoSchemeSelected: (HlsmColorScheme) -> Unit // Fungsi untuk menangani tema yang dipilih
) {
    var expanded by remember { mutableStateOf(false) } // Mengontrol apakah menu terbuka atau tidak

    Box(modifier = Modifier.fillMaxWidth(1f).height(40.dp)) {
        OutlinedButton(
            onClick = { expanded = true },
            modifier = Modifier.fillMaxWidth(),

//            colors = OutlinedButtonDefaults.(
//                contentColor = MaterialTheme.colorScheme.onPrimary // Ubah warna teks
//            ),
            border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground) // Ubah warna border
        ) {
            Text(
                text = currentHlsmTheme.name,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 12.sp

            )
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
//                .fillMaxWidth()
                .heightIn(max = 400.dp) // Batasi tinggi maksimum
                .wrapContentHeight()
                .background(MaterialTheme.colorScheme.surfaceVariant)
        ) {
            colorSchemeList.forEach { scheme ->

                DropdownMenuItem(
                    onClick = {
                        onColoSchemeSelected(scheme) // Memanggil fungsi saat tema dipilih
                        expanded = false // Menutup dropdown
                    },

                    text = {
                        DropDownItem(scheme, currentSchemeMode)
                    }
                )
            }
        }

    }
}


@Composable
fun DropDownItem(scheme:HlsmColorScheme, currentSchemeMode: SchemeMode){
    val colorScheme = if(currentSchemeMode == SchemeMode.Light) scheme.lightScheme else scheme.darkScheme
    Row(
        modifier = Modifier
            .padding(8.dp)
            .clip(MaterialTheme.shapes.small)
            .background(colorScheme.background)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Text(
            text = scheme.name,
            modifier = Modifier.weight(3f),
            color = colorScheme.onBackground

        )
//        Spacer(modifier = Modifier.weight(2f))
        mutableListOf(
            colorScheme.primary,
            colorScheme.secondary,
            colorScheme.tertiary,
        ).forEach {
            Spacer(modifier = Modifier.weight(0.2f))
            Box(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(4.dp))
                    .height(24.dp)
                    .weight(1f)
                    .background(it)
            )
        }
    }
}

