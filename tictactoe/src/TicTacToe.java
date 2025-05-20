import java.util.*;

public class TicTacToe {
  public static void printBoard(char[][] board) {
    for (int i = 0; i < 3; i++) {
      System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]); // adds | between numbers
      if (i < 2)
        System.out.println("---------"); // prints a dashed line after the first 2 rows 
    }
  }

  public static boolean checkWin(char[][] board) { // checks for win
    for (int i = 0; i < 3; i++) {
      if ((board[i][0] == board[i][1] && board[i][1] == board[i][2]) || // columns 
          (board[0][i] == board[1][i] && board[1][i] == board[2][i]) || // rows
          (board[0][0] == board[1][1] && board[1][1] == board[2][2]) || // diagonals 
          (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
      return true; 
     }
  }
    return false; // no winner yet
  } 
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char[][] board = {
        { '1', '2', '3' },{ '4', '5', '6' }, { '7', '8', '9' }
    }; // splits the board into 3x3 spots

    boolean turn = true; // true for 'X', false for 'O'
    int moveCount = 0; // will count moves

    System.out.println("Welcome to Tic Tac Toe");
    System.out.println("Instructions:");
    System.out.println("Enter your move as a number from 1-9 (refer to grid below) ");
    System.out.println("The first player is 'X', and the second player is 'O'.");
    System.out.println("To win, get three of the same symbol connected in a row, column or diagonal");

    while (true) {
      printBoard(board);
      String currentPlayer = turn ? "X" : "O";
      System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
      int move;

      try { // reads as string and converts to int, then -1 to match index
        move = Integer.parseInt(input.nextLine()) - 1; // string to avoid edge case of 1 2 (instead of input.nextInt)
        int row = move / 3;
        int col = move % 3; // converts number into coordinate

        if (board[row][col] == 'X' || board[row][col] == 'O') {
          System.out.println("Invalid move. Spot already taken.");
          continue;
        }
        board[row][col] = currentPlayer.charAt(0); // updates board to 'X' or 'O' (1st string to char)
        moveCount++; 
      } catch (ArrayIndexOutOfBoundsException | NumberFormatException err) {
        System.out.println("Invalid input. Please enter a single integer between 1 and 9.");
        continue;
      }

      if (checkWin(board)) {
        printBoard(board);
        System.out.println("Player " + currentPlayer + " wins!");
        break; // Ends the game
      }
      
      if (moveCount==9){
        printBoard(board);
        System.out.println("It's a draw!!");
        break; // 9 moves = draw
      }
      turn = !turn; // switch turns
    }
    input.close();
  }
}