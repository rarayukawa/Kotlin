package test9

object Versions {
    const val KOTLIN = 1.4
    const val GRADLE = 6.6
    const val JETPACK_COMPOSE = 0.1

    fun asMap() = mapOf(
        "Kotlin" to KOTLIN,
        "gradle" to GRADLE,
        "jetpackCompose" to JETPACK_COMPOSE,
    )
}

fun main() {
    println(Versions.KOTLIN)
    println(Versions.asMap())
}