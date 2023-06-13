import java.util.*;

public class Main {
    static char[][] board = new char[3][3];
    static char player = 'X';
    static char computer = 'O';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[j][i] = ' ';
            }
        }
    }

    public static void printBoard() {
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n" +
                           "---|---|---" + "\n" +
                           " " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n" +
                           "---|---|---" + "\n" +
                           " " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
    }

    public static int checkFreeSpaces() {
        var freeSpaces = 9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; i < 3; i++) {
                if (board[i][j] != ' ') freeSpaces--;
            }
        }
        return freeSpaces;
    }

    public static void playerMove() {
        int x;
        int y;

        do {
            System.out.println("Enter row (1-3):");
            x = scanner.nextInt() - 1;
            System.out.println("Enter column (1-3):");
            y = scanner.nextInt() - 1;

            if (board[x][y] != ' ') {
                System.out.println("Invalid move");
            } else {
                board[x][y] = player;
                break;
            }

        } while (board[x][y] != ' ');
    }

    public static void computerMove() {
        int x;
        int y;
        if (checkFreeSpaces() > 0) {
            do {
                x = random.nextInt(0,2);
                y = random.nextInt(0,2);
            } while (board[x][y] != ' ');

            board[x][y] = computer;
        } else {
            printWinner(' ');
        }
    }

    public static char checkWinner() {
        //rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0];
            }
        }
        //columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i];
            }
        }

        //diagonals
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2];
        }

        return ' ';
    }

    public static void printWinner(char winner) {
        if (winner == player) {
            System.out.println("You win");
        } else if (winner == computer) {
            System.out.println("Computer wins");
        } else {
            System.out.println("Its a tie");
        }
    }
    public static void main(String[] args) {
        char winner = ' ';
        resetBoard();
        while (winner == ' ' && checkFreeSpaces() != 0) {
            printBoard();

            playerMove();
            winner = checkWinner();
            if (winner != ' ' && checkFreeSpaces() != 0) {
                break;
            }

            computerMove();
            winner = checkWinner();
            if (winner != ' ' && checkFreeSpaces() != 0) {
                break;
            }
        }
        printBoard();
        printWinner(winner);
        System.out.println("Do you want to play again? (y/n)");
        if (Objects.equals(scanner.next(), "y")) {
            main(args);
        }
    }
}