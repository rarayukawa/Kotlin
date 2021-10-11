package test10.Conroutine

import kotlinx.coroutines.*

fun main(args: Array<String>) {
    println("Start")

//    launch {
//        delay(1000)
//        println("Hello")
//    }

    Thread.sleep(2000)
    println("Stop")
}