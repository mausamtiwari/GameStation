package be.intecbrussel.TicTacToe;

import be.intecbrussel.Menu;

import java.util.Scanner;


public class Tic_Tac_Toe {
    protected static Scanner scans = new Scanner(System.in);

    public static void playTicTacToe() {
        initializeGame();
        Board.board();
        CheckForSpot.choosingSpot();
        Board.resetBoard();
    }

    protected static void initializeGame() {
        System.out.println("Hello, welcome to the Tic Tac Toe game! The numbers on the board represent the spots that are not take yet\n");
        System.out.println("We will have player X go first\n");
    }

    protected static void newGame() {
        boolean validOption = false;

        while (!validOption) {                                    // Loops until the user enters valid option.
            System.out.println("Would you like to play again? (y/n)");
            String answer = scans.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                validOption = true;
                Board.resetBoard();

            } else if (answer.equalsIgnoreCase("n")) {
                validOption = true;
                System.out.println("Thanks for playing Rock paper Scissors with us, have a great day!");
                Menu.start();
            } else {
                System.out.println("Please enter a valid option.");
            }
        }
    }

}

/*

The Java code you provided is a simple Tic-Tac-Toe game. It uses a 2D array to represent the game board, and two Strings, "X" and "O", to represent the two players. The game starts with the "X" player going first. The players take turns placing their marks on the board until one player gets three of their marks in a row, column, or diagonal, or until the board is full.

The code uses a few different methods to implement the game:

initializeGame(): This method initializes the game board and the current player.
board(): This method prints the current state of the game board to the console.
choosingSpot(): This method allows the current player to choose a spot on the board to place their mark.
checkForWinner(): This method checks to see if either player has won the game.
newGame(): This method allows the players to start a new game.

Here is a step-by-step explanation of how the code works:

The initializeGame() method is called to initialize the game board and the current player.
The board() method is called to print the current state of the game board to the console.
The choosingSpot() method is called to allow the current player to choose a spot on the board to place their mark.
The checkForWinner() method is called to see if either player has won the game.
If neither player has won the game, the choosingSpot() method is called again to allow the next player to take their turn.
This process continues until either player wins the game or the board is full.
If the board is full, the newGame() method is called to allow the players to start a new game.
The code also uses a few different variables to track the state of the game:

gameBoard: This 2D array represents the game board.
player: This String represents the current player.
amountOfTurns: This integer tracks the number of turns that have been taken in the game.
gameOver: This boolean flag indicates whether the game is over or not.

*/
