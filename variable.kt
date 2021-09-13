fun main() {
    val isA : Boolean = true
    val isB: Boolean = false

    true || false
    false || false
    true && true
    false && false
    !true
    !false

    val character: Char = 'a'
    println(character)

    val a: String = "abc"
    val b: String = "abc"
    println(a == b)

    val world: String = "World"
    val result: String = """
        |Hello
        |$world
        |
    """.trimMargin()
    println(result)

    val x1:Int = 100
    val x2:Int = 100
    println("${x1 * x2}")

    val string: String = "hello world"
    println(string[4])
}