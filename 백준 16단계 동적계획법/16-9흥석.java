//13032KB	80ms
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        long F[][] = new long[N][10];

        for (int i = 0; i < 10; i++) {
            F[0][i] = 1;
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 9) {
                    F[i][j] = F[i - 1][8] % 1000000000;
                } else if (j == 0) {
                    F[i][j] = F[i - 1][1] % 1000000000;
                } else {
                    F[i][j] = (F[i - 1][j + 1] + F[i - 1][j - 1]) % 1000000000;
                }
            }
        }

        long cnt = 0;
        for (int i = 1; i < 10; i++) {
            cnt += F[N - 1][i];
        }
        bw.write(String.valueOf(cnt % 1000000000));
        bw.flush();
        bw.close();
    }
}
