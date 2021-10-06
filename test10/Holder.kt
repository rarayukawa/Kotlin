package test10

//class Holder<T> (
//    private val value: T
//    ) {
//    fun getValue(): T = value
//}
//
//fun main() {
//    println(Holder("hello").getValue())
//    println(Holder(1).getValue())
//    println(Holder(true).getValue())
//}

class Holder(
    private val value: Any,
) {
    fun getValue(): Any = value
}

fun main() {
    println(Holder("hello").getValue())
    println(Holder(1).getValue())
    println(Holder(true).getValue())
}