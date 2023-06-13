fun main() {
    val arr = arrayOf(10,50,110,90,1,9,200,4,2000)
    val aar = arr.clone()

    for (i in 0 until arr.size - 1) {
        for (j in 0 until arr.size - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    for (i in arr.indices) {
        print("${aar[i]},")
    }
    println("\n")
    for (i in arr.indices) {
        print("${arr[i]},")
    }
    println("\n")
    val chat = bubbleSort(intArrayOf(10,50,1000,20,2000,30,200,4000))
    for (i in chat.indices) {
        print("${chat[i]},")
    }
}

fun bubbleSort(arr: IntArray): IntArray {
    val n = arr.size
    var swapped: Boolean
    do {
        swapped = false
        for (i in 0 until n - 1) {
            if (arr[i] > arr[i + 1]) {
                val temp = arr[i]
                arr[i] = arr[i + 1]
                arr[i + 1] = temp
                swapped = true
            }
        }
    } while (swapped)

    return arr
}
