/**
fun main() {
    for (i in 1..5) {
        println(i)
    }

    println("\n---")

    for (i in 5 downTo 1) {
        println(i)
    }

    println("\n---")

    for (i in 0..100 step 10) {
        println("$i ")
    }

    println("\n---")

    for (i in 100 downTo 0 step 10) {
        println("$i ")
    }

    val ints = listOf<Int>(1,2,3,4,5,6,7)
    val languages = listOf<String>("Ruby", "Kotlin", "Python", "Java", "Dart")

    for (i in languages) {
        println(i)
    }

    val text = "Hello World!"

    for (i in text) {
        print("$i ")
    }

    for (i in ints) {
        println("${ints.random()}")
    }
} **/

fun main() {
    print("Enter a value to be factorised: ")
    val num = readln().toLong()
    var factorial: Long = 1

    for (i in 1..num) {
        factorial *= i
    }
    println("Factorial of $num = $factorial")
    
}