package scopeFunction

fun main() {
    val adam = Person("Adam",12, "Tokyo").apply {
        age = 20
        city = "China"
    }
    println(adam)
}
