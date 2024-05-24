import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        char board[][] = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        char player = 'X';
        boolean GameOver = false;
        Scanner sc = new Scanner(System.in);
        while (!GameOver){
            printBoard(board);
            System.out.print("Player "+player+" Enter :");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (board[row][col] == ' '){
                board[row][col] = player; // Place The Element
                if (GameOver){
                    System.out.println("Player :"+player+" Has Won!");
                }
                else{
//                    if (player == 'X'){
//                        player = '0';
//                    }
//                    else{
//                        player = 'X';
//                    }
                    player = (player == 'X') ? '0' : 'X';
                }
            }
            else {
                System.out.println("Invalid Move , Please Try Again...");
            }
        }
        printBoard(board);
    }
    public static boolean havewon(char[][] board, char player){
        //Check for rows
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        //Check for col
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        // Diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player){
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }
        return false;
    }
    public static void printBoard(char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
