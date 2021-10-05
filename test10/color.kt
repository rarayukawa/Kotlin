package test10

fun main() {
    data class Color(   //openできないので継承できない
        val name: String,
        val code: String,
    )

    val dataA = Color(
        name = "red",
        code = "FF0000"
    )

    val dataB = Color(
        name = "red",
        code = "FF0000"
    )

    val dataC = dataA

    println(dataA == dataB)
    println(dataA === dataB)
    println(dataA === dataC)
}
