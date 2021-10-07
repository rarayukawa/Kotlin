package test10

val calculateLazyResult by lazy { calculateComplex() }
val hello by lazy { aisatu("らら") }

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
}