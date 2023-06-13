var ranks = arrayListOf<String>()
var result = 0

fun main() {
    println("""
        Enter your ranks 
        D,C,B,A,S,P
        Press -1 to exit:
    """.trimIndent())

    do {
        val input = readln()
        ranks.add(input)
    } while (input != "-1")

    ranks.remove("-1")

    for (i in ranks.indices) {
        when (ranks[i]) {
            "P" -> result += 1
            "S" -> result += 2
            "A" -> result += 3
            "B" -> result += 4
            "C" -> result += 5
            "D" -> result += 6
        }
    }

    println(ranks)
    println(ranks.size)
    println(result)

    val result2 = when(result / ranks.size) {
        in 1..1 -> "P"
        in 2..2 -> "S"
        in 3..3 -> "A"
        in 4..4 -> "B"
        in 5..5-> "C"
        else -> "D"
    }

    println(result / ranks.size)
    println("Your rank is: $result2")
    main()
}