package Collection

fun main() {
    //要素に対して操作を行い、結果に変えたlistを返します。

    //各要素を２倍する
    val list = listOf(1, 2, 3, 4, 5)
    list.map {
        it * 2     //[2, 4, 6, 8, 10]
    }

    //要素が2より大きければ2倍、それ以外はnullにする
    list.map {
        if (it > 2) {
            it * 2
        } else {
            null
        }
    }              //[null, null, 6, 8, 10]

    //nullを省き、それ以外をmapする
    list.mapNotNull {
        if (it > 2) {
            it * 2
        } else {
            null
        }
    }               //[6, 8, 10]

    val name = listOf("鮎川", "井川", "卯村", "絵村", "小川")
    name.map {
        it + "様"
    }                     //[鮎川様, 井川様, 卯村様, 絵村様, 小川様]
}