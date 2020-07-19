//	13120KB	80ms
import java.io.*;
public class dddd {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int F[] = new int[N + 2];
        for (int i = 1; i < N + 1; i++) {
            F[i] = Integer.parseInt(br.readLine());
        }

        int score[] = new int[N + 2];
        score[1] = F[1];
        score[2] = F[2] + F[1];
        int cnt = 1;


        int a; int b; int c;
        for (int i = 3; i < N + 1; i++) {
            a = score[i - 2] + F[i];
            b = score[i - 1] + F[i];
            if (a > b) {
                score[i] = a;
                cnt = 0;
            } else {
                if (cnt == 1) {
                    c = score[i - 3] + F[i - 1] + F[i];
                    if (a > c) {
                        score[i] = a;
                        cnt = 0;
                    } else {
                        score[i] = c;
                    }
                } else {
                    score[i] = b;
                    cnt = 1;
                }
            }
        }
        bw.write(String.valueOf(score[N]));
        bw.flush();
        bw.close();
    }
}