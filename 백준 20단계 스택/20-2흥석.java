//	25380	180
import java.io.*;
public class Main {
    static int[] arr = new int[1000000];
    static int end = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            if (T == 0) {
                delete();
            } else {
                push(T);
            }
        }

        for (int i = 0; i < end; i++) {
            sum += arr[i];

        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }

    static void delete() {
        --end;
    }

    static void push(int num) {
        arr[end] = num;
        end++;
    }
}
