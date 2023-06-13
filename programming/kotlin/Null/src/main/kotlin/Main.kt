lateinit var size: String
lateinit var length: String

fun main() {
    var name: String? = null
    println(name ?: "Invalid name")

    name = "Timmy"
    println(name ?: "Invalid name")


}