// package bj_11_1;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        // for INPUT TEST
        // String inputCase = "10";
        // InputStream is = new ByteArrayInputStream(inputCase.getBytes());
        // Scanner sc = new Scanner(is);

        // for SUBMISSION
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = go(n);
        bf.append("" + m);
        bf.flush();
    }

    private static int go(int num) {
        if (num <= 1)
            return 1;

        return num * go(num - 1);
    }
}