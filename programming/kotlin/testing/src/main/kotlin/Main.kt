import java.util.*
import kotlin.time.*
import kotlin.system.*

class TicTacToeGame {
    private val board = arrayOf(
        arrayOf(" ", " ", " "),
        arrayOf(" ", " ", " "),
        arrayOf(" ", " ", " ")
    )

    var currentPlayer = "X"

    fun play(row: Int, col: Int): String {
        if (board[row][col] != " ") {
            return "Invalid move"
        }

        board[row][col] = currentPlayer

        if (hasWon()) {
            return "$currentPlayer wins!"
        }

        if (isBoardFull()) {
            return "Tie game"
        }

        currentPlayer = if (currentPlayer == "X") "O" else "X"

        return "Valid move"
    }

    private fun hasWon(): Boolean {
        // Check rows
        for (i in 0..2) {
            if (board[i][0] != " " && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true
            }
        }

        // Check columns
        for (j in 0..2) {
            if (board[0][j] != " " && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true
            }
        }

        // Check diagonals
        if (board[0][0] != " " && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true
        }

        if (board[0][2] != " " && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true
        }

        return false
    }

    private fun isBoardFull(): Boolean {
        for (i in 0..2) {
            for (j in 0..2) {
                if (board[i][j] == " ") {
                    return false
                }
            }
        }

        return true
    }

    fun printBoard() {
        for (i in 0..2) {
            for (j in 0..2) {
                print("${board[i][j]} ")
            }
            println()
        }
    }
}

/**fun main() {
    val game = TicTacToeGame()

    game.printBoard()

    while (true) {
        print("${game.currentPlayer}'s turn. Enter row and column: ")
        val row = readlnOrNull()?.toIntOrNull()
        val col = readlnOrNull()?.toIntOrNull()

        if (row == null || col == null || row < 0 || row > 2 || col < 0 || col > 2) {
            println("Invalid input")
            continue
        }

        val result = game.play(row, col)
        println(result)

        game.printBoard()

        if (result.startsWith("Invalid") || result.startsWith("X wins!") || result.startsWith("O wins!")) {
            break
        }
    }
}

fun main() {
    val words = listOf("apple", "banana", "orange", "pear", "grape")
    val word = words.random()
    val letters = word.toSet()
    var correctGuesses = mutableSetOf<Char>()
    var incorrectGuesses = mutableSetOf<Char>()

    while (true) {
        print("Word: ")
        word.forEach { char ->
            if (correctGuesses.contains(char)) {
                print("$char ")
            } else {
                print("_ ")
            }
        }

        println("\n\nIncorrect guesses: ${incorrectGuesses.joinToString(", ")}")

        if (incorrectGuesses.size >= 6) {
            println("\nYou lost! The word was \"$word\".")
            break
        }

        if (letters.subtract(correctGuesses).isEmpty()) {
            println("\nYou won! The word was \"$word\".")
            break
        }

        print("\nGuess a letter: ")
        val guess = readlnOrNull()?.firstOrNull() ?: continue

        if (guess in correctGuesses || guess in incorrectGuesses) {
            println("\nYou already guessed \"$guess\".")
            continue
        }

        if (guess in letters) {
            println("\nCorrect!")
            correctGuesses.add(guess)
        } else {
            println("\nIncorrect!")
            incorrectGuesses.add(guess)
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val random = Random()
    val width = 20
    val height = 10
    val snake = mutableListOf(Point(5, 5))
    var food = generateFood(snake, width, height, random)
    var direction = Direction.RIGHT

    while (true) {
        // Clear the console
        print("\u001b[H\u001b[2J")

        // Draw the game board
        for (y in 0 until height) {
            for (x in 0 until width) {
                when {
                    food.x == x && food.y == y -> print("o")
                    snake.contains(Point(x, y)) -> print("x")
                    else -> print(".")
                }
            }
            println()
        }

        // Move the snake
        val head = snake.last()
        val newHead = when (direction) {
            Direction.UP -> Point(head.x, head.y - 1)
            Direction.DOWN -> Point(head.x, head.y + 1)
            Direction.LEFT -> Point(head.x - 1, head.y)
            Direction.RIGHT -> Point(head.x + 1, head.y)
        }
        snake.add(newHead)

        // Check for collision with food
        if (newHead == food) {
            food = generateFood(snake, width, height, random)
        } else {
            snake.removeAt(0)
        }

        // Check for collision with walls or self
        if (newHead.x < 0 || newHead.x >= width || newHead.y < 0 || newHead.y >= height || snake.contains(newHead)) {
            println("Game over!")
            break
        }

        // Get user input
        if (scanner.hasNext()) {
            val input = scanner.next()
            direction = when (input) {
                "w" -> Direction.UP
                "s" -> Direction.DOWN
                "a" -> Direction.LEFT
                "d" -> Direction.RIGHT
                else -> direction
            }
        }

        // Wait for a short time before redrawing the screen
        Thread.sleep(100)
    }
}

fun generateFood(snake: List<Point>, width: Int, height: Int, random: Random): Point {
    while (true) {
        val food = Point(random.nextInt(width), random.nextInt(height))
        if (!snake.contains(food)) {
            return food
        }
    }
}

data class Point(val x: Int, val y: Int)

enum class Direction {
    UP, DOWN, LEFT, RIGHT
}
 **/

fun main() {
    val timeInNano = measureNanoTime {
        // Your code to measure runtime goes here
        println("Running some code...")
        for (i in 0 until Int.MAX_VALUE) {}
    }
    println("The operation took $timeInNano")
}

enum class Map {
    NORTH,EAST,SOUTH,WEST
}