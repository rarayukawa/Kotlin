fun main() {
    val map = mapOf("phone" to "111-111-111", "address" to "123")
    println(map)

    val mutableMap = mutableMapOf("phone" to "111-111-111", "address" to "123")
    mutableMap["address"] = "1234"
    println(mutableMap)

    for (entry in map) {
        println("key:${entry.key} value:${entry.value}")
    }
    println(map["phone-number"])
}