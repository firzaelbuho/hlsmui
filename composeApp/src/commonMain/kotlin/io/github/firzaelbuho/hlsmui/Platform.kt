package io.github.firzaelbuho.hlsmui

import androidx.compose.runtime.Composable

interface Platform {
    val name: String
}

//expect fun getPlatform(): Platform


expect fun copyToClipboard(text: String, clipboardManager: Any? = null)

expect fun onLinkClick(url: String)
