package scopeFunction

fun main() {
    val fruit = Fruit(createdYear = 2020, name = "apple", color = "red")
    val result = fruit.let {    //インスタンス化されたオブジェクトをローカル変数として扱える
        it.name + it.color      //itで参照化
    }


    Person("Alice", 20, "Japan").let {
        println(it)                 //Person(name=Alice, age=20, city=Japan)
        it.moveTo("London")
        it.incrementAge()
        println(it)                 //Person(name=Alice, age=21, city=London)
    }
}
