import kotlin.math.sqrt

/**fun main() {
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    println(calculate(num1,num2))
    while (true) {
        var rand = (-10..10).random()
        println(rand)
        Thread.sleep(1000)
    }
}

fun calculate(x: Int, y: Int): Int {
    var result = x + y
    return result
} **/

fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    val total = addNumbers(n1 = 12, num2)
    println("Total = $total")
}

private fun addNumbers(n1: Int = 10, n2: Int = 10): Int {
    return n1 + n2
}
/**private fun sqrtOfRandomNumber() {
    val number = (1..100).random().toDouble()
    var result = sqrt(number)
    println("The square root of the random number is $result")
} **/


