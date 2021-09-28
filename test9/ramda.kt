package test9
fun myRepeat(times: Int, action: (Int) -> Unit) {
    for (index in 0 until times) {
        action(index)
    }
}

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
    myRepeat(3, { i -> println("Hello, $i")})

    val list = listOf("AAA", "BBB", "CCC")
    list.forEach {
        println(it)
    }
    list.forEachIndexed { index, value ->
        println("$index -> $value")
    }

    val list1 = listOf(1, 2, 3)
    val list2 = list.map { it * 2 }
    println(list2)
}