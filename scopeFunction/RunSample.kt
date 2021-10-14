package scopeFunction

class RunSample {
    fun main() {
        val apple: String = run {
            "delicious"
        }

        val fruit1 = Fruit(createdYear = 2020, name = "apple", color = "red")
        val fruit2 = fruit1.run {        //この場合は戻り値がないのでfruit2はUnit型になる
            this.createdYear = 2021    //thisは省略可能
            name = "banana"
            color = "yellow"
        }
    }

}