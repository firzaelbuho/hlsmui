package io.github.firzaelbuho.hlsmui.screen.generate.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ComponentSection() {
    Column{
        Text(
            text = "Component Section",
            color = MaterialTheme.colorScheme.onBackground
        )
    }
}

@Composable
private fun Code(){

}
