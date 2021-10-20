package Collection

fun main() {
    val list = listOf("長野県", "埼玉県", "東京都", "京都府", "大分県", "神奈川県", "北海道")

    //各要素の一つ一つに操作できる
    list.forEach {
        print("$it, ")       //長野県, 埼玉県, 東京都, 京都府, 大分県, 神奈川県, 北海道,
    }

    val point = listOf(12, 34, 56, 67, 78, 89)
    point.forEach {
        if (it % 2 == 0) {
            print("偶数")
        } else {
            print("奇数")
        }
    }                      //偶数偶数偶数奇数偶数奇数
}