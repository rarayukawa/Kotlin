class User1 constructor()

class User2

class User(age: Int)
class UserVal(val age: Int)
class UserVar(var age: Int)
fun main() {
    val user1 = User1()
    val user2 = User2()

    val user = User(age = 31)
    val userVal = UserVal(age = 31)
    println(userVal.age)

    val userVar = UserVar(age = 31)
    userVar.age = 32
    println(userVar.age)
}