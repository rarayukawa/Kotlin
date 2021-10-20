package Collection

fun main() {
    val list = listOf(1, 3, 5, 2, 4, 7, 6)

    //昇順に並び替える
    list.sorted()   //1, 2, 3, 4, 5, 6, 7

    //降順に並び替える
    list.sortedDescending()    //[7, 6, 5, 4, 3, 2, 1]

    val japan = listOf("長野県", "埼玉県", "東京都", "京都府", "大分県", "神奈川県", "北海道")
    //指定された関数内せ返される結果を元に並び替える
    japan.sortedBy {
        it.length
    }                   //[長野県, 埼玉県, 東京都, 京都府, 大分県, 北海道, 神奈川県]

    val point = listOf(234, 56, 1, 345, 12, 123, 198, 174)
    point.sorted()              //[1, 12, 56, 123, 174, 198, 234, 345]
    point.sortedDescending()     //[345, 234, 198, 174, 123, 56, 12, 1]
}