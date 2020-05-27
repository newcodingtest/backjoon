import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    private static boolean[][] metric;

    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        // for INPUT TEST
        // String inputCase = "" + (3 * 3 * 3 * 3);
        // InputStream is = new ByteArrayInputStream(inputCase.getBytes());
        // Scanner sc = new Scanner(is);

        // for SUBMISSION
        System.out.print("입력하세요: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        metric = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                metric[i][j] = false;
            }
        }

        go(0, 0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (metric[i][j])
                    bf.write('*');
                else
                    bf.write(' ');
            }
            if (i != n - 1)
                bf.write('\n');
        }
        bf.flush();
        bf.close();
    }

    private static void go(int x, int y, int num) {
        if (num == 1) {
            metric[x][y] = true;
            return;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != 1 || j != i) {
                    // metric[x + i][y + j] = true;
                    // go(x + i, y + j, num/3);
                    go(x + (i * (num / 3)), y + (j * (num / 3)), num / 3);
                }
            }
        }
    }
}

