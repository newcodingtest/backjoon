import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));

        // for INPUT TEST
        // String inputCase = "10 500\n93 181 245 214 315 36 185 138 216 295";  //"5 21\n5 6 7 8 9";
        // InputStream is = new ByteArrayInputStream(inputCase.getBytes());
        // Scanner sc = new Scanner(is);

        // for SUBMISSION
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n ;i++) {
            nums[i] = sc.nextInt();
        }

        int result = go(n, m, nums);
        bf.write("" + result + "\n");

        bf.flush();
        bf.close();
    }

    private static int go(int n, int m, int[] nums) {
        int score = 0;
        for (int i = 0; i < (n - 2); i++) {
            for (int j = i + 1; j < (n - 1); j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = (nums[i] + nums[j] + nums[k]);

                    if (sum <= m && sum > score)
                        score = sum;

                    if (m == score)
                        break;
                }
                if (m == score)
                    break;
            }
            if (m == score)
                break;
        }
        return score;
    }
}
