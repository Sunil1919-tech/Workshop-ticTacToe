package bridgeLabs;

public class ticTacToeGame {
    /*
     * Creating Board Method
     */
    public static char[] createBoard() {
        /*
         * Adding size to the Array
         */
        char[] board = new char[10];

        /*
        *Assigning empty space for each value
        *neglecting zero index from board
        * using for Loop condition
       */

        for(int i = 1;i < board.length; i++) {
            board[i]= ' ';}
        return board;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Tic Tac Toe Game");
        char[] board=createBoard();
    }
}
