package test10
val String.size: Int   //文字列の長さを取得するプロパティ
    get() {
        return this.length   //getterは利用できるがsetterは利用できない
    }
fun String.p() {    //Stringの拡張関数　Stringはレシーバタイプ
    println(this)    //thisはレシーバタイプ
}

fun String.get(index: Int): Char {    //Stringのget(index: Int)と同名の拡張関数を定義する
    return 'c'
}

fun String.capitalize(): String {
    return "test"
}

fun String?.isNotNull(): Boolean {   //文字列がNullでないことを確認する拡張関数
    return this != null
}
fun main() {
    val text: String? = "Kotlin"
    "test".p()
    println("test".get(0))   //メンバー関数が優先されてtが表示される
    println("test".capitalize())   //testが出力
    println("test".size)
    if (text.isNotNull()) {
        println(text)   //Kotlin
    }

}