// 17908 KB	,120 ms

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int F[] = new int[N + 10];
        F[1] = 0;
        F[2] = 1;
        F[3] = 1;

        for (int i = 4; i < F.length; i++) {
            if ((i % 2 == 0) && (i % 3 == 0)) {
                F[i] = Math.min(Math.min(F[i / 2], F[i / 3]), F[i - 1]) + 1;
            }
            if ((i % 2 == 0) && (i % 3 != 0)) {
                F[i] = Math.min(F[i / 2], F[i - 1]) + 1;
            }
            if ((i % 2 != 0) && (i % 3 == 0)) {
                F[i] = Math.min(F[i / 3], F[i - 1]) + 1;
            }
            if ((i % 2 != 0) && (i % 3 != 0)) {
                F[i] = F[i - 1] + 1;
            }
        }

        bw.write(String.valueOf(F[N]));
        bw.flush();
        bw.close();
    }

}


