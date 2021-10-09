package test10

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.EmptyCoroutineContext


fun main(args: Array<String>) {
//    runBlocking {    //CoroutineScopeを作成
//        launch {     //Coroutineを起動
//            println("1")
//            delay(1000L)
//            println("2")
//        }
//        launch {      //Coroutineを起動
//            println("3")
//        }
//    }

//    val scope = CoroutineScope(EmptyCoroutineContext)
//    scope.launch {
//        println("1")
//        delay(1000L)
//        println("2")
//    }
//    scope.launch {
//        println("3")
//    }
//    Thread.sleep(2000L)

//    val scope = CoroutineScope(EmptyCoroutineContext)
//    scope.launch {
//        delay(1000L)
//        println("1")
//    }
//    scope.launch {
//        delay(1000L)
//        println("2")
//    }
//    scope.cancel()
}