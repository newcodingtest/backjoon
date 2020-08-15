//	13064	80
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String s[] = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int number[] = new int[N];

            for (int i = 0; i < N; i++) {
                number[i] = Integer.parseInt(br.readLine());
            }


            int count = 0;
            for (int i = N - 1; i >= 0; i--) {
                if (M / number[i] >= 1) {
                    count += M / number[i];
                }
                M = M % number[i];
            }
            bw.write(String.valueOf(count));
            bw.flush();
            bw.close();
        }
    }
}