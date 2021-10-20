package scopeFunction

fun main() {
    //レシーバに対し処理を行いレシーバー自信を返す
    val adam = Person("Adam",12, "Tokyo").apply {
        age = 20
        city = "China"
    }
    println(adam)     //Person(name=Adam, age=20, city=China)
}
