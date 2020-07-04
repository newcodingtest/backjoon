import java.util.Scanner;

public class backtracking3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        scan.close();

        int n = Integer.parseInt(s.substring(0, s.indexOf(' ')));
        int m = Integer.parseInt(s.substring(s.indexOf(' ') + 1, s.length()));
        printSolutions(n, m);
    }

    public static void printSolutions(int n, int m) {

        for (int i = 1; i <= n; i++) {
            String sol = i + " ";
            helper(n, m - 1, sol);
        }
    }

    private static void helper(int n, int m, String sol) {
        if (m == 0) {
            System.out.println(sol);
            return;
        }
        for (int i = 1; i <= n; i++) {
            String solPlus = sol + i + " ";
            helper(n, m - 1, solPlus);
        }
    }

}