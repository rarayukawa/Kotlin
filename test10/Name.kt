package test10

//data class Name(var name: String)
//
//fun main() {
//    val yukawa = Color(name = "rara")
//
//    val name = yukawa.apply {
//        name = "kitahara"
//    }
//        .name.capitalize()  //先頭文字を大文字
//
//    println(name)
//}

data class Name(var name: String)

fun main() {
    val yukawa = Color(name = "rara")

    val name = yukawa.let {
        it.name = "kitahara"
        it              //ラムダの実行結果として最後のitが返却される
    }
        .name.capitalize()
    println(name)
}