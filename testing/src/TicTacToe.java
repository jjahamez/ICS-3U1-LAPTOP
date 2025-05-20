import java.util.*;

public class TicTacToe {
  public static void main(String[] args) {
    char[][] board = {
      { '1', '2', '3' },
      { '4', '5', '6' },
      { '7', '8', '9' }
    }; // 3x3 board
    boolean turn = true; // true for 'X', false for 'O'
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Tic Tac Toe!");
    System.out.println("Instructions:");
    System.out.println("Enter your move as a number from 1-9 (refer to grid below) ");
    printBoard(board);
    System.out.println("The first player is 'X', and the second player is 'O'.");

    while (true) {
      printBoard(board);
      String currentPlayer = turn ? "X" : "O";
      System.out.println("Player " + currentPlayer + ", enter your move (1-9): ");
      int move;
      try {
        move = input.nextInt() - 1; // Adjust for index
        int row = move / 3;
        int col = move % 3;
        if (board[row][col] == 'X' || board[row][col] == 'O') {
          System.out.println("Invalid move. Spot already taken.");
          continue;
        }
        board[row][col] = currentPlayer.charAt(0); // 'X' or 'O'
      } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid input. Please enter a number between 1 and 9.");
        input.nextLine();
        continue;
      }

      if (checkWin(board)) {
        printBoard(board);
        System.out.println("Player " + currentPlayer + " wins!");
        break; // Ends the game
      }
      if (checkDraw(board)) {
        printBoard(board);
        System.out.println("It's a draw!");
        break; // Ends the game
      }

      turn = !turn; // Switch turns
    }
    input.close(); 
  }

  public static void printBoard(char[][] board) {
    for (int i = 0; i < 3; i++) {
      System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
      if (i < 2) System.out.println("---------");
    }
  }

  public static boolean checkWin(char[][] board) {
    // Check rows and columns
    for (int i = 0; i < 3; i++) {
      if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) return true; // Rows
      if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) return true; // Columns
    }
    // Check diagonals
    if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) return true;
    if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) return true;
    return false;
  }

  public static boolean checkDraw(char[][] board) {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (board[i][j] != 'X' && board[i][j] != 'O') {
          return false;
        }
      }
    }
    return true;
  }
}
