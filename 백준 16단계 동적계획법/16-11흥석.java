import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int N = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int[] F = new int[N + 5];
            int[] arr = new int[N + 5];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }//기본입력

            int ans = 1;
            F[0] = 1;

            for (int i = 1; i < N; i++) {
                int max = 0;
                for (int j = 0; j < i; j++) {
                    if (F[j] > max && arr[j] < arr[i]) max = F[j];
                }
                F[i] = max + 1;
                if (ans < F[i]) ans = F[i];
            }
            bw.write(String.valueOf(ans));
            bw.flush();
            bw.close();
        }
    }
}
