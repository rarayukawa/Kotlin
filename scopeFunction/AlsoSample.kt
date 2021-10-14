package scopeFunction

class AlsoSample {
    fun main() {
        val fruit = Fruit(createdYear = 2020, name = "apple", color = "red").also {
            it.createdYear = 2021
            it.name = "orange"
            it.color = "orange"
        }
        println(fruit)
    }
}