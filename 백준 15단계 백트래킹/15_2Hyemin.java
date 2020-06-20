// [Åë°ú] 13016 KB / 80 ms
import java.io.*;

public class Main {
    static boolean[] numsUsed;
    static int[] numsSelected;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        numsUsed = new boolean[n];
        numsSelected = new int[m];

        go(n, m, 0);

        bw.flush();
        bw.close();
    }

    static void go(int n, int m, int idx) throws IOException {
        if (idx == m) {
            bw.write(toStr(numsSelected));
            return;
        }

        for (int i = (idx > 0 ? numsSelected[idx - 1] : idx + 1); i <= n; i++) {
            if (numsUsed[i - 1]) continue;
            numsUsed[i - 1] = true;
            numsSelected[idx] = i;
            go(n, m, idx + 1);
            numsUsed[i - 1] = false;
        }
    }

    static String toStr(int[] numSel) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numSel.length; i++) {
            if (i == numSel.length - 1) {
                str.append(numSel[i]);
            } else {
                str.append(numSel[i]).append(" ");
            }
        }
        str.append("\n");
        return str.toString();
    }
}
