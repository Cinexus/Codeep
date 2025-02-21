package org.cinexus.coldeep

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform