package be.intecbrussel.TicTacToe;

public class Board {
    protected static String[][] gameBoard = {              // Displays the board.
            {
                    "1", "2", "3"
            },
            {
                    "4", "5", "6"
            },
            {
                    "7", "8", "9"
            }
    };
    protected static int amountOfTurns = 0;              // Amount of tries initialised to 0.

    protected static void board() {

        System.out.println("Here is the current status of the board\n");

        System.out.println("  " + gameBoard[0][0] + "  |  " + gameBoard[0][1] + "  |  " + gameBoard[0][2] + "  ");
        System.out.println("-----------------");
        System.out.println("  " + gameBoard[1][0] + "  |  " + gameBoard[1][1] + "  |  " + gameBoard[1][2] + "  ");
        System.out.println("-----------------");
        System.out.println("  " + gameBoard[2][0] + "  |  " + gameBoard[2][1] + "  |  " + gameBoard[2][2] + "  ");
    }

    protected static void resetBoard() {                 // resets the board
        gameBoard = new String[][]{
                {
                        "1", "2", "3"
                },
                {
                        "4", "5", "6"
                },
                {
                        "7", "8", "9"
                }
        };
        amountOfTurns = 0;
        CheckForSpot.gameOver = false;
        CheckForSpot.player = "X";
        Tic_Tac_Toe.initializeGame();
        board();
        CheckForSpot.choosingSpot();
    }
}
