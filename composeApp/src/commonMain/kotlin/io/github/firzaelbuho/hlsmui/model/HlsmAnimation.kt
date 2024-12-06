package io.github.firzaelbuho.hlsmui.model

import androidx.compose.animation.slideInVertically
import io.github.firzaelbuho.hlsmui.model.anims.slideIn


enum class AnimationType{
    SlideIn,
    SlideOut,
    SlideInFadeIn,
    SlideOutFadeOut,
    FadeIn,
    FadeOut,
    ZoomIn,
    ZoomOut,
    ZoomInFadeIn,
    ZoomOutFadeOut
}

data class HlsmAnimation(
    val name : String,
    val type : AnimationType,
    val code : String,
    val description : String = ""
){
   companion object{
       val SlideIn = slideIn
   }
}





