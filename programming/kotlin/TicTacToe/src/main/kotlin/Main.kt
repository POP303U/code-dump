import java.util.*

val board = Array(3) {Array(3) {' '} }

const val player = 'X'
const val computer = 'O'

fun resetBoard(){
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            board[i][j] = ' '
        }
    }
}

fun printBoard(){
    println("""
         ${board[0][0]} | ${board[0][1]} | ${board[0][2]}
        ---|---|---
         ${board[1][0]} | ${board[1][1]} | ${board[1][2]}
        ---|---|---
         ${board[2][0]} | ${board[2][1]} | ${board[2][2]}
    """.trimIndent())
}

fun checkFreeSpaces(): Int {
    var freeSpaces = 9
    for (i in 0 until 3) {
        for (j in 0 until 3) {
            if (board[i][j] != ' ') freeSpaces--
        }
    }
    return freeSpaces
}

fun playerMove(){
    do {
        println("Enter row (1-3):")
        val x: Int = readln().toInt() - 1
        println("Enter column (1-3):")
        val y: Int = readln().toInt() - 1

        if (board[x][y] != ' ') {
            println("Invalid move")
        } else {
            board[x][y] = player
            break
        }
    } while(board[x][y] != ' ')
}

fun computerMove(){
    var x: Int
    var y: Int
    if (checkFreeSpaces() > 0) {
        do {
            x = (0..2).random()
            y = (0..2).random()
        } while (board[x][y] != ' ')

        board[x][y] = computer
    } else {
        printWinner(' ')
    }
}

fun checkWinner(): Char {
    //rows
    for (i in 0 until 3) {
        if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
            return board[i][0]
        }
    }
    // columns
    for (i in 0 until 3) {
        if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
            return board[0][i]
        }
    }
    //diagonals
    if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
        return board[0][0]
    }
    if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
        return board[0][2]
    }

    return ' '
}

fun printWinner(winner: Char){
    when (winner) {
        player -> println("You win")
        computer -> println("Computer wins")
        else -> println("Its a tie")
    }
}

fun main() {
    var winner = ' '
    resetBoard()
    while (winner == ' ' && checkFreeSpaces() != 0) {
        printBoard()

        playerMove()
        winner = checkWinner()
        if (winner != ' ' && checkFreeSpaces() == 0) {
            break
        }

        computerMove()
        winner = checkWinner()
        if (winner != ' ' && checkFreeSpaces() == 0) {
            break
        }
    }
    printBoard()
    printWinner(winner)
    println("Do you want to play again? (y/n)")
    if (readln() == "y") main()
}


object Main {
    private var board = Array(3) { CharArray(3) }
    private var player = 'X'
    private var computer = 'O'
    private var scanner = Scanner(System.`in`)
    private var random = Random()

    private fun resetBoard() {
        for (i in 0..2) {
            for (j in 0..2) {
                board[j][i] = ' '
            }
        }
    }

    private fun printBoard() {
        println(
            """ ${board[0][0]} | ${board[0][1]} | ${board[0][2]}
---|---|---
 ${board[1][0]} | ${board[1][1]} | ${board[1][2]}
---|---|---
 ${board[2][0]} | ${board[2][1]} | ${board[2][2]}
"""
        )
    }

    private fun checkFreeSpaces(): Int {
        var freeSpaces = 9
        var i = 0
        while (i < 3) {
            val j = 0
            while (i < 3) {
                if (board[i][j] != ' ') freeSpaces--
                i++
            }
            i++
        }
        return freeSpaces
    }

    private fun playerMove() {
        var x: Int
        var y: Int
        do {
            println("Enter row (1-3):")
            x = scanner.nextInt() - 1
            println("Enter column (1-3):")
            y = scanner.nextInt() - 1
            if (board[x][y] != ' ') {
                println("Invalid move")
            } else {
                board[x][y] = player
                break
            }
        } while (board[x][y] != ' ')
    }

    private fun computerMove() {
        var x: Int
        var y: Int
        if (checkFreeSpaces() > 0) {
            do {
                x = random.nextInt(0, 2)
                y = random.nextInt(0, 2)
            } while (board[x][y] != ' ')
            board[x][y] = computer
        } else {
            printWinner(' ')
        }
    }

    private fun checkWinner(): Char {
        //rows
        for (i in 0..2) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0]
            }
        }
        //columns
        for (i in 0..2) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i]
            }
        }

        //diagonals
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0]
        }
        return if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            board[0][2]
        } else ' '
    }

    private fun printWinner(winner: Char) {
        when (winner) {
            player -> {
                println("You win")
            }
            computer -> {
                println("Computer wins")
            }
            else -> {
                println("Its a tie")
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var winner = ' '
        resetBoard()
        while (winner == ' ' && checkFreeSpaces() != 0) {
            printBoard()
            playerMove()
            winner = checkWinner()
            if (winner != ' ' && checkFreeSpaces() != 0) {
                break
            }
            computerMove()
            winner = checkWinner()
            if (winner != ' ' && checkFreeSpaces() != 0) {
                break
            }
        }
        printBoard()
        printWinner(winner)
        println("Do you want to play again? (y/n)")
        if (scanner.next() == "y") {
            main(args)
        }
    }
}


