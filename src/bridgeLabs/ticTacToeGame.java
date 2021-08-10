package bridgeLabs;

/*
 *Creating an Empty spaces for Tic Tac Toe Game
 */
public class ticTacToeGame {

    //Creating Board Method
    public static char[] createBoard() {
        // Adding size of an  Array
        char[] board = new char[10];

        //Assigning empty space for each value
        //neglecting zero index from board
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
    //calling main method
    public static void main(String[] args) {
        System.out.println("Welcome to the Tic Tac Toe Game");
        char[] board = createBoard();
    }
}
