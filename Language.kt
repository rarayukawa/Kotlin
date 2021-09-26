class Language {
    val lang: String
    get() = "kotlin"

    var version: Double = 1.4
    get() {
        println("Get value=$field")
        return field
    }
    set(value) {
        field = value
        println("Set value=$value")
    }
}

fun main() {
    val language = Language()
    println(language.lang)
    println(language.version)
    language.version = 1.5
    println(language.version)
}