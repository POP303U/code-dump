fun main() {
    println("Enter a number")
    for (i in 1..100) {
        val result = i.isPrime()
        println("$i: $result")
    }
    for (i in 1000 downTo 100) {
        println("${i.reverseInt()}")
    }
}

fun Int.isPrime(): Boolean {
    for (i in 2 until this - 1)
        if (this % i == 0)
            return false
    return true
}

fun Int.reverseInt(): Int {
    return this.toString().reversed().toInt()
}

fun Int.isPalindrome(): Boolean {
    return this.toString() == this.toString().reversed()
}