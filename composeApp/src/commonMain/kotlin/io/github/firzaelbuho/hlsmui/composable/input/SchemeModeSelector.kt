package io.github.firzaelbuho.hlsmui.composable.input


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.wrapContentHeight
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
import io.github.firzaelbuho.hlsmui.model.SchemeMode

@Composable
fun SchemeModeSelector(
    currentSchemeMode: SchemeMode,
    schemeModeList: List<SchemeMode> = SchemeMode.entries,
    onSchemeModeSelected: (SchemeMode) -> Unit // Fungsi untuk menangani tema yang dipilih
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
                text = currentSchemeMode.name,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 12.sp

            )

        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            schemeModeList.forEach { it ->
                DropdownMenuItem(

                    modifier = Modifier
                        .heightIn(max = 400.dp) // Batasi tinggi maksimum
                        .wrapContentHeight()
                        .background(MaterialTheme.colorScheme.surfaceVariant),

                    onClick = {
                        onSchemeModeSelected(it) // Memanggil fungsi saat tema dipilih
                        expanded = false // Menutup dropdown
                    },
                    text = {
                        Text(
                            text = it.name,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }
                )
            }
        }
    }
}
