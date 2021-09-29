package scopeFunction

class Book(val name: String) {
    var price = 0
    var author: String? = null
    var pageNumber = 0
}

fun main () {
    val book = Book("リーダブルコード")
    book.price = 827
    book.author = "日本太郎"
    println(book.price)     //827  通常の手順でインスタンスを生成し、プロパティを設定

    //applyを使うと
    val applyBook = Book("リーダブルコード").apply {
        price = 827        //apply関数のラムダ式の中ではインスタンスの表記を省略できる(this)
        author = "日本太郎"
    }
    println(applyBook.author)   //日本太郎

    //alsoを使うと
    val alsoBook = Book("リーダブルコード").also {
        it.price = 827            //インスタンスの表記(it)は省略不可
        it.author = "日本太郎"
    }
    println(alsoBook.author)  //日本太郎
}