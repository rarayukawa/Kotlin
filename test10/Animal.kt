package test10

interface Animal {
    val name: String
    fun greet(message: String)
}

class Cat : Animal {
    override val name: String
    get() {
        return "Siamese"
    }

    override fun greet(message: String) {
        println("$name $message")
    }
}

fun main() {
    val cat = Cat()
    println(cat.name)
    cat.greet("Hello")
}