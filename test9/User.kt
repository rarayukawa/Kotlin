package test9

class User {
    var name: String = ""
    var age: Int = 0
}

fun isInteger(str: String): Boolean = str != null
fun validAgeMessage(isInteger: Boolean): String = if (isInteger) "valid." else "not valid."

fun main() {
    val user = User().apply {         //オブジェクトに設定する
        name = "Alice"     //User.nameにAlicを設定
        age = 15            //User.ageに15を設定
    }
    println("I am ${user.name}, ${user.age} years old")

    val result = listOf(2, 3).first().let { it * it }    //変数の繰り返しを避けられる
    println(result)
    isInteger("ddddd")
    "10".run(::isInteger).run(::validAgeMessage).run(::println)
}



