package test10

fun main() {
    val anonymous = fun(name: String): String {
        return "$name anonymous"
    }  //無名関数の宣言
    println(anonymous("test method"))

    val lambda = { name: String ->
        "&name lambda"
    }    //ラムダ関数の宣言
    println(lambda("test method"))       //ラムダ関数を実行

    fun actionSingleArgument(action:() -> String): String {
        return action()
    }

    val result1 = actionSingleArgument { "action" }
    println(result1)

    //引数が複数の場合
    //最後の引数を関数型にする
    fun actionMultipleArguments(list: List<Int>, action: (Int) -> Int): List<Int> {
        val mutableList = mutableListOf<Int>()

        list.forEach {
            mutableList.add(action(it))
        }
        return mutableList
    }

    val result2 = actionMultipleArguments(listOf(1, 2, 3)) {    //第一引数にListとラムダを利用する
        it * 2
    }
    println(result2)

    val list = listOf(1, 2, 3, 4)
    val mapList = list.map { it * 2 }
    println(mapList)

    val evenList = list.filter { it % 2 == 0 }
    println(evenList)

    val hasEven = list.any { it % 2 == 0 }
    println(hasEven)

    list.mapIndexed { index, element ->    //複数のパラメータを名前付きにする
        println("index: $index element: $element")
    }

    list.mapIndexed { _, element ->
        println("element: $element")
    }
}