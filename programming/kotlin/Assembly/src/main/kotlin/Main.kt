fun main(args: Array<String>) {
    var c = CPU()
    c.LDA(1u)
    c.LDX(5u)
    c.LDY(3u)

}


class CPU {
    var aRegister: UByte = 0u
    var xRegister: UByte = 0u
    var yRegister: UByte = 0u

    var memory = IntArray(0xFFFF)
    fun LDA(num: UByte) { aRegister = num }
    fun LDX(num: UByte) { xRegister = num }
    fun LDY(num: UByte) { yRegister = num }

    fun STA(num: UByte) {  }
    fun STX(num: UByte) {  }
    fun STY(num: UByte) {  }
}