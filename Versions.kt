class Versions {
    var outerVersion = 0.0

    inner class Kotlin {
        var innerVersion = 1.4
        fun setOuterVersion(version: Double) {
            outerVersion = version
        }
    }

    fun setInnerVersion(version: Double){
    }
}

fun main() {
    println(Versions().Kotlin().innerVersion)
}