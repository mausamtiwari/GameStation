package be.intecbrussel.RockPaperScissors;

import be.intecbrussel.Menu;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final Scanner scans = new Scanner(System.in);
    private static String playerMove;

    public static void play() {
        while (true) {
            // Play RockPaperScissors
            initialiseRPS();
            // Ask the user if they want to play again
            playAgain();
        }
    }

    private static void initialiseRPS() {
        String computerMove;
        Random rand = new Random();                 // Generates random number 0, 1, and 2.
        int randNumber = rand.nextInt(3);
        boolean validChoice = false;                // Initialise valid choice as false.

        while (!validChoice) {                      // Asks for valid choice. if valid choice not entered asks again to enter it.

            System.out.println("Make a move! (rock/paper/scissors)");      // User should enter the choices precisely regardless of their case.
            playerMove = scans.nextLine();
            if (playerMove.equalsIgnoreCase("rock")) {
                validChoice = true;
            } else if (playerMove.equalsIgnoreCase("scissors")) {
                validChoice = true;
            } else if (playerMove.equalsIgnoreCase("paper")) {
                validChoice = true;
            } else {
                System.out.println("please enter a valid choice.");
            }
        }

        if (randNumber == 0) {               // If randomNumber is 0, then it is initialised as computer's move "rock".
            computerMove = "rock";
        } else if (randNumber == 1) {        // If randomNumber is 1, then it is initialised as computer's move "paper".
            computerMove = "paper";
        } else {                             // If randomNumber is 2, then it is initialised as computer's move "scissors".
            computerMove = "scissors";
        }

        System.out.println("Computer chose " + computerMove + "!");      // Displays the move of computer.


        boolean playerWins = playerWins(computerMove);                   // Displays the winner
        if (playerWins) {
            System.out.println("Player wins!");
        } else if (playerMove.equals(computerMove)) {                    // The game is draw if the player's move and computer's move is same.
            System.out.println("It's a draw!");
        } else {
            System.out.println("Computer wins!");
        }
    }


    private static boolean playerWins(String computerMove) {       // Method to decide the winner.
        if (RockPaperScissors.playerMove.equals("rock") && computerMove.equals("scissors")) {
            return true;                                           // If user's move is rock and computer's move is scissors, User is winner.
        } else // Any other cases, computer wins.
            if (RockPaperScissors.playerMove.equals("paper") && computerMove.equals("rock")) {
            return true;                                           // If user's move is paper and computer's move is rock, User is winner.
        } else return RockPaperScissors.playerMove.equals("scissors") && computerMove.equals("paper");                                           // If user's move is scissors and computer's move is paper, User is winner.
    }


    private static void playAgain() {                          // Method to restart the game or exit.

        boolean validOption = false;

        while (!validOption) {                                    // Loops until the user enters valid option.
            System.out.println("Would you like to play again? (y/n)");
            String answer = scans.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                validOption = true;
            } else if (answer.equalsIgnoreCase("n")) {
                validOption = true;
                System.out.println("Thank you for playing Rock paper Scissors with us. Have a great day!");
                Menu.start();
            } else {
                System.out.println("Please enter a valid option.");
            }
        }
    }

}





