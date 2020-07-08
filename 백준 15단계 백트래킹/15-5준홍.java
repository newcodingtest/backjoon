// 14928 kb,  6184 ms
import java.util.Scanner;
import java.lang.Math;

public class Main {
  static int numOfSolutions = 0; 
  static int n;
  static int[] compressedBoard; // 2d array 의 1d 표현
                                // index: column 번호
                                // value: 퀸이 있는 row 번호 (-999 if empty)
  static int empty = -999;

  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sc.close();

    compressedBoard = new int[n];
    for (int i = 0; i < n; i++) {
      compressedBoard[i] = empty;
    }
    solve(0);
    System.out.print(numOfSolutions);
  }

  public static void solve(int col) {
    if (col == n) {
      numOfSolutions++;
      return;
    }
    for (int row = 0; row < n; row++) {
      compressedBoard[col] = row; // 퀸을 놓는다
      if (noConflicts(col)) { // 퀸을 놓고 난 후 앞에 놓인 퀸들과 충돌이 없으면 계속 진행
        solve(col + 1);       // 아닐시 다음 column 으로 스킵
      }

      compressedBoard[col] = empty;
    }
  }

  public static boolean noConflicts(int currentCol) {
    //한 column에 하나씩 퀸을 놓으며 가기 때문에 currentCol에 또다른 퀸은 없다고 가정
    // currentCol 다음에 오는 columns 에도 퀸은 없다고 가정하고 row 와 대각선 방향만 확인 
    for (int i = 0; i < currentCol; i++) {
      if (compressedBoard[i] == compressedBoard[currentCol]) { //같은 row 에 다른 퀸이 있는지 확인
        return false;
      }
      if (currentCol - i == Math.abs(compressedBoard[currentCol] - compressedBoard[i])) {//대각선에 다른 퀸이 있는지 확인
        return false;
      }
    }
    return true;
  }
}