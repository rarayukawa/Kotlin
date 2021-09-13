fun main() {
    println(listOf(1, 2, 3))
    println(arrayOf(1, 2, 3))

    val array = arrayOf(1, 2, 3)
    array[0] = 0
    for (a in array) {
        println(a)
    }

    val list1 = listOf(1, 2, 3)
    val list2 = listOf(1, 2, 3)
    println(setOf(list1, list2).size)

    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)

    println(setOf(array1, array2).size)

    listOf(1, 2, 3, 4, 5,)
        .map { println("map $it"); it * 3 }
        .filter { println("filter $it"); it % 2 == 0}
        .take(1)
        .forEach { println("list $it")}

    sequenceOf(1, 2, 3, 4, 5,)
        .map { println("map $it"); it * 3 }
        .filter { println("filter $it"); it % 2 == 0 }
        .take(1)
        .forEach { println("sequence $it") }
}