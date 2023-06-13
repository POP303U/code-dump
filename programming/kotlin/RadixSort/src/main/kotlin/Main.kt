fun radixSort(arr: IntArray) {
    // Find the maximum number to know the number of digits
    val max = arr.maxOrNull() ?: return

    // Do counting sort for every digit
    var exp = 1
    while (max / exp > 0) {
        countingSort(arr, exp)
        exp *= 10
    }
}

fun countingSort(arr: IntArray, exp: Int) {
    val n = arr.size
    val output = IntArray(n)
    val count = IntArray(10)

    // Store count of occurrences in count[]
    for (i in 0 until n) {
        val index = arr[i] / exp % 10
        count[index]++
    }

    // Change count[i] so that count[i] now contains
    // actual position of this digit in output[]
    for (i in 1 until 10) {
        count[i] += count[i - 1]
    }

    // Build the output array
    for (i in n - 1 downTo 0) {
        val index = arr[i] / exp % 10
        output[count[index] - 1] = arr[i]
        count[index]--
    }

    // Copy the output array to arr[], so that arr[] now
    // contains sorted numbers according to current digit
    for (i in 0 until n) {
        arr[i] = output[i]
    }
}

fun main() {
    val arr = intArrayOf(170, 45, 75, 90, 802, 24, 2, 66, 1, 6, 10, 13, 90, 14)
    radixSort(arr)
    println("Sorted array: ${arr.contentToString()}")
    println(bubbleSort(arr).toList())
}

fun bubbleSort(arr: IntArray): IntArray {
    for (i in 0 until arr.size - 1) {
        for (j in 0 until arr.size - 1) {
            if (arr[i] < arr[i + 1]) {
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
            }
        }
    }
    return arr
}
