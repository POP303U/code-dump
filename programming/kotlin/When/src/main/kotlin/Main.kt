import java.util.Scanner
val input = Scanner(System.`in`)

fun main() {
    print("Enter the first number: ")
    val a = input.nextInt()
    print("Enter the second number: ")
    val b = input.nextInt()
    print("Enter the operator: (+,-,*,/) ")
    val operator = input.next()

    val result = when (operator) {
        "+" -> "${a+b}"
        "-" -> "${a-b}"
        "*" -> "${a*b}"
        "/" -> "${a/b}"
        else -> "Invalid operator"
    }
    println("$a $operator $b = $result")
    println("Do you want to calculate again? (y/n)")

    if (input.next() == "y") main() else {println("exiting...")}
}



/**fun main() {
val reader = Scanner(System.`in`)

print("Enter a number: ")
val number1 = reader.nextInt()

print("Enter a another number: ")
val number2 = reader.nextInt()

print("Enter an operator: +, -, *, /: ")
val operator = reader.next()!!

val result = when (operator) {
"+" -> "$number1 + $number2 = ${number1 + number2}"
"-" -> "$number1 + $number2 = ${number1 - number2}"
"*" -> "$number1 + $number2 = ${number1 * number2}"
"/" -> "$number1 + $number2 = ${number1 / number2}"
else -> "$operator is not recognised"
}
println(result)
}
 **/

/**when (a) {
in 1..10 -> println("A positive number less than 11")
in 10..100 -> println("A positive number between 10 and 100 (inclusive)")
} **/