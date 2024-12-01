package com.abhranilnxt.kunaipopgame.di

import com.abhranilnxt.kunaipopgame.domain.audio.AudioPlayer
import org.koin.dsl.module

actual val targetModule = module {
    single<AudioPlayer> { AudioPlayer() }
}