package io.github.firzaelbuho.hlsmui

import kotlinx.browser.window

class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()


actual fun copyToClipboard(text: String, clipboardManager: Any?) {
//    window.navigator.clipboard.writeText(text).catch {
//        js("console.log('Clipboard API not supported')")
//    }
    window.navigator.clipboard.writeText(text)
}