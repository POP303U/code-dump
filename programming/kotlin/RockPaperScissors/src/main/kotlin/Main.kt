///  --- Notes ---
//1. Variables for Rock, Paper, Scissors
//2. Ask player for input
//3. Let the Robot make a choice randomly
//4. Have a comparison with the "when" statement
//5. Display the outcome
//6. Ask for a rematch

val choices = arrayOf("Rock", "Paper", "Scissors")
var playerChoice = ""
var winState = ""

fun main() {
    while (true) {
        print("Choose Rock, Paper or Scissors!: ")
        when (readln()) {
            "Rock"     -> { playerChoice = "Rock"; break }
            "Paper"    -> { playerChoice = "Paper"; break }
            "Scissors" -> { playerChoice = "Scissors"; break }
        }
    }
    val botChoice = choices.random()
    println("\nThe bot chose: $botChoice")

    when (botChoice) {
        "Rock"     -> if (playerChoice == "Rock")     winState = "Tie"  else if (playerChoice == "Paper")    winState = "Win" else winState = "Lose"
        "Paper"    -> if (playerChoice == "Paper")    winState = "Tie"  else if (playerChoice == "Scissors") winState = "Win" else winState = "Lose"
        "Scissors" -> if (playerChoice == "Scissors") winState = "Tie"  else if (playerChoice == "Rock")     winState = "Win" else winState = "Lose"
    }
    println("You $winState!")
    print("\nDo you want to play again? (y/n): ")
    if (readln() == "y") main() else print("exiting...")
}