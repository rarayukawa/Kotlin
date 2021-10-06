package test10
//デフォルトのジェネリクスなので不変
data class PairInvariant<A, B>(
    val first: A,
    val second: B
)
//outを利用しているので共変
data class PairCovariant<out A, out B>(
    val first: A,
    val second: B
)

//inを利用しているので反変henn
data class PairContravariant<in A, in B>(
    //val宣言によって共変として認識される privateにすると反変に認識される
    private val first: A,
    private val second: B
)


fun main() {

}