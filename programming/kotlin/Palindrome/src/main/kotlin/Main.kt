fun main() {
    println(isPalindrome1(-1001))
    println(isPalindrome2(219912))
}

fun isPalindrome1(x: Int): Boolean {
    return x.toString() == x.toString().reversed()
}

fun isPalindrome2(x: Int): Boolean {
    return reverseNumber(x) == x
}

fun reverseNumber(number: Int): Int {
    var number = number
    var reverse = 0

    while (number != 0) {
        reverse = reverse * 10 + number % 10
        number /= 10
    }
    return if (reverse < 0) -reverse else reverse
}

/**fun isPalindrome(x: Int): Boolean {
val newX = x.toString()
val n = newX.length -1

for (i in 0 until n / 2) {
if (newX.length == 1) return true
if (newX[i] == newX[n - i]) {
return true
}
}
return false
}
 **/
