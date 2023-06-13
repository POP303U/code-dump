/**fun main() {
    val number = (-10..10).random()
    println("Random number = $number")

    val result = if (number > 0) {
        "Positive number"
    } else if (number == 0) {
        "Number is 0"
    } else {
        "Negative Number"
    }

    println("Result = $result")
}


fun main() {
    val a = 176
    val b = 12

    val largestNumber = if (a > b) {
        println("a is larger than b")
        a
    } else {
        println("b is larger than a")
        b
    }
    println("Largest number = $largestNumber")
}


fun main() {

    val n1 = 1
    val n2 = 100
    val n3 = 200

    val max = if (n1 > n2) {
        if (n1 > n3) {
            n1
        } else {
            n3
        }
    } else {
        if (n2 > n3) {
            n2
        } else {
            n3
        }
    }
    println("Max number = $max")
}

**/

fun main() {

    val a = 12
    val b = 15

    val max = if (a > b) a else b
    println(max)
}
