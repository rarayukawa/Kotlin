package test10
fun handle(state: HttoState) {
    when(state) {
        is HttoState.Success -> {
            state.code
        }
        is HttoState.Failure -> {
            state.code
            state.error
        }
    }
}
sealed class HttoState {
    data class Success(val code: Int): HttoState()

    data class Failure(val code: Int, val error: String): HttoState()
}

fun main() {
    handle(HttoState.Success(code = 200))
}
