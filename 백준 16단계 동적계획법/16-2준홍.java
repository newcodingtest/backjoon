// 14504kb	124ms
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
  static int[] zeros = new int[41];
  static int[] ones = new int[41];

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    zeros[0] = 1;
    zeros[1] = 0;
    ones[0] = 0;
    ones[1] = 1;
    for (int i = 2; i <= 40; i++) {
      zeros[i] = zeros[i - 1] + zeros[i - 2];
      ones[i] = ones[i - 1] + ones[i - 2];
    }

    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      bw.write(zeros[m] + " " + ones[m]);
      bw.newLine();
    }

    sc.close();
    bw.close();
  }

}
