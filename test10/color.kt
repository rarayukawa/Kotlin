package test10

data class Color(var name: String)

fun main() {
    val number = 10
    println(number.let {
        it * 2
    })
    println(number.run {
        this * 2
    })
    println(with(number) {
        this * 2
    })
    println(number.also {
        it * 2
    })
    println(number.apply {
        this * 2
    })

    val red = Color(name = "red")
    println(red.let {
        it.name = "black"
    })
    println(red.run {
        name = "black"
    })
    println(with(red) {
        name = "black"
    })
    println(red.also {
        it.name = "black"
    })
    println(red.apply {
        name = "black"
    })
}
