import kotlin.math.sqrt

fun main() {
    var byte = 0b1000_0000
    val a = 0b1010_1110
    val b = 0b1000_0010
    val d = 0b1010_1101
    val e = 0b1110_0111

    //Bitwise manipulation
    val c1 = a and b
    val c2 = a or b
    val c3 = a xor b

    byte = byte shr 3;  println(byte)
    byte = byte shl 5;  println(byte)
    byte = byte ushr 4; println(byte)

    println(Integer.toBinaryString(-1))
    println(Integer.toBinaryString((1 / sqrt(0.0)).toInt()))
    println(1 / sqrt(0.0))

    println(-1 ushr 1)

    println("""
        ${Integer.toBinaryString(a)} ${Integer.toBinaryString(a)} ${Integer.toBinaryString(d)}
        ${Integer.toBinaryString(b)} ${Integer.toBinaryString(b)} ${Integer.toBinaryString(e)}
        ---AND-- ---OR--- ---XOR--
        ${Integer.toBinaryString(c1)} ${Integer.toBinaryString(c2)} ${Integer.toBinaryString(c3)}
        
    """.trimIndent())
}