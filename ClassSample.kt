class User(age: Int)
class UserVal(val age: Int)
class UserVar(var age: Int)

fun main() {
    val user = User(age = 31)

    val userVal = UserVal(age = 31)
    println(userVal.age)

    val userVar = UserVar(age = 31)
    userVar.age = 32
    println(userVar.age)
}
