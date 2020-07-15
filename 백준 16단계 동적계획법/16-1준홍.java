
// 14304kb 116ms
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    System.out.print(fibonacci(n));
  }

  static long fibonacci(int n) {
    long a = 0, b = 1, temp;
    if (n == 0)
      return a;
    for (int i = 2; i <= n; i++) {
      temp = a + b;
      a = b;
      b = temp;
    }
    return b;
  }
}
