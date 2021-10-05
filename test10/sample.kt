package test10

fun main() {
    val x:Any = 42
    if ( x is Int) {
        println(x.toString(radix = 2))
    }
    if (x is Int) {
        val s = x as Int
        println(x.toString(radix = 2))
    }
}