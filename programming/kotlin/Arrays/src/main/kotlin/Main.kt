/**fun main() {
    // Arraylist
    val list = arrayListOf("Cat", "Dog", "Bird")

    println("""
        -Insert elements into the arraylist
        -Press "0" to exit                 
    """.trimIndent())

    // Insert elements until "0" is pressed
    do {
        val input = readln()
        list.add(input)
    }  while (input != "0")
    list.removeLast()

    // Array
    val array = arrayOf("Pizza", "Hotdogs", "Spaghetti", "Pepsi", "Dog")

    // Go through the elements in the array
    for (i in array.indices) {
        print("Array element at index $i: ${array[i]} \n")
    }
    print("\n")
    for (i in list.indices) {
        print("Arraylist element at index $i: ${list[i]} \n")
    }

}
**/

fun main() {
    val arr = arrayOf(5,3,1,6,3)
    arr.forEach() {
        var b = it
        var sum: Int =+ b
        println(sum)
    }

}
