import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(fibonacci(T)));
            bw.flush();
            bw.close();

        } catch (IOException e) {
        }
    }

    static int fibonacci(int num) {
        if (num > 1) {
            return fibonacci(num - 1) + fibonacci(num - 2);
        } else if (num == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}