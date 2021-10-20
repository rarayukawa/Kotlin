package Collection

fun main() {
    val list = listOf("長野県", "埼玉県", "東京都", "京都府", "大分県", "神奈川県", "北海道")

    //指定した条件にあう要素のみのlistを返す
    list.filter {
        it.contains("県")
    }            //[長野県, 埼玉県, 大分県, 神奈川県]

    //条件に合わない要素のみのlistを返す
    list.filterNot {
        it.contains("県")
    }               //[東京都, 京都府, 北海道]

    //値のフィルタリングを行う
    listOf(1, 2, 3, 4, 5).filter {
        it > 2        //it = list
    }      //[3, 4, 5]

    //nullを除外したlistを返す
    listOf(1, 2, null, 3, null, 4, 5).filterNotNull()   //[1, 2, 3, 4, 5]

    val name = listOf("alice", "bob", "cline", "dec", "elmo", "fayer")
    //さまざまな条件で要素を絞る
    name.filter {
        it.contains("e")           //[alice, cline, dec, elmo, fayer]
        it.length > 4                     //[alice, cline, fayer]
    }
}