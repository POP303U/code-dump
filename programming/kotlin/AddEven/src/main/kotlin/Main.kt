fun main() {
    val numbers = setOf(1,2,3,4,5,6,7,8,9,10)
    val num = 2
    
    println(numbers.map { it * 3 })
    println(numbers.filter { it % 3 == 0}.sum())

    println(num.square())
    println(num.cubic())
    println(num.quadratic())

    println(isEven(10))
    println(isEven(1))

    println(addEven(0,5))

    println(arraySum(intArrayOf(1,2,3,4,5)))

    println(addChar("Hello World!","🔥"))
    println(addArray(listOf("C++","Haskell","Rust","Kotlin"),"🔥"))

    println(listOf(2,5,1).quickSort()) // [1,2,5]
    println(bubbleSort(arrayOf(1,5,2,4,9,8,3)).toList())
}

fun addEven(bottom: Int, top: Int) = (bottom..top).filter { it % 2 == 0 }.sum()
fun arraySum(array: IntArray) = array.sum()
fun isEven(num: Int) = num % 2 == 0

fun Int.square()    = this * this
fun Int.cubic()     = this.square() * this
fun Int.quadratic() = this.cubic() * this

fun addChar(str: String, prx: String): String {
    return "$str$prx"
}
fun addArray(_lst: List<String>, prx: String): List<String> {
    var lst = _lst.toMutableList()
    for (i in lst.indices) {
        lst[i] = addChar(lst[i],"🔥")
    }
    return lst
}

fun bubbleSort(arr: Array<Int>): Array<Int> {
    val n = arr.size
    return (0 until n - 1).flatMap { i ->
        (0 until n - i - 1).filter { j ->
            arr[j] > arr[j + 1]
        }.map { j -> val temp =
            arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = temp
            arr
        }
    }.lastOrNull() ?: arr
}

fun <T : Comparable<T>> List<T>.quickSort(): List<T> =
    if (size < 2) this
    else {
        val pivot = first()
        val (smaller, greater) = drop(1).partition { it <= pivot}
        smaller.quickSort() + pivot + greater.quickSort()
    }