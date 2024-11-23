package io.github.firzaelbuho.hlsmui.composable.themes

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ModeSwitcher(
    isDark:Boolean,
    onModeChanged:(Boolean)->Unit
) {
    // Remember the switch state


    // UI for the switch
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text(
            text = if (isDark) "Dark" else "Light",
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.width(4.dp))
        Switch(
            modifier = Modifier.scale(0.5f),
            checked = isDark,
            onCheckedChange = { onModeChanged(it) },

            colors = SwitchDefaults.colors(

                checkedTrackColor = MaterialTheme.colorScheme.primaryContainer,
                checkedThumbColor = MaterialTheme.colorScheme.primary,
                uncheckedThumbColor = MaterialTheme.colorScheme.primary,
                uncheckedTrackColor = MaterialTheme.colorScheme.background,
            )
        )

    }
}