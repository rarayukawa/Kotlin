class User {
    init {
        println("Initializer")
    }
    constructor() {
        println("Constractor Primary")
    }

    constructor(age: Int) : this() {
        println("constractor Secondary: age=$age")
    }
}

fun main() {
    val user1 = User()

    val user2 = User(age = 32)
}