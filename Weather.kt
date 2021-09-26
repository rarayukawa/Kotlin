enum class Weather {
    Sunny,
    Cloudy,
    Rainy,
}

fun main() {
    val weather = Weather.Sunny
    when (weather) {
        Weather.Sunny -> { /*sunny*/}
        Weather.Cloudy -> { /*cloudy*/}
        Weather.Rainy -> { /*rainy*/}
    }
    for (i in 1..10) {
        println(i)
    }

    for (i in listOf(1, 2, 3)) {
        println(i)
    }

    loop@ for (a in 1..5) {
        for (b in 1..5) {
            if (a == 2 && b == 5) {
                break@loop
            }
            println("a:$a b:$b")
        }
    }

}