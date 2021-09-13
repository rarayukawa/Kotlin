fun main(args: Array<String>) {
    hello("Kotlin")
    println("2 + 5 = ${plus(2, 5)}")
}

fun hello(name: String) {
    println("Hello, ${name}!")
}

fun plus(a: Int, b: Int): Int {
    return a + b
}

fun times(a: Int, b: Int) = a * b
fun square(n: Int): Int = times(n,n)

fun max(a: Int, b: Int): Int = if (a < b) b else a

fun min(a: Int, b: Int): Int {
    var x = max(a, b)
    var y = min(a, b)
    while(y != 0) {
       val w = y
       y = x % y
       x = w
    }
    return x
}

fun hello(name: String, exclamation: Boolean = false) {
    val suffix = if (exclamation) "!" else ""
    println("Hello, ${suffix}")
}