fun main() {
    println(romanToInt("MCMXCIV"))
    println(romanToInt2("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    var result = 0
    for (i in s.indices) {
        when (s[i]) {
            'I' -> result += 1
            'V' -> result += 5
            'X' -> result += 10
            'L' -> result += 50
            'C' -> result += 100
            'D' -> result += 500
            'M' -> result += 1000
        }
    }
    for (i in 0 until s.length -1) {
        if (s[i] == 'I' && s[i + 1] == 'V' || s[i] == 'I' && s[i + 1] == 'X') result -= 2
        if (s[i] == 'X' && s[i + 1] == 'L' || s[i] == 'X' && s[i + 1] == 'C') result -= 20
        if (s[i] == 'C' && s[i + 1] == 'D' || s[i] == 'C' && s[i + 1] == 'M') result -= 200
    }
    return result
}

fun romanToInt2(s: String): Int {
    var ans = 0
    var num = 0
    for (i in s.length - 1 downTo 0) {
        when (s[i]) {
            'I' -> num = 1
            'V' -> num = 5
            'X' -> num = 10
            'L' -> num = 50
            'C' -> num = 100
            'D' -> num = 500
            'M' -> num = 1000
        }
        if (4 * num < ans) ans -= num else ans += num
    }
    return ans
}