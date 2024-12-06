package io.github.firzaelbuho.hlsmui.screen.generate.animation

import io.github.firzaelbuho.hlsmui.animation.Animation
import io.github.firzaelbuho.hlsmui.model.HlsmAnimation

data class AnimationUiState(
    val animationList: List<HlsmAnimation> = emptyList(),
    val currentAnimation: HlsmAnimation = HlsmAnimation.SlideIn,

    val isOffsetShown: Boolean = false,
    val offset:Float = 300f,

    val isDurationMillisShown: Boolean = false,
    val durrationMilliis:Long = 1000,

    val isInitialScaleShown: Boolean = false,
    val initialScale:Float = 0.5f,

    val isTargetScaleShown: Boolean = false,
    val targetScale:Float = 1.2f ,

    val isSlideDirectionShown: Boolean = false,
    val delayMillis:Long = 1000
)


class AnimationViewModel {
}