import java.lang.invoke.ConstantBootstraps.invoke

/**fun main() {
    var num = 1
    while (num <= 20) {
        println("Line $num")
        ++num
    }
}
 **/

fun main() {
    var sum = 0
    var input: String

    println("Instructions:" +
             "\n - Type in any whole number to add" +
             "\n - Press \"0\" to exit")
    do {
        print("Enter a number: ")
        input = readln()
        sum += input.toInt()
    } while (input != "0")

    println("Total = $sum")
}


/**fun main() {
    val col = 11
    val row = 5
    val char = "#"
    var i: Int = 0
    var j: Int = 0

    while (i < row) {
        println()
        ++i
        var j = 0
        while (j < col) {
            print(char)
            ++j
        }
    }
}

**/
