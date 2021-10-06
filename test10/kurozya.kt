package test10

fun main() {
    var i = 0
    (1..10).filter { it % 2 == 0 }.forEach {
        i += it
    }
    println(i)
}