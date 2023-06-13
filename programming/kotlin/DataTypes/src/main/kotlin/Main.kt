import java.util.LinkedList

const val byteNumber:  Byte  = -128
const val uByteNumber: UByte = 255u
//Byte 8 bits   | -128 to 127
//Unsigned byte |   0  to 255

const val shortNumber:  Short  = -32768
const val uShortNumber: UShort = 65535u
//Short 16 bits  | -32768 to 32767
//Unsigned Short |    0   to 65535

const val intNumber:  Int  = -2_147_483_648
const val uIntNumber: UInt = 4_294_967_295u
//Int 32 bits  | -2147483647 to 2147483648
//Unsigned Int |      0      to 4294967295

const val longNumber:  Long  = -9_223_372_036_854_775_807
const val uLongNumber: ULong = 18_446_744_073_709_551_615u
//Long 64 bits  | -9223372036854775807 to 9223372036854775807
//Unsigned Long |           0          to 18446744073709551615

const val floatNumber:  Float  = 3.402_823_5E38F
const val doubleNumber: Double = 1.797_693_134_862_315_7E308
//Float  32 bits | 4.9E-324 to     3.402_823_5E38F
//Double 64 bits | 4.9E-324 to 1.7976931348623157E308

val arr:       Array<Int>               = arrayOf(1,2,3,4,5)
val arrList:   ArrayList<Int>           = arrayListOf(1,2,3,4,5)
val linList:   LinkedList<Int>          = LinkedList(listOf(1,2,3,4,5))
val deque:     ArrayDeque<Int>          = ArrayDeque(listOf(1,2,3,4,5))
val muSet:     MutableSet<Int>          = mutableSetOf(1,2,3,4,5)
val imSet:     Set<Int>                 = setOf(1,2,3,4,5)
val muMap:     MutableMap<String, Int>  = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
val imMap:     Map<String, Int>         = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
val hashMap:   HashMap<String,Int>      = hashMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
val hashSet:   HashSet<Int>             = hashSetOf(1,2,3,4,5)

val byteArr:   ByteArray                = byteArrayOf(-128,127)
val shortArr:  ShortArray               = shortArrayOf(-32768,32767)
val intArr:    IntArray                 = intArrayOf(-2147483648,2147483647)
val longArr:   LongArray                = longArrayOf(-9223372036854775807,9223372036854775807)
val floatArr:  FloatArray               = floatArrayOf(3.4028235E-38F,3.4028235E38F)
val doubleArr: DoubleArray              = doubleArrayOf(4.9E-324,1.7976931348623157E308)

//Array      | Fixed size of elements
//Arraylist  | Dynamic sized array, able to add elements to the front
//Arraydeque | Double ended queue, able to add elements on both sides

const val floats:    Float   = 1.03145f
const val longs:     Long    = 1234_5678_9012_3456L
const val hexBytes:  UShort  = 0xFFFFu
const val bytes:     Long    = 0b11010010_01101001_10010100_10010010
//Special type inference

const val boolean: Boolean = true
const val char:    Char    = '?'
const val string:  String  = "This is a sentence."
//Boolean 8 bits      | true or false
//Char 16 bits        | UTF-16 code unit
//String / Char Array | Array of Chars

fun main() {
    println("""
        Simple data types:
        Byte: $byteNumber
        Unsigned Byte: $uByteNumber
        Short: $shortNumber
        Unsigned Short: $uShortNumber
        Int: $intNumber
        Unsigned Int: $uIntNumber
        Long: $longNumber
        Unsigned Long: $uLongNumber
        Float: $floatNumber
        Double: $doubleNumber
        Boolean: $boolean
        Char: $char
        String: $string
        
        Complex data types:
        Array: $arr
        Arraylist: $arrList
        Arraydeque: $deque
        Linkedlist: $linList
        Immutable Set: $imSet
        Mutable Set: $muSet
        Immutable Map: $imMap
        Mutable Map: $muMap
        Hashmap: $hashMap
        Hashset: $hashSet
        
        Specific type inference:
        Binary: 0b10010011_10110101_10110101_10110111
        Hexbytes: 0xFE_6D_2A_22
        Floats: 1.032344F
        Longs: 1234_5678_9012_3456L
        
    """.trimIndent())
}