fun main() {
    fun joinString(message1: String, message2: String): String {
        return "${message1}${message2}"
    }

    println(joinString("文字列", "連結"))
    println(joinString("もるる", "んてんて"))

    fun joinString2(message1: String, message2: String) = "${message1}${message2}"
    println(joinString2("www", "eee"))

    fun helloWorld(language: String, version: Double): String {
        return "Hello $language $version"
    }

    val helloWorld = helloWorld(language = "Kotlin", version = 1.4,)
    println(helloWorld)
    val rara = helloWorld(language = "んてんて", version = 2020.9,)
    println(rara)

    fun helloWorld2(language: String, version: Double = 1.4): String {
        return "Hello $language $version"
    }

    val helloWorld2 = helloWorld2(language = "Kotlin",)
    println(helloWorld2)
    val yukawa = helloWorld2(language = "んてんて",)
    println(yukawa)
    val yu = helloWorld2(language = "んて", version = 2.3,)
    println(yu)

    foo()
}

inline fun bar() {
    println("bar start")
    println("bar end")
}

fun foo() {
    println("foo start")
    bar()
    println("foo end")
}