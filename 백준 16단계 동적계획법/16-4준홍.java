
// 14548kb 128ms
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
  static int MAX = 101;
  static long[] arr = new long[MAX];

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 1;
    for (int i = 3; i < MAX; i++) {
      arr[i] = arr[i - 2] + arr[i - 3];
    }

    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      bw.write(String.valueOf(arr[n - 1]));
      bw.newLine();
    }

    sc.close();
    bw.close();
  }
}