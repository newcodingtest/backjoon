//13028KB	80ms
import java.io.*;

public class fibo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());


        long F[] = new long[100];
        F[0] = 0;
        F[1] = 1;

        for (int i = 2; i < 100; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }

        bw.write(String.valueOf(F[N]));
        bw.flush();
        bw.close();

    }
}
