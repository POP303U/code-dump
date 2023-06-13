var diceRolls = arrayOf(0,0,0,0,0,0)

fun main() {
    print("How often do you want to roll the dice?: ")
    for (i in 0..readln().toInt()) {
        when ((1..6).random()) {
            1 -> diceRolls[0] += 1
            2 -> diceRolls[1] += 1
            3 -> diceRolls[2] += 1
            4 -> diceRolls[3] += 1
            5 -> diceRolls[4] += 1
            6 -> diceRolls[5] += 1
        }
    }
    println(""" 
        The values are:
        1: ${diceRolls[0]}
        2: ${diceRolls[1]}
        3: ${diceRolls[2]}
        4: ${diceRolls[3]}
        5: ${diceRolls[4]} 
        6: ${diceRolls[5]}
    """.trimIndent())
}