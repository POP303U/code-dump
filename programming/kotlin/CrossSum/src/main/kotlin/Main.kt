fun main() {
    println(crossSum("a123456789"))
    println(digitSum(3929))
}

fun crossSum(n: String): Int {
    return if (n in "0".."9") {
        return n.sumOf { it - '0' }
    }
    else -1
}

fun digitSum(n: Long): Long {
    return if (n == 0L) 0L else n % 10 + digitSum(n / 10)
}