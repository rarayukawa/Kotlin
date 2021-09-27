fun interface Calculator {
    fun times(x: Int): Int
}

fun main() {
    val result = Calculator {it * 2}
    println(result.times(10))
}