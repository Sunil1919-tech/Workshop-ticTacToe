package bridgeLabs;

import java.util.Scanner;

/*
 *Creating a board for Tic Tac Toe Game
 */
public class ticTacToeGame {

    //Creating Board Method
    public static char[] createBoard() {
        // Adding size of an  Array
        char[] board = new char[10];
        //Assigning empty space for each value
        for (int index = 1; index < board.length; index++) {                     //neglecting zero index from board
            board[index] = ' ';
        }
        return board;
    }
    //creating inputs for the User
    public static char assignInput() {
        //assigning the input letters for Computer and Player
        System.out.println("Computer letter is O ");
        System.out.println("Player letter is X ");
        //Scanner package to take input from user
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the X or O character to play :" );
        char input =sc.next().charAt(0);
        System.out.println("Entered Character is:" +input );
        return input;
    }
    public static void showBoard(char[] board)

    //Print conditions for to Printing the board
    {
        System.out.println("|----|----|----|");
        System.out.println("| " + board[1] + "  | " + board[2] + "  | " + board[3]+ "  |");
        System.out.println("|--------------|");
        System.out.println("| " + board[4] + "  | " + board[5] + "  | " + board[6]+ "  |");
        System.out.println("|--------------|");
        System.out.println("| " + board[7] + "  | " + board[8] + "  | " + board[9] + "  |");
        System.out.println("|----|----|----|");

    }
    //calling main method
    public static void main(String[] args) {
        System.out.println("Welcome to the Tic Tac Toe Game");
        char[] board = createBoard();               //calling createBoard method in main method
        assignInput();                              //calling inputs method in the main method
        showBoard(board);                           // calling showBoard Method in the main method
    }
}
