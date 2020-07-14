//13044KB	80ms
import java.io.*;
public class Mainn {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        long F[] = new long[101];
        F[1] = 1;
        F[2] = 1;
        F[3] = 1;
        F[4] = 2;
        F[5] = 2;

        for (int i = 6; i < 101; i++) {
            F[i] = F[i - 1] + F[i - 5];
        }


        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(F[N]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
