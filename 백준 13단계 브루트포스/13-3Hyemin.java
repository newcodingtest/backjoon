// [Åë°ú] 12996 KB / 80 ms
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] humans = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            humans[i][0] = Integer.parseInt(inputs[0]);
            humans[i][1] = Integer.parseInt(inputs[1]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (humans[i][0] < humans[j][0] && humans[i][1] < humans[j][1]) {
                    humans[i][2] += 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                bw.write((humans[i][2] + 1) + "\n");
            } else {
                bw.write((humans[i][2] + 1) + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}