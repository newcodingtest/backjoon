import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  static int[][] board;
  static final int length = 9;

  public static void main(final String[] args) throws IOException {
    board = new int[length][length];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < length; i++) {
      String[] nums = br.readLine().split(" ");
      for (int j = 0; j < nums.length; j++) {
        board[i][j] = Integer.parseInt(nums[j]);
      }
    }
    br.close();
    solve(0, 0);
  }

  public static void solve(int row, int col) throws IOException {
    if (row == length) {
      printBoard();
      return;
    }
    for (int i = 1; i <= length; i++) {
      board[row][col] = i;        //보드에 i 를 쓰고
      if (isValid(row, col)) {    //조건 스도쿠 규칙에 맞으면 다음 칸으로 넘어감
        if (col == length - 1) {
          solve(row + 1, 0);
        } else {
          solve(row, col + 1);
        }
      }                           
      // board[row][col] = 0;
    }
  }

  public static boolean isValid(int currRow, int currCol) {
    for (int i = 0; i < length; i++) {
      if (i == currRow) {
        continue;
      }
      if (board[currRow][currCol] == board[i][currCol]) {
        board[currRow][currCol] = 0;
        return false;
      }
    }
    for (int j = 0; j < length; j++) {
      if (j == currCol) {
        continue;
      }
      if (board[currRow][currCol] == board[currRow][j]) {
        board[currRow][currCol] = 0;
        return false;
      }
    }
    int startRow;
    int startCol;
    if (currRow < 3) {
      startRow = 0;
      if (currCol < 3) {
        startCol = 0;
      } else if (currCol < 6) {
        startCol = 3;
      } else {
        startCol = 6;
      }
    } else if (currRow < 6) {
      startRow = 3;
      if (currCol < 3) {
        startCol = 0;
      } else if (currCol < 6) {
        startCol = 3;
      } else {
        startCol = 6;
      }
    } else {
      startRow = 6;
      if (currCol < 3) {
        startCol = 0;
      } else if (currCol < 6) {
        startCol = 3;
      } else {
        startCol = 6;
      }
    }

    for (int i = startRow; i < startRow + 3; i++) {
      for (int j = startCol; j < startCol + 3; j++) {
        if (i == currRow || j == currCol) {
          continue;
        }
        if (board[currRow][currCol] == board[i][j]) {
          board[currRow][currCol] = 0;
          return false;
        }
      }
    }
    return true;
  }

  private static void printBoard() throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        bw.write(String.valueOf(board[i][j]));
        if (j < length - 1) {
        bw.write(" ");
        }
      }
      if (i < length - 1) {
        bw.newLine();
      }
    }
    bw.close();
  }
}