import java.io.*;
import java.util.Scanner;

public class Main {
    static int count = 0;
    public static BufferedReader br;
    public static BufferedWriter bw;

    public static void main(String[] args) throws IOException {

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count = (int) Math.pow(2, N) - 1;
        System.out.println(count);

        hanoi(N, 1, 2, 3);

        bw.flush();
        bw.close();

    }

    public static void hanoi(int num, int start, int middle, int end) throws IOException {

        if (num > 1) {
            hanoi(num - 1, start, end, middle);
            hanoi(1, start, middle, end);
            hanoi(num - 1, middle, start, end);
        } else if (num == 1) {
            bw.write(start + " " + end+"\n");
        }
    }


}


