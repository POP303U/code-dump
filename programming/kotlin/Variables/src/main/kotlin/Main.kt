import com.sun.jdi.IntegerType

fun main() {
    var userName: String = "Alex"
    userName = "Tim"
    val age: Int = 0xFF
    println("Hello $userName your age is $age")

    val person = Man(12, "Tom")
    person.speak()

    val range = (Double)
    println("NaN: ${range.NaN}")
    println("Negative Infinity: ${range.NEGATIVE_INFINITY}")
    println("Positive Infinity: ${range.POSITIVE_INFINITY}")
    println("Minimum Value: ${range.MIN_VALUE}")
    println("Maximum Value: ${range.MAX_VALUE}")
    println("Byte Size: ${range.SIZE_BYTES}")
    println("Bits Size: ${range.SIZE_BITS}")

    println(Integer.toHexString(age))
    println(Integer.toOctalString(age))
    println(Integer.toBinaryString(age))
    println(Integer.toUnsignedString(age))
}

open class Human(age: Int, name: String) {
    open fun speak() {
        println("I am a Human")
    }
}
class Man(age: Int, name: String): Human(age, name) {
    override fun speak() {
        println("I am a Man")
    }
}
class Woman(age: Int, name: String): Human(age, name) {
    override fun speak() {
        println("I am a Woman")
    }
}