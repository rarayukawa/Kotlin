package test10

class AnyHolder(
    private val value: Any
) {
    fun getValue(): Any = value
}

class GenericsHolder<T>(
    private val value: T
) {
    fun getValue(): T = value
}

class Dog {
    fun bark() = "Wan Wan"
}

fun main() {
//    println(AnyHolder(Dog()).getValue().berk())   型を保持していないので呼び出せない
    println(GenericsHolder(Dog()).getValue().bark())   //型情報を保持しているので呼び出せる
}