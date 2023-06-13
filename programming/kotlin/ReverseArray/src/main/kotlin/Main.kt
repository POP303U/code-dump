private var array = intArrayOf(1,5,4,2,10,13,41,2)

fun main() {
    println(reverse2(array).toList())
}

fun reverse2(arr: IntArray): IntArray {
    val newArray = arr.clone()
    var index = arr.size - 1
    for (i in arr.indices) {
        newArray[i] = arr[index]
        index--
    }

    var int = arr.size - 1
    arr.forEach {
        newArray[int] = arr[it]
    }

    return newArray

}