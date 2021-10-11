package test10
import kotlinx.coroutines.*

//suspend fun main() {
//    prepareCakes()
//}
//
//suspend fun prepareCakes() = coroutineScope {
//    launch {
//        cookCakes()
//    }
//    buyCakes()
//}
//
//suspend fun cookCakes() {
//    println("cook cakes")
//}
//
//suspend fun buyCakes() {
//    println("buy cakes")
//}

//fun main() = runBlocking {
//    wasteTime()
//    println("main")
//}
//
//suspend fun wasteTime() {
//    repeat(times = 10) {
//        delay(1000)
//    }
//    println("wasteTime")
//}

fun main() = runBlocking {
    println(Thread.currentThread().name)

    launch(Dispatchers.IO) {
        println(Thread.currentThread().name)
        wasteTime()
    }

    println(Thread.currentThread().name)
}

suspend fun wasteTime() {
    repeat(times = 10) {
        delay(1000)
    }
}