package be.intecbrussel.TicTacToe;

import static be.intecbrussel.TicTacToe.Board.gameBoard;

public class CheckWinner {

    protected static void checkForWinner() {
        //we have to figure out how to finish the game

            if (
                    (gameBoard[0][0].equals("X") && gameBoard[0][1].equals("X") && gameBoard[0][2].equals("X")) ||
                            (gameBoard[1][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[1][2].equals("X")) ||
                            (gameBoard[2][0].equals("X") && gameBoard[2][1].equals("X") && gameBoard[2][2].equals("X")) ||
                            (gameBoard[0][0].equals("X") && gameBoard[1][0].equals("X") && gameBoard[2][0].equals("X")) ||
                            (gameBoard[0][1].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][1].equals("X")) ||
                            (gameBoard[0][2].equals("X") && gameBoard[1][2].equals("X") && gameBoard[2][2].equals("X")) ||
                            (gameBoard[0][0].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][2].equals("X")) ||
                            (gameBoard[0][2].equals("X") && gameBoard[1][1].equals("X") && gameBoard[2][0].equals("X"))

            ) {

                System.out.println("Player X is the winner of this game!\nThanks for playing Tic Tac Toe with us!");
                CheckForSpot.gameOver = true;
                Tic_Tac_Toe.newGame();
            }

            if (
                    (gameBoard[0][0].equals("O") && gameBoard[0][1].equals("O") && gameBoard[0][2].equals("O")) ||
                            (gameBoard[1][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[1][2].equals("O")) ||
                            (gameBoard[2][0].equals("O") && gameBoard[2][1].equals("O") && gameBoard[2][2].equals("O")) ||
                            (gameBoard[0][0].equals("O") && gameBoard[1][0].equals("O") && gameBoard[2][0].equals("O")) ||
                            (gameBoard[0][1].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][1].equals("O")) ||
                            (gameBoard[0][2].equals("O") && gameBoard[1][2].equals("O") && gameBoard[2][2].equals("O")) ||
                            (gameBoard[0][0].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][2].equals("O")) ||
                            (gameBoard[0][2].equals("O") && gameBoard[1][1].equals("O") && gameBoard[2][0].equals("O"))
            ) {

                System.out.println("Player O is the winner of this game!\nThanks for playing Tic Tac Toe with us!");
                CheckForSpot.gameOver = true;
                Tic_Tac_Toe.newGame();
            }
        }

    }
