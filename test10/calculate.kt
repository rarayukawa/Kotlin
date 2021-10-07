package test10

val calculateLazyResult by lazy { calculateComplex() }
val hello by lazy { aisatu("らら") }
lateinit var name: String  //lateinitを利用したプロパティ宣言puropatexisenngenn

fun aisatu(name: String): String {
    println("$name,こんにちは")
    return "挨拶します"
}

fun calculateComplex(): Int {
    println("calculateComplex")
    return 100
}

fun main() {
    println("main start")
    println(calculateLazyResult)    //calculateLazyResultと100が出力される
    println(calculateLazyResult)    //１００が表示される
    println(hello)
    println(hello)
    name = "Kotlin"//任意のタイミングで初期化できる
}