package Collection

fun main() {
    val list = listOf("長野県", "埼玉県", "東京都", "京都府", "大分県", "神奈川県", "北海道")

    //指定した条件に合う初めの要素を返す
    list.find {
        it.contains("県")
    }                      //長野県

    //指定した条件に合う最後の要素を返す
    list.findLast {
        it.contains("県")
    }                        //神奈川県

    val point = listOf(234, 56, 1, 345, 12, 123, 198, 174)
    point.find {
        it > 100          //234
    }
}