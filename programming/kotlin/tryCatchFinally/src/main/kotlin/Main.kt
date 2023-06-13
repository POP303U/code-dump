fun main() {
    println(errorHandle("44"))
}

fun errorHandle(str: String): Boolean {
    try {
        str.toInt()
    }
    catch (e: NumberFormatException) {
        return false
    }
    finally {
        println("This will always run")
    }
    return true
}