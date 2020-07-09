//12912KB	80ms
import java.io.*;

public class ffibo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        long num0[] = new long[50];
        long num1[] = new long[50];
        num0[0] = 1;
        num0[1] = 0;
        num1[0] = 0;
        num1[1] = 1;

        for (int i = 2; i < 50; i++) {
            num0[i] = num0[i - 1] + num0[i - 2];
            num1[i] = num1[i - 1] + num1[i - 2];
        }


        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(num0[T])+" "+num1[T]);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
