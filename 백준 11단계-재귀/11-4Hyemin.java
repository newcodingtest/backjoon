
import java.io.*;
import java.util.Scanner;

public class Main {
    private static int count;
    private static BufferedWriter bf;

    public static void main(String[] args) throws IOException {
        BufferedWriter bfCnt = new BufferedWriter(new OutputStreamWriter(System.out));
        bf = new BufferedWriter(new OutputStreamWriter(System.out));

        // for INPUT TEST
        // String inputCase = "4";
        // InputStream is = new ByteArrayInputStream(inputCase.getBytes());
        // Scanner sc = new Scanner(is);


        // for SUBMISSION
        System.out.print("입력하세요: ");
        /Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        count = 0;

        go(n, 1, 2, 3);

        bfCnt.write(count + "\n");
        bfCnt.flush();
        bf.flush();
        bf.close();
        bfCnt.close();
    }

    private static void go(int n, int pillarFrom, int pillarBy, int pillarTo) throws IOException {
        if (n == 1) {
            bf.write("" + pillarFrom + " " + pillarTo + "\n");
            count++;
            return;
        }

        go(n - 1, pillarFrom, pillarTo, pillarBy);
        bf.write("" + pillarFrom + " " + pillarTo + "\n");
        count++;
        go(n - 1, pillarBy, pillarFrom, pillarTo);
    }
}
