fun main() {
    val key = 678
    val arr = arrayOf(155,2,30,4,20,40,5,6,678,7,8,9,77,10,11,45,12,15,14,166,16,63,67)
    println("number: $key found at index: ${linearSearch(arr,key)}")
}

fun linearSearch(arr: Array<Int>, key: Int): Int? {
    var i = 0
    arr.forEach {
        if (it == key) return i else i++
    }
    return null
}

/**
for (i in 0..arr.size) {
if (arr[i] == key) return i
}
return null
 **/