fun main() {
    println(addArray(listOf("C++","Hello"),"🔥"))
}

fun Int.square() = this * this
fun Int.cubic() = this.square() * this
fun Int.quadratic() = this.cubic() * this

fun addEven(bottom: Int, top: Int) = (bottom..top).filter { it % 2 == 0 }.sum()
fun IntArray.arraySum() = this.sum()
fun Int.isEven() = this % 2 == 0

fun addChar(str: String, prx: String): String { return "$str$prx" }

fun addArray(_lst: List<String>, prx: String): List<String> {
    val lst = _lst.toMutableList()
    for (i in lst.indices) {
        lst[i] = addChar(lst[i],"🔥")
    }
    return lst
}

fun Array<Int>.bubbleSort(): Array<Int> {
    return (0 until this.size - 1).flatMap { i ->
        (0 until this.size - i - 1).filter { j ->
            this[j] > this[j + 1]
        }.map { j -> val temp =
            this[j]
            this[j] = this[j + 1]
            this[j + 1] = temp
            this
        }
    }.lastOrNull() ?: this
}

fun <T : Comparable<T>> List<T>.quickSort(): List<T> =
    if (size < 2) this
    else {
        val pivot = first()
        val (smaller, greater) = drop(1).partition { it <= pivot}
        smaller.quickSort() + pivot + greater.quickSort()
    }