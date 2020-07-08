//13656KB	2636ms
import java.io.*;

public class Queeen {
    static boolean check1[] = new boolean[40];
    static boolean check2[] = new boolean[40];
    static boolean check3[] = new boolean[40];
    static int N;
    static int number = 0;

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static void dfs(int cnt) throws IOException {

        if (cnt == N) {
            number++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (check1[i] || check2[i + cnt] || check3[cnt - i + N - 1])
                continue;

            check1[i] = true;
            check2[i + cnt] = true;
            check3[cnt - i + N - 1] = true;

            dfs(cnt + 1);

            check1[i] = false;
            check2[i + cnt] = false;
            check3[cnt - i + N - 1] = false;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dfs(0);

        bw.write(String.valueOf(number));
        bw.flush();
        bw.close();
    }
}