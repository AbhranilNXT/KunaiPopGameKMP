package com.abhranilnxt.kunaipopgame.domain.audio

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class AudioPlayer {
    fun playSound(index: Int)
}

val soundResList = listOf(
    "files/pop.mp3"
)