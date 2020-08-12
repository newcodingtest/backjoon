//25792KB	264ms
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int N = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int[] F = new int[N];
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }//기본입력

            F[0] = arr[0];
            for (int i = 1; i < N; i++) {
                F[i] = Math.max(arr[i], F[i - 1] + arr[i]);
            }

            Arrays.sort(F);
            bw.write(String.valueOf(F[F.length - 1]));
            bw.flush();
            bw.close();
        }
    }
}
