fun binarySearch(arr: IntArray, key: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        when {
            arr[mid] == key -> return mid
            arr[mid] < key -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return -1
}

fun main() {
    for (i in 1 until 100) {
        println(10 % i)
    }
    val arr = intArrayOf(1,3,5,7,9,11,13,15)
    val key = 5

    val index = binarySearch(arr,key)
    if (index != 1) {
        println("$key found at index $index")
    } else {
        println("$key not found")
    }

    println(search(intArrayOf(1,2,3,4,5,6,7),4))
}

fun search(arr: IntArray,key: Int): Int {
    var left = 0
    var right = arr.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2
        when {
            arr[mid] == key -> return mid
            arr[mid] < key -> left = mid + 1
            arr[mid] > key -> right = mid - 1
        }
    }
    return -1
}