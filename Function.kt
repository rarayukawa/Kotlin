fun main() {
    fun joinString(message1: String, message2: String): String {
        return "${message1}${message2}"
    }

    println(joinString("文字列", "連結"))

    fun joinString2(message1: String, message2: String) = "${message1}${message2}"
    println(joinString2("文字列", "連結"))

    fun helloWorld(
        language: String,
        version: Double
    ): String {
        return "Hello $language $version"
    }

    val helloWorld = helloWorld(
        language = "Kotlin",
        version = 1.4,
    )

    println(helloWorld)

    foo()
}
