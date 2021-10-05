package test10

abstract class Language {
    abstract val version: Double

    abstract fun packageName(): String
}

class Kotlin : Language() {
    override val version = 1.4
    override fun packageName() = "example.kotlin"
}