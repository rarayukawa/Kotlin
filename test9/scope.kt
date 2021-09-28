package test9

val list = mutableListOf(1, 2, 3).apply {
    add(4)
    removeIf { it % 2 != 0 }
}

fun greeting(name: String?): String {
    return name?.let { "Hello, $it!" } ?: "Hello!"
}