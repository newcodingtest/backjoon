import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int T = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(factorial(T)));
            bw.flush();
            bw.close();
        } catch (IOException e) {
        }

    }

    static int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }

}