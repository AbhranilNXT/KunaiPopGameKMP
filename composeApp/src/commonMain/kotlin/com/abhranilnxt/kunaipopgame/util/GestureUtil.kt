package com.abhranilnxt.kunaipopgame.util

import androidx.compose.ui.input.pointer.AwaitPointerEventScope
import com.abhranilnxt.kunaipopgame.domain.GameStatus

suspend fun AwaitPointerEventScope.detectMoveGesture(
    gameStatus: GameStatus,
    onLeft: () -> Unit,
    onRight: () -> Unit,
    onFingerLifted: () -> Unit
) {
    while(gameStatus == GameStatus.Started) {
        val downEvent = awaitPointerEvent()
        val initialDown = downEvent.changes.firstOrNull { it.pressed }
        if(initialDown == null) continue

        val primaryPointerId =  initialDown.id
        var previousPosition = initialDown.position

        while(true) {
            val event = awaitPointerEvent()
            val change = event.changes.firstOrNull { it.id == primaryPointerId }

            if(change == null || !change.pressed) {
                onFingerLifted()
                break
            }

            val currentPosition = change.position
            val deltaX = currentPosition.x - previousPosition.x

            if(deltaX < 0) {
                onLeft()
            } else if(deltaX > 0) {
                onRight()
            }

            previousPosition = currentPosition
            change.consume()
        }
    }
}