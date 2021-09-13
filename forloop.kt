fun gcd(a: Int, b: Int): Int {
    val x = max(a, b)
    val y = min(a, b)
    return if (y == 0) x else gcd(y, x % y)
}
