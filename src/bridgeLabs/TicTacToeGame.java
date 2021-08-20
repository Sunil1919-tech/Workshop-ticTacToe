package bridgeLabs;

import java.util.Random;
import java.util.Scanner;

/**
 * purpose- to create a board for tic tac toe Game
 *
 * @author Sunil
 * @version 16.0
 * @since 12/8/2021
 */
public class TicTacToeGame {
    public static char[] board;
    public static char playerTurn;
    public static char computerTurn;
    public static Scanner sc = new Scanner(System.in);

    /**
     * createBoard method creates the index value of a board
     *
     * @return returns the board value
     * @index shows the length of the board
     */
    public static char[] createBoard() {
        board = new char[10];
        for (int index = 1; index < board.length; index++) {
            board[index] = ' ';
        }
        return board;
    }

    /**
     * This method implements player choose between X or O
     *
     * @param sc This is the first parameter to playerTurn method
     */
    public static void playerTurn(Scanner sc) {
        System.out.println("Select the option X or O ");
        char option = sc.next().charAt(0);
        if (option == 'X') {
            playerTurn = 'X';
            computerTurn = 'O';
        } else if (option == 'O') {
            computerTurn = 'X';
            playerTurn = 'O';
        } else
            System.out.println("Please select a valid choice");
    }

    /**
     * This method shows the current board
     */
    public static void showBoard() {
        System.out.println("|----|----|----|");
        System.out.println("| " + board[1] + "  | " + board[2] + "  | " + board[3] + "  |");
        System.out.println("|--------------|");
        System.out.println("| " + board[4] + "  | " + board[5] + "  | " + board[6] + "  |");
        System.out.println("|--------------|");
        System.out.println("| " + board[7] + "  | " + board[8] + "  | " + board[9] + "  |");
        System.out.println("|----|----|----|");
    }

    /**
     * creating an option method to select the location of user Choice
     *
     * @param sc this parameter takes the input from 1 to 9 by user
     */
    public static void option(Scanner sc) {
        System.out.println("Enter a number between 1 to 9 .");
        int playerChoice = sc.nextInt();
        switch (playerChoice) {
            case 1:
                board[1] = playerTurn;
                break;
            case 2:
                board[2] = playerTurn;
                break;
            case 3:
                board[3] = playerTurn;
                break;
            case 4:
                board[4] = playerTurn;
                break;
            case 5:
                board[5] = playerTurn;
                break;
            case 6:
                board[6] = playerTurn;
                break;
            case 7:
                board[7] = playerTurn;
                break;
            case 8:
                board[8] = playerTurn;
                break;
            case 9:
                board[9] = playerTurn;
                break;
            default:
                System.out.println("Invalid Option");
        }
        showBoard();
    }
    /*
    creating a method move to decide the empty block
     */
        static void move(){
            boolean played = false;
            while (!played) {
                int playMove = (int) (Math.random() * 10) % 9 + 1;
                if (playMove > 0 && playMove < 10) {
                    if (board[playMove] == ' ') {
                        board[playMove] = computerTurn;
                        played = true;
                    }
                }
            }
            showBoard();
        }



    /**
     * Here main Method , calling the createBoard Method
     * playerTurn method and
     * showBoard method
     */
    public static void main(String[] args) {
        System.out.println("Welcome To tic tac toe Game Program ");      //welcome message
        board = createBoard();
        playerTurn(sc);
        showBoard();
        option(sc);
        move();
        sc.close();



    }
}

