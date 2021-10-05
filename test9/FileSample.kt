package test9
import java.io.File
fun main() {
    val fileName = "src/main/Lesson7-input.txt"
    File(fileName).readLines()
        .map { it.trim { trimString -> trimString <= ' ' } }
        .filter { it.isNotEmpty(); it.startsWith("worldcup", true ) }
}
