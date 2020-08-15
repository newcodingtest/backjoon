//	46440	476
import java.io.*;
import java.util.*;

public class MMAIN {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] F = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                F[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(F, new Comparator<int[]>() {
            @Override
            public int compare(int[] A, int[] B) {
                if (A[1] == B[1]) {
                    return A[0] - B[0];
                } else {
                    return A[1] - B[1];
                }
            }
        });

        int end = -1;
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (F[i][0] >= end) {
                end = F[i][1];
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

}
