package scopeFunction

data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) {
        city = newCity
    }
    fun incrementAge() {
        age++
    }
}

fun main() {

}