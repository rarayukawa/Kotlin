fun main() {
    val list = listOf(1, 2, 3,)
    println(list)
    list += 4
    list -= 3

    val mutableList = mutableList(1, 2, 3,)
    mutableList += 4
    mutableList -= 3
    println(mutableList)
}