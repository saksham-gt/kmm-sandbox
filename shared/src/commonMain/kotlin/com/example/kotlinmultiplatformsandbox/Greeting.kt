package com.example.kotlinmultiplatformsandbox

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val firstWord = if(Random(
                1000).nextBoolean()) "Hi!" else "Hello!"
        return "${firstWord}\nGuess what it is! > ${platform.name.reversed()}"
    }
}