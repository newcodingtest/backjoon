//28196KB	240ms
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int F[][] = new int[N][N];
        String arr[] = new String[N];


        for (int i = 0; i < N; i++) {
            arr = br.readLine().split(" ");
            for (int j = 0; j <= i; j++) {
                F[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for (int i = 1; i < N; i++) {
            F[i][0] = F[i - 1][0] + F[i][0];
            F[i][i] = F[i - 1][i - 1] + F[i][i];

            for (int j = 1; j <= i - 1; j++) {
                if (F[i - 1][j - 1] > F[i - 1][j]) {
                    F[i][j] = F[i][j] + F[i - 1][j - 1];
                } else {
                    F[i][j] = F[i][j] + F[i - 1][j];
                }
            }
        }

        Arrays.sort(F[N - 1]);
        bw.write(String.valueOf(F[N - 1][N - 1]));
        bw.flush();
        bw.close();
    }
}
