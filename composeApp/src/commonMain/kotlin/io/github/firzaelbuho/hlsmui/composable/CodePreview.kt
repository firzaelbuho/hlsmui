package io.github.firzaelbuho.hlsmui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.unit.dp
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Solid
import compose.icons.fontawesomeicons.solid.Copy
import io.github.firzaelbuho.hlsmui.copyToClipboard

@Composable
fun CodePreview(code: String){
    Column (
        modifier = Modifier
            .fillMaxSize()

            .clip(RoundedCornerShape(16.dp))


            .background(MaterialTheme.colorScheme.surfaceVariant)
            .border(width = 2.dp, color = MaterialTheme.colorScheme.onBackground, shape = RoundedCornerShape(16.dp))
            .padding(32.dp)
    ) {
        CopyButton(code)
        Spacer(modifier = Modifier.height(16.dp))

        SelectionContainer {
        Text(
            color = MaterialTheme.colorScheme.onBackground,
            text = """
$code


/* code generated by hlsmUI ( hlsmui.vercell.app ) */
            """.trimIndent()
        )
        }
    }
}
/**/
@Composable
fun CopyButton(textToCopy: String) {
    val clipboardManager = LocalClipboardManager.current
    Row (
        modifier = Modifier
            .fillMaxWidth(),

        horizontalArrangement = Arrangement.End
    ) {
        IconButton(
            onClick = { copyToClipboard(textToCopy, clipboardManager) }
        ){
            Icon(
                modifier = Modifier.size(24.dp),
                imageVector = FontAwesomeIcons.Solid.Copy, // Ikon dari FontAwesome
                contentDescription = "cop",
                tint = MaterialTheme.colorScheme.onBackground
            )
        }
    }


}