package com.abhranilnxt.kunaipopgame

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform