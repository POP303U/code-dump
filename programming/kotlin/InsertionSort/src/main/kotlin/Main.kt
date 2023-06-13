fun insertionSort(items:MutableList<Int>):List<Int>{
    if (items.isEmpty() || items.size<2){
        return items
    }
    for (count in 1 until items.count()){
        val item = items[count]
        var i = count
        while (i>0 && item < items[i - 1]){
            items[i] = items[i - 1]
            i -= 1
        }
        items[i] = item
    }
    return items
}

fun insertionsort(arr: IntArray) {
    for (i in 1 until arr.size) {
        val key = arr[i]
        var j = i - 1
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = key
    }
}

fun main() {
    val numbers = mutableListOf(8, 3, 2, 7, 4)
    println(numbers)
    val ordered = insertionSort(numbers)
    println(ordered)

    val arr = intArrayOf(5, 2, 7, 3, 9, 1)
    insertionsort(arr)
    println(arr.contentToString()) // prints "[1, 2, 3, 5, 7, 9]"
}