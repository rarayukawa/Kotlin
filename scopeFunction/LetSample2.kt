package scopeFunction

class LetSample2 {
    fun main() {
        val fruit = Fruit(createdYear = 2020, name = "apple", color = "red")
        val result = fruit.let {    //インスタンス化されたオブジェクトをローカル変数として扱える
            it.name + it.color      //itで参照化
        }

    }
}