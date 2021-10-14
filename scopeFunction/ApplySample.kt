package scopeFunction

class ApplySample {
    val fruit = Fruit(createdYear = 2020, name = "apple", color = "red").also {
        println(it.createdYear)
        println(it.name)
        println(it.color)
    }
}