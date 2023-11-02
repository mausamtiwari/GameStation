package be.intecbrussel.TicTacToe;

import java.util.Scanner;

import static be.intecbrussel.TicTacToe.Board.*;

public class CheckForSpot {
    protected static boolean gameOver = false;
    protected static String player = "X";
    protected static Scanner s = new Scanner(System.in);


    protected static boolean isDraw() {
        return amountOfTurns == 9;
    }

    protected static void choosingSpot() {
        //Ask the user to input where they want to put the X/O

        while (!gameOver) {

            if (player.equals("X")) {
                System.out.println("Please choose the number of the spot you want to place your X");
                //Take input
                String input = s.nextLine();
                //Put the input into the gameBoard
                //checks if the user wants to place their mark at position (0, 0) on the game board
                // and if that position is currently unoccupied by either player "X" or player "O".
                //increments the value of `amountOfTurns` by 1.
                if (input.equals("1") && (gameBoard[0][0] != "X" && gameBoard[0][0] != "O")) {

                    gameBoard[0][0] = "X";
                    player = "O";
                    amountOfTurns++;

                } else if (input.equals("2") && (gameBoard[0][1] != "X" && gameBoard[0][1] != "O")) {

                    gameBoard[0][1] = "X";
                    player = "O";
                    amountOfTurns++;

                } else if (input.equals("3") && (gameBoard[0][2] != "X" && gameBoard[0][2] != "O")) {

                    gameBoard[0][2] = "X";
                    player = "O";
                    amountOfTurns++;

                } else if (input.equals("4") && (gameBoard[1][0] != "X" && gameBoard[1][0] != "O")) {

                    gameBoard[1][0] = "X";
                    player = "O";
                    amountOfTurns++;

                } else if (input.equals("5") && (gameBoard[1][1] != "X" && gameBoard[1][1] != "O")) {

                    gameBoard[1][1] = "X";
                    player = "O";
                    amountOfTurns++;

                } else if (input.equals("6") && (gameBoard[1][2] != "X" && gameBoard[1][2] != "O")) {

                    gameBoard[1][2] = "X";
                    player = "O";
                    amountOfTurns++;

                } else if (input.equals("7") && (gameBoard[2][0] != "X" && gameBoard[2][0] != "O")) {

                    gameBoard[2][0] = "X";
                    player = "O";
                    amountOfTurns++;

                } else if (input.equals("8") && (gameBoard[2][1] != "X" && gameBoard[2][1] != "O")) {

                    gameBoard[2][1] = "X";
                    player = "O";
                    amountOfTurns++;

                } else if (input.equals("9") && (gameBoard[2][2] != "X" && gameBoard[2][2] != "O")) {

                    gameBoard[2][2] = "X";
                    player = "O";
                    amountOfTurns++;

                } else {
                    System.out.println("Invalid move please try again!");
                }

                //return new board
                Board.board();
                //check for winner
                CheckWinner.checkForWinner();

            } else if (player.equals("O")) {
                System.out.println("Please choose the number of the spot you want to place your O");
                //Take input
                String input = s.nextLine();
                //Put the input into the gameBoard
                if (input.equals("1") && (gameBoard[0][0] != "X" && gameBoard[0][0] != "O")) {

                    gameBoard[0][0] = "O";
                    player = "X";
                    amountOfTurns++;

                } else if (input.equals("2") && (gameBoard[0][1] != "X" && gameBoard[0][1] != "O")) {

                    gameBoard[0][1] = "O";
                    player = "X";
                    amountOfTurns++;

                } else if (input.equals("3") && (gameBoard[0][2] != "X" && gameBoard[0][2] != "O")) {

                    gameBoard[0][2] = "O";
                    player = "X";
                    amountOfTurns++;

                } else if (input.equals("4") && (gameBoard[1][0] != "X" && gameBoard[1][0] != "O")) {

                    gameBoard[1][0] = "O";
                    player = "X";
                    amountOfTurns++;

                } else if (input.equals("5") && (gameBoard[1][1] != "X" && gameBoard[1][1] != "O")) {

                    gameBoard[1][1] = "O";
                    player = "X";
                    amountOfTurns++;

                } else if (input.equals("6") && (gameBoard[1][2] != "X" && gameBoard[1][2] != "O")) {

                    gameBoard[1][2] = "O";
                    player = "X";
                    amountOfTurns++;

                } else if (input.equals("7") && (gameBoard[2][0] != "X" && gameBoard[2][0] != "O")) {

                    gameBoard[2][0] = "O";
                    player = "X";
                    amountOfTurns++;

                } else if (input.equals("8") && (gameBoard[2][1] != "X" && gameBoard[2][1] != "O")) {

                    gameBoard[2][1] = "O";
                    player = "X";
                    amountOfTurns++;

                } else if (input.equals("9") && (gameBoard[2][2] != "X" && gameBoard[2][2] != "O")) {

                    gameBoard[2][2] = "O";
                    player = "X";
                    amountOfTurns++;

                } else {
                    System.out.println("Invalid move please try again!");
                }


                ///return new board
                Board.board();
                //check for winner
                CheckWinner.checkForWinner();
            }
            if (isDraw()) {
                System.out.println("It's a draw! Thank you for playing Tic Tac Toe.");
                gameOver = true;
                Tic_Tac_Toe.newGame();
            }
        }
    }

}
