fun main() {
    val max = getMax(1,2,3,4,5)
    println(max)
}

fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}