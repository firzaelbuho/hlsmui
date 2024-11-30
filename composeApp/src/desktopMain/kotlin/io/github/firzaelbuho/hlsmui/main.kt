package io.github.firzaelbuho.hlsmui

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.github.firzaelbuho.hlsmui.di.initKoin

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "hlsmui",
    ) {
        App()
    }
}