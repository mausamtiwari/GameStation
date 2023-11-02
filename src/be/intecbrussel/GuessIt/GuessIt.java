package be.intecbrussel.GuessIt;

import be.intecbrussel.Menu;

import java.util.Random;
import java.util.Scanner;


public class GuessIt {
    private static final int MAX_TRIES = 3;         // User has 3 chances to guess the word.
    private static String wordToGuess;              // User guessed words.
    private static StringBuilder guessedWord;       // String builder with the list of guesses words.
    private static int triesLeft;                   // Number of tries left.
    private static boolean gameWon;
    private static boolean gameLost;
    private static boolean validOption = false;
    private static final Scanner scans = new Scanner(System.in);


    public static void play() {
        initialize();
        while (!gameWon && !gameLost) {            // The game runs until it is lost or won.
            showGameStatus();
            char guess = takeUserInput();          // It keeps on taking the user guesses.
            check(guess);
        }
        showGameResult();                          // It shows result if the game is won or lost.
    }

    private static void initialize() {
        final Random randNum = new Random();                                 // Generates a random number
        WordsEnum[] words = WordsEnum.values();                              // Returns an array of enum from WordsEnum.
        wordToGuess = String.valueOf(words[randNum.nextInt(words.length)]);  // Randomly selects a word from the array of words and is assigned in wordToGuess.
        guessedWord = new StringBuilder("_".repeat(wordToGuess.length()));   // Initialises the guessWord variable with the length of word to guess with '_'.
        triesLeft = MAX_TRIES;                                               // Sets number of tries.
        gameWon = false;                                                     // Initialise gameWon
        gameLost = false;                                                    // Initialise gameWon
    }


    private static void showGameStatus() {                 // Prints the guessed word and number of tries left.
        System.out.println("Word: " + guessedWord);
        System.out.println("Numbers of letters: " + wordToGuess.length());
        System.out.println("Tries left: " + triesLeft);
    }

    private static char takeUserInput() {                   // Takes the single character from the input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a letter: ");
        return scanner.next().toUpperCase().charAt(0);      // This converts the input string to capital letter and gets the first character of the input.
    }

    private static void check(char guess) {                  // Checks whether the guessed letter matches any letters in the word to guess.
        boolean found = false;                               // Initialises with variable found false;
        for (int i = 0; i < wordToGuess.length(); i++) {     // Checks whether the guessed letter matches the letter inside word to guess.
            if (wordToGuess.charAt(i) == guess) {            // If the letter is found, it puts inside the guessedWord.
                guessedWord.setCharAt(i, guess);
                found = true;
            }
        }
        if (!found) {                                        // If the guessed letter is not found, decreases the number of tries.
            triesLeft--;
            if (triesLeft == 0) {                            // If the number of tries is zero, the game is lost.
                gameLost = true;

            }
        }
        if (guessedWord.indexOf("_") == -1) {                // if there are no underscore in the guessed word, then the game is won.
            gameWon = true;
        }
    }

    private static void showGameResult() {                   // Prints the game result.
        if (gameWon) {
            System.out.println("Congratulations! You've guessed the word " + "'" + wordToGuess + "'" + " correctly.");
            while (!validOption) {                            // Loops until the user enters valid option.
                System.out.println("Would you like to play again? (y/n)");
                String answer = scans.nextLine();
                if (answer.equalsIgnoreCase("y")) {
                    validOption = true;
                    play();
                } else if (answer.equalsIgnoreCase("n")) {
                    validOption = true;
                    System.out.println("Thanks for playing GuessIt! with us, have a great day!");
                    Menu.start();
                } else {
                    System.out.println("Please enter a valid option.");
                }
            }
        } else if (gameLost) {
            System.out.println("Oops! You've run out of tries. The word was: " + wordToGuess);
        }
    }

}
