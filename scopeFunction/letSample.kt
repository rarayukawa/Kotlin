package scopeFunction

fun main() {
    val book = Book("リーダブルコード")
    book.author?.let {     //nullチェック
        println("筆者:$it")  //ラムダ式の中はnullでないことがわかっているのでレシーバをnull非許容型として扱える
    }?:println("筆者は未設定です")

    val s : String? = null
    s?.let {                //セーフコールの設定も可
        println(s)
    }

    val testList = mutableListOf<String?>("Baseball", "Soccer", "Golf")
    testList.let {
        for(item in it)
            println("testList[$item]")     //Listの要素を出力するのも少ない記述で実装できる
    }


    val runBook = Book("リーダブルコード")
    runBook.author = "日本太郎"
    val author = runBook.author?.run {
        "筆者:$this"
    }?:"筆者は未設定です"    //ラムダ式の結果を戻り値とする
    println(author)

    val cake = with("strawberry cake") {
        this.uppercase()
    }
    println(cake)   //STRAWBERRY CAKE   戻り値はラムダ式の結果
}