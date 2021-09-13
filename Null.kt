fun main() {
    var il: Int = 0
    il = null

    var i2: Int? = 0
    i2 = null

    var s: String? = "abc"
    println(s?.length)
    s = null
    println(s?.length)

    var a:Int? = 24
    require(a != null)
    println(a.toString(radix = 2))

    var b:Int? = 24
    check(b != null)
    println(b.toString(radix = 2))
}