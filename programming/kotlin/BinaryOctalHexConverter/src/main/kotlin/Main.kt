var numberArray = arrayListOf<Int>()
var j: Int = 0

fun main() {
    print("""
        What is the formatting of the first number?:
        1 = Octal
        2 = Binary 
        3 = Hexadecimal
        
    """.trimIndent())
    val conversionType = readln().toInt()
    print("""
        Which numbers do you want to format?
        Press "0" to exit: 
        
        """.trimIndent())
    do  {
        val number = readln().toInt()
        numberArray.add(j, number)
        j++
    } while (number != 0)

    for (i in 0 until numberArray.size - 1) {
        var result: String
        when (conversionType) {
            1 -> result = Integer.toOctalString(numberArray[i])
            2 -> result = Integer.toBinaryString(numberArray[i])
            3 -> result = Integer.toHexString(numberArray[i]).uppercase()
            else -> result = "Invalid formatting!"
        }
        print("$result  ")
    }
}

/**
when (conversionType) {
    1 -> { for (i in 0 until numberArray.size - 1) {
        val result = Integer.toOctalString(numberArray[i])
        print("$result, ")
    }
    }
    2 -> { for (i in 0 until numberArray.size - 1) {
        val result = Integer.toBinaryString(numberArray[i])
        print("$result, ")
    }
    }
    3 -> { for (i in 0 until numberArray.size - 1) {
        val result = Integer.toHexString(numberArray[i])
        print("$result, ")
    }
    }
    else -> println("Invalid formatting")
}
 **/