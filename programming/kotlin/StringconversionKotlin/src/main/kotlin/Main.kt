fun main() {
    println(isNum("Hi!"))
    println(isNum("123"))
}

fun isNum(numStr: String): Boolean {
    try   {var d = numStr.toDouble()}
    catch (e: NumberFormatException) {return false}
    return true
}