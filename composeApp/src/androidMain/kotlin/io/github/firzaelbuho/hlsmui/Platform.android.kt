package io.github.firzaelbuho.hlsmui

import android.os.Build
import androidx.compose.runtime.Composable

class AndroidPlatform : Platform {
    override val name: String = "Android ${Build.VERSION.SDK_INT}"
}

//actual fun getPlatform(): Platform = AndroidPlatform()
actual fun copyToClipboard(text: String, clipboardManager: Any?) {
}

@Composable
actual fun KotlinStyledText(code: String) {
}

actual fun onLinkClick(url: String) {
}