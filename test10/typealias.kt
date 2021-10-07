package test10

fun getMobileList(): MobileList {  //モバイルリストを取得
    return listOf("mobile a", "mobile b", "mobile c")
}

fun getNetWorkNodeSet(): NetworkNodeSet {
    return setOf("node1", "node1", "node1")
}

fun getStorageMap(): StorageMap {
    return mapOf("local storage" to "https://xxx")
}

typealias MobileList = List<String>
typealias NetworkNodeSet = Set<String>
typealias StorageMap = Map<String, String>

fun main() {
    println(getMobileList())
    println(getNetWorkNodeSet())
    println(getStorageMap())
}