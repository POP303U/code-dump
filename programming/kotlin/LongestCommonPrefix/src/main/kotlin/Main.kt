import java.util.*

fun main(){
    println(longestCommonPrefix(arrayOf("flower","flight","flow")))
    println(longestCommonPrefix(arrayOf("flower","flow","flight")))
    println(longestCommonPrefix(arrayOf("","b")))
    println(longestCommonPrefix(arrayOf("flower","flower")))
    println(longestCommonPrefix(arrayOf("flow","flight","flow")))
    println(longestCommonPrefix(arrayOf("","")))
    println(longestCommonPrefix(arrayOf("dog","racecar","car")))
    println(longestCommonPrefix(arrayOf("bar","bad")))
}

fun longestCommonPrefix(strs: Array<String>): String {
    var s1 = strs[0]
    var s2 = strs[strs.size - 1]
    var idx = 0
    for (i in 0 until strs.size - 1) {
        while (idx < s1.length - 1 && idx < s2.length - 1)
        if (s1[i] != s2[i]) continue else break
        return s1.substring(0,i)
    }
    return ""
}

fun longestCommonPrefix2(strs: Array<String>): String {
    // 1. Check for special cases:
    // 1.1 Array with one element, Array with all elements equal
    // 2. Go through first and second element with loop
    // 2.1 Check the first letter of both words
    // 2.2 If not equal break and return ""
    // 2.3 Add the equal letters to a result var
    // 3. Exit
    if (strs.size < 2) return strs[0]

    var result = ""
    for (i in 0 until strs.size - 1 ) {
        if (strs[i] == strs[i + 1]) {
            continue
        }
    }
    return result
}

fun longestCommonPrefix3(strs: Array<String>): String {
    Arrays.sort(strs)
    val s1 = strs[0]
    val s2 = strs[strs.size - 1]
    var idx = 0
    while (idx < s1.length && idx < s2.length) {
        if (s1[idx] == s2[idx]) {
            idx++
        } else {
            break
        }
    }
    return s1.substring(0, idx)
}

fun longestCommonPrefix4(strs: Array<String>): String {
    Arrays.sort(strs)
    var idx = 0
    while (idx < strs[0].length && idx < strs[strs.size - 1].length) {
        if (strs[0][idx]== strs[strs.size - 1][idx]) idx++ else break
    }
    return strs[0].substring(0, idx)
}
