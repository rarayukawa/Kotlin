package test10

import java.io.Serializable

public data class Pair<out A, out B> (public val first: A, public val second: B) : Serializable {
    public override fun toString(): String = "($first, $second)"
}

public data class Triple<out A, out B, out C>(public val first: A, public val second: B, public val third: C) : Serializable {
    public override fun toString(): String = "($first, $second, $third)"
}
fun main() {
//    val (a, b) = Pair(1, 2)
//    println(a)
//    println(b)
//    val(a, b, c) = Triple(1, 2, 3)
//    println(a)
//    println(b)
//    println(c)
}