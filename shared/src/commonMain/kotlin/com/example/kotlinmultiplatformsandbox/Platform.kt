package com.example.kotlinmultiplatformsandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect val num: Int