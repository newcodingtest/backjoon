// [Åë°ú] 13744 KB / 84 ms
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        char[][] pane = new char[n][m];
        boolean[][] recolorW = new boolean[n][m];
        boolean[][] recolorB = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            pane[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) % 2 == 0 && pane[i][j] != 'W') {
                    recolorW[i][j] = true;
                } else if ((i + j) % 2 == 1 && pane[i][j] != 'B') {
                    recolorW[i][j] = true;
                }

                if ((i + j) % 2 == 1 && pane[i][j] != 'W') {
                    recolorB[i][j] = true;
                } else if ((i + j) % 2 == 0 && pane[i][j] != 'B') {
                    recolorB[i][j] = true;
                }
            }
        }

        int min = 8 * 8;
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int cntW = 0;
                int cntB = 0;
                for (int ix = i; ix < i + 8; ix++) {
                    for (int jy = j; jy < j + 8; jy++) {
                        if (recolorW[ix][jy]) cntW++;
                        if (recolorB[ix][jy]) cntB++;
                    }
                }
                if (min > cntW) min = cntW;
                if (min > cntB) min = cntB;
            }
        }
        bw.write(min + "\n");
        bw.flush();
        bw.close();
    }
}