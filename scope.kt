fun main() {
    for ( i in 1..10) {
        println(i)
    }

    for (s in 'a'..'c') {
        println(s)
    }

    println(5 in 1..10)
    println(5 !in 1..10)
    var a = 10
    a += 5

    a = 10
    a -= 5

    a = 10
    a *= 5

    a = 10
    a /= 5

    a = 10
    a %= 5

    1 == 1
    "abc" != "abc"

    10 > 1
    1 < 10
    5 >= 5
    6 <= 5


    val input: String? = null
    val text = input ?: "default"
    println(text)
}
