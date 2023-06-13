import java.util.Scanner

fun main() {
    println("How many rows do you want?")
    val rows = readln().toInt()
    println("How many columns do you want?")
    val columns = readln().toInt()
    println("What symbol do you want")
    val char = readln()

    for (i in 1..rows) {
        println()
        for (j in 1..columns) {
            print(char)
        }
    }

    println("How many rows do you want?")
    val rows1 = readln().toInt()
    println("How many columns do you want?")
    val columns1 = readln().toInt()

    val array = Array(rows1) {Array(columns1) {' '} }

    for (i in array.indices - 1) {
        println()
        for (j in array.indices - 1) {
            array[i][j] = ('a'..'z').random()
            print(array[i][j])
        }
    }

}

/**

import java.util.Scanner

fun main() {

val scanner = Scanner(System.`in`)
val num1 = scanner.nextInt()
val num2 = scanner.nextInt()
val operator1 = scanner.next()!!

val result = when (operator1) {
"+" -> "$num1 + $num2 = ${num1 + num2}"
"-" -> "$num1 - $num2 = ${num1 - num2}"
"*" -> "$num1 * $num2 = ${num1 * num2}"
"/" -> "$num1 / $num2 = ${num1 / num2}"
else -> println("no operator found")
}
println(result)
}

 **/