package test9

class Vesions {
    companion object {
        const val KOTLIN = 1.4
        const val GRADLE = 6.6
        const val JETPACK_COMPOSE = 0.1

        fun asMap() = mapOf(
            "Kotlin" to Versions.KOTLIN,
            "gradle" to Versions.GRADLE,
            "jetpackCompose" to Versions.JETPACK_COMPOSE,
        )
    }
    var outerVersion = 0.0

    inner class Kotlin {
        var innerVersion = 1.4

        fun setOuterVersion(version: Double) {
            outerVersion = version
        }
    }
}

fun main() {
    println(Versions.KOTLIN)
    println(Versions.asMap())
}