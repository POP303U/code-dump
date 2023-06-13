// ---Notes---
// 1. Take number from the user
// 2. Call "calculateFactorial" function with user input
// 3. Run the recursive function
// -3.1 Check if the value n is 1 and exit recursion if needed
// -3.2 print the current value with the "*" sign: 5*
// -3.3 calculate the next factorial with "n * calculateFactorial(n - 1)"
// -3.4 this will multiply with the next number in the factorial
// -3.5 repeat the steps above till it exits
// 4. If run successful return n and print the value

fun main() {
    /**print("Enter a value to be factorised: ")
    val factorial = readln().toInt()
    val result = calculateFactorial(factorial)
    println(result) **/

    println("How many elements do you want: ")
    val elements = readln().toInt()
    calculateFibonacci(elements)
}

private fun calculateFactorial(n: Int): Int {
    return if (n == 1) {
        println("$n\n")
        println("Recursion has ended")
        n
    } else {
        print("$n*")
        n * calculateFactorial(n - 1)
    }
}

var n3: Double = 0.0
var n2: Double = 1.0
var n1: Double = 0.0
private fun calculateFibonacci(num: Int) {
    repeat(num) {
        n3 = n1 + n2
        n1 = n2
        n2 = n3
        println(n3)
    }
}
