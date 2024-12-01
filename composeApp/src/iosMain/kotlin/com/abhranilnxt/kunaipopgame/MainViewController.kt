package com.abhranilnxt.kunaipopgame

import androidx.compose.ui.window.ComposeUIViewController
import com.abhranilnxt.kunaipopgame.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }