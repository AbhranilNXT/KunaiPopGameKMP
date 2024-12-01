package com.abhranilnxt.kunaipopgame.domain

data class Game(
    val status: GameStatus = GameStatus.Idle,
    val score: Int = 0,
    val settings: GameSettings = GameSettings()
)

data class GameSettings(
    val ninjaSpeed: Float = 15f,
    val weaponSpeed: Float = 20f,
    val targetSpeed: Float = 30f
)

enum class GameLevel(val score: Int) {
    One(score = 10),
    Two(score = 20),
    Three(score = 30),
    Four(score = 40),
    Five(score = 50)
}

val levelSettings = listOf(
    GameSettings(ninjaSpeed = 1f, weaponSpeed = 1f, targetSpeed = 5f),
    GameSettings(ninjaSpeed = 0f, weaponSpeed = 1f, targetSpeed = 6f),
    GameSettings(ninjaSpeed = 0f, weaponSpeed = 1f, targetSpeed = 7f),
    GameSettings(ninjaSpeed = 0f, weaponSpeed = 1f, targetSpeed = 8f),
    GameSettings(ninjaSpeed = 0f, weaponSpeed = 1f, targetSpeed = 9f)
)

val levels = listOf(
    GameLevel.One to levelSettings[0],
    GameLevel.Two to levelSettings[1],
    GameLevel.Three to levelSettings[2],
    GameLevel.Four to levelSettings[3],
    GameLevel.Five to levelSettings[4]
)