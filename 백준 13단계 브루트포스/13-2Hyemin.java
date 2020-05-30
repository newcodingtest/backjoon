import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        // for INPUT TEST
        // String inputCase = "216";
        // InputStream is = new ByteArrayInputStream(inputCase.getBytes());
        // Scanner sc = new Scanner(is);

        // for SUBMISSION
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = go(n);
        bf.write("" + result + "\n");

        bf.flush();
        bf.close();
    }

    private static int go(int n) {
        int result = 0;
        int cnt = ("" + n).length();
        int nStart = n - (cnt * 9);
        if (nStart < 0) nStart = 0;
        for (int i = nStart; i < n; i++) {
            int num = i;
            int sum = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum == n) {
                result = i;
                break;
            }
        }
        return result;
    }
}
