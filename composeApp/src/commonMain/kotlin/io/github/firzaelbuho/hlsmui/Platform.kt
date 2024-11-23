package io.github.firzaelbuho.hlsmui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform


expect fun copyToClipboard(text: String, clipboardManager: Any? = null)
