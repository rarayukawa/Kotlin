package test10

class Component(val a: String, val b: String) {
    operator fun component1() = a //component1()はoperatorを使ってオーバーロードする
    operator fun component2() = b
}

fun main() {
    val (a, b) = Component(//分割宣言を使ってあ、b変数に分割する
        a = "component1",
        b = "component2"
    )

    println(a)
    println(b)
}