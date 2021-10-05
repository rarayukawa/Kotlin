package test10

open class Language {
    open fun hello() {
        println("Hello Language")
    }
}

class Kotlin : Language() {
    override fun hello() {
        println("Hello Kotlin")
    }
}

fun main() {
    val kotlin = Kotlin()
    kotlin.hello()
}