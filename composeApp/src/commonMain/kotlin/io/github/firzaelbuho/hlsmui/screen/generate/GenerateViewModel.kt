package io.github.firzaelbuho.hlsmui.screen.generate

import androidx.lifecycle.ViewModel
import io.github.firzaelbuho.hlsmui.model.SchemeMode
import io.github.firzaelbuho.hlsmui.screen.generate.scheme.toHexString
import io.github.firzaelbuho.hlsmui.styles.font.HlsmFont
import io.github.firzaelbuho.hlsmui.styles.scheme.HlsmColorScheme
import io.github.firzaelbuho.hlsmui.styles.shapes.HlsmShapes
import io.github.firzaelbuho.hlsmui.styles.themes.HlsmTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

enum class Section(){
    Theme,
    Animation,
    Component
}



data class GenerateUiState(
    val section: Section = Section.Theme,
)

class GenerateViewModel: ViewModel(){
    private  val _uiState = MutableStateFlow(GenerateUiState())
    val uiState : StateFlow<GenerateUiState> = _uiState



    fun updateSection(section: Section){
        _uiState.value = _uiState.value.copy(
            section = section
        )
    }


}