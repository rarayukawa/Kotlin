package test10

sealed class Color {
    object Red: Color()
    object Green: Color()
    object Blue: Color()
}

fun main() {
    val red = Color.Red
    if (red == Color.Red) {
        println(red)
    }
}
