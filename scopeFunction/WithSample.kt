package scopeFunction

class WithSample {
    fun main() {
        val fruit = Fruit(createdYear = 2020, name = "apple", color = "red")
        with(fruit) {                  //nullにならないオブジェクトで結果が必要ない場合に使う
            println(this.createdYear)    //this = Fruit
            println(name)             //thisは省略可
            println(color)
        }
    }
}