package test10

import java.io.File

class Settings {
    var theme: String
    set(value) {
        File("theme.txt").writeText(value)
    }

    get() {
        val file = File("theme.txt")
        return if (file.exists()) file.readText() else ""
    }
}

fun main() {
    val settings = Settings()
    println(settings.theme)  //初回は表示されない
    settings.theme = "red"
    println(settings.theme)
}