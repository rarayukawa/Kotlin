package test10

fun main() {
    try {
        val i = "a".toInt()
    } catch (e: Exception) {
        println(e.message)
    }
}