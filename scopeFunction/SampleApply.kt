package scopeFunction

class SampleApply {
    fun main() {
        val fruit = Fruit(createdYear = 2020, name = "apple", color = "red")
        println(fruit.createdYear)
        println(fruit.name)
        println(fruit.color)

        Fruit(createdYear = 2021, name = "orange", color = "orange").apply {
            println(this.createdYear)       //変数に入れて参照しなくてもthisで参照可能になる
            println(name)                   //thisは省略可
            println(color)
        }
    }
}