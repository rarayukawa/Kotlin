package test10

class ProjectDefault {
    fun p() {
        println("ProjectDefault")
    }
}

public class ProjectPublic {
    public fun p() {
        println("ProjectPublic")
    }
}

internal class ProjectInternal {
    internal fun p() {
        println("ProjectInternal")
    }
}

//protectedはトップレベルで宣言できない
//protected class ProjectProtected {
//    protected fun p() {
//        println("ProjectProtected")
//    }
//}

private class ProjectPrivate {
    private fun p() {
        println("ProjectPrivate")
    }
}

fun main() {
    ProjectDefault().p()
    ProjectPublic().p()
    ProjectInternal().p()
//    ProjectPrivate().p()
//    ProjectProtected().p()
}