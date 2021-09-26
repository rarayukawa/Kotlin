fun main() {
    val list = listOf(1,2,3)
    println(list)

    val mutableList = mutableListOf(1,2,3)
    mutableList += 4
    mutableList -= 3
    println(mutableList)

    fun varargs(vararg elements: Int) {
        for (i in elements) {
            println(i)
        }
    }

    varargs(1, 2, 3)

    val list2 = listOf(4, 5, 6)
    varargs(1, 2, 3, *list2.toIntArray())

    val set = setOf(1, 2, 3)
    println(set)

    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet += 4
    mutableSet -= 3
    mutableSet += 4
    mutableSet += 5
    println(mutableSet)

    val mutableMap = mutableMapOf("phone" to "111-111-111", "address" to "123")
    println(mutableMap)

    for (entry in mutableMap) {
        println("key:${entry.key} value:${entry.value}")
    }
    println(mutableMap["phone-number"])

    println(listOf(1, 2, 3))
    println(arrayOf(1, 2, 3))

    val array = arrayOf(1, 2, 3)
    array[0] = 0
    for (a in array) {
        println(a)
    }

    val list3 = listOf(1, 2, 3)
    val list4 = listOf(1, 2, 3)
    println(setOf(list3, list4).size)

    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)
    println(setOf(array1, array2).size)

    listOf(1, 2, 3, 4, 5)
        .map { println("map $it"); it * 3}
        .filter { println("filter $it"); it % 2 == 0}
        .take(1)
        .forEach {println("list $it")}

    sequenceOf(1, 2, 3, 4, 5)
        .map {println("map $it"); it * 3}
        .filter {println("filter $it"); it % 2 == 0}
        .take(1)
        .forEach {println("sequence $it")}
}