//14564KB	104ms
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int F[] = new int[N + 5];
        int A[] = new int[N + 5];

        for (int i = 1; i < N + 1; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        F[1] = A[1];
        F[2] = A[1] + A[2];
        F[3] = Math.max(Math.max(A[1] + A[2], A[2] + A[3]), A[1] + A[3]);
        for (int i = 4; i < N + 1; i++) {
            F[i] = Math.max(Math.max((F[i - 2] + A[i]), (F[i - 3] + A[i - 1] + A[i])), F[i - 1]);
        }

        bw.write(String.valueOf(F[N]));
        bw.flush();
        bw.close();
    }
}
