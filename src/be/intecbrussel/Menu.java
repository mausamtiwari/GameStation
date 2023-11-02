package be.intecbrussel;

import be.intecbrussel.GuessIt.GuessIt;
import be.intecbrussel.RockPaperScissors.RockPaperScissors;
import be.intecbrussel.TicTacToe.Tic_Tac_Toe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        do {                               // Only accepts integer from user.
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\n**** Hello, welcome to the Game Station ****");
                System.out.println("\nChoose a game to play:");
                System.out.println("1. Tic-Tac-Toe");
                System.out.println("2. GuessIt!");
                System.out.println("3. Rock Scissor paper!");
                System.out.println("4. Exit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        Tic_Tac_Toe.playTicTacToe();
                        break;
                    case 2:
                        GuessIt.play();
                        break;
                    case 3:
                        RockPaperScissors.play();
                        break;
                    case 4:
                        System.out.println("Thank you for your time. Exiting the game menu. Goodbye!");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.'1','2','3' or '4'");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type. Please enter integer only.");
            }
        }
        while (true);


    }
}
