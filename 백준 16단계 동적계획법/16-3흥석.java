//21272KB	108ms
import java.io.*;

public class tile {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());


        long F[] = new long[1000010];
        F[0] = 1;
        F[1] = 1;

        for (int i = 2; i < 1000010; i++) {
            F[i] = (F[i - 1] + F[i - 2])%15746;
        }

        bw.write(String.valueOf(F[N]));
        bw.flush();
        bw.close();

    }
}
