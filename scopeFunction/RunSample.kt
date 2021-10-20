package scopeFunction

fun main() {
    val point = 10
    val result = point.run {
        this * this   //thisで参照可
    }
    println(result)     //100

    val nullSample = null
    //?.でnullじゃなければ処理を実行
    nullSample?.run {
        println("nullじゃないよ")     //(何も出力されない)
    }
    //?:でnullなら処理を実行
    nullSample?:run {
        println("nullだよ")    //nullだよ
    }
}
