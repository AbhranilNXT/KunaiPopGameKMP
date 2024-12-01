package com.abhranilnxt.kunaipopgame.domain.target

import androidx.compose.animation.core.Animatable
import androidx.compose.ui.graphics.Color

data class EasyTarget(
    override val x: Float = 0f,
    override val y: Animatable<Float, *> = Animatable(0f),
    override val radius: Float = 0f,
    override val fallingSpeed: Float = 0f,
    override val color: Color = Color(0xFFFFFFFF)
): Target
