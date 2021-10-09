package test10

suspend fun main() {
    prepareCakes()
}

suspend fun prepareCakes() {
    cookCakes()
    buyCakes()
}

suspend fun cookCakes() {
    println("cook cakes")
}

suspend fun buyCakes() {
    println("buy cakes")
}