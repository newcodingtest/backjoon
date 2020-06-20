import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().split(" ");
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] v1, String[] v2) {
                if (Integer.parseInt(v1[0]) > Integer.parseInt(v2[0]))
                    return 1;
                else if (Integer.parseInt(v1[0]) < Integer.parseInt(v2[0]))
                    return -1;
                else
                    return 1;
            }
        });


        for (String s1[] : arr) {
            for (String s2 : s1) {
                bw.write(s2 + " ");
            }
            bw.write('\n');
        }
        bw.flush();
        bw.close();
    }
}
