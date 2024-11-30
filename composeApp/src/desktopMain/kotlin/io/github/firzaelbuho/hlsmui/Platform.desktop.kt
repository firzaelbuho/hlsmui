package io.github.firzaelbuho.hlsmui

import androidx.compose.runtime.Composable
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
//
actual fun copyToClipboard(text: String, clipboardManager: Any?) {
    val toolkit = Toolkit.getDefaultToolkit().systemClipboard
    val selection = StringSelection(text)
    toolkit.setContents(selection, selection)
}


actual fun onLinkClick(url: String) {
}