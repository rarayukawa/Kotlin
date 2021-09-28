package test9

val list = mutableListOf(1, 2, 3).apply {
    add(4)
    removeIf { it % 2 != 0 }
}

fun greeting(name: String?): String {
    return name?.let { "Hello, $it!" } ?: "Hello!"
}

fun main() {
    println(greeting("Bob"))
    println(greeting("rara"))

    val list = mutableListOf(1, 2, 3).apply {
        add(4)
        println("added 4.")
    }
    println(list)

    val result = mutableListOf(1, 2, 3).let {
        it.add(4)
        "result: $it"
    }
    println(result)
}