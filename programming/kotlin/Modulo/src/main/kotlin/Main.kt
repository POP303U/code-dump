/**fun main() {
    val numbers = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25)
    for (i in numbers.iterator())
             if (i % 15 == 0) println("FizzBuzz")
        else if (i % 5 == 0)  println("Buzz")
        else if (i % 3 == 0)  println("Fizz")
        else                  println(i)
}
**/
/**fun main() {
    val arr = (1..100).toList().toTypedArray()
    for (i in arr.indices) {
        var result = ""
        if (arr[i] % 3 == 0)  result += "Fizz"
        if (arr[i] % 5 == 0)  result += "Buzz"
        if (result != "") println(result) else println(i + 1)
    }
}
**/
fun fizzBuzz(number: Int): String =
    when {
        number % 15 == 0 -> "FizzBuzz"
        number % 3 == 0 -> "Fizz"
        number % 5 == 0 -> "Buzz"
        else -> number.toString()
    }

fun fizzBuzz2(): List<String> =
    (1..100).map { number ->
        when {
            number % 15 == 0 -> "FizzBuzz"
            number % 3 == 0 -> "Fizz"
            number % 5 == 0 -> "Buzz"
            else -> number.toString()
        }
    }

fun fizzBuzz3() = (1..100).map {
        n -> when {
            n % 15 == 0 -> "FizzBuzz"
            n % 3 == 0 -> "Fizz"
            n % 5 == 0 -> "Buzz";else -> n.toString()
        }
    }

fun main() {
    //(1..100).map(::fizzBuzz).forEach(::println)
    //fizzBuzz2().forEach(::println)
    fizzBuzz3().forEach(::println)
}
/**
fun main() {
    for (i in 1..100){
        if ( i % 15 == 0) {
            println("FizzBuzz")}
        else if(i % 5 == 0) {
            println("Buzz")}
        else if(i % 3 == 0){
            println("Fizz")}
        else {
            println(i)
        }

    }
}
 **/