var board = Array(3) {Array(3) {' '} }
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
        var x: Int = readln().toInt() - 1
        println("Enter column (1-3):")
        var y: Int = readln().toInt() - 1

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
            x = (1..3).random() - 1
            y = (1..3).random() - 1
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
    if (winner == player) {
        println("You win")
    } else if(winner == computer) {
        println("Computer wins")
    } else {
        println("Its a tie")
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
}