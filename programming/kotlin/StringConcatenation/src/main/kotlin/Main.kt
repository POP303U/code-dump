import java.util.*

fun main() {
    println(substring("substrings are cool"))
    println(findMatchingPrefix(arrayOf("flower","flight","flow")))
}

fun substring(str: String): String {
    for (i in 0 until str.length - 1) {
        if (str[i] == str[i + 1]) return str.substring(i,i+2)
    }
    return ""
}

fun splitString(str: String): String {
    return ""
}
fun findMatchingPrefix(strs: Array<String>): String {
    Arrays.sort(strs)
    val s1 = strs[0]
    val s2 = strs[strs.size - 1]
    var x = 0

    while (x < s1.length && x < s2.length) {
        if (s1[x] == s2[x]) x++ else break
    }
    return s1.substring(0,x)
}