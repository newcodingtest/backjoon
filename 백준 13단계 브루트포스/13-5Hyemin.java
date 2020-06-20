// [Åë°ú] 185400 KB / 332 ms
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = 0;
        for (int i = 1; i <= n; i++) {
            if(i == 1) m = 665;

            do {
                m++;
            } while(!isDevilNum(m));
        }
        bw.write(m + "\n");

        bw.flush();
        bw.close();
    }

    static boolean isDevilNum(int num) {
        String numStr = "" + num;
        char[] numChars = numStr.toCharArray();
        int comboSix = 0;
        int comboMax = 0;
        for (int i = 0; i < numChars.length; i++) {
            if (numChars[i] == '6') {
                comboSix++;
                if (comboSix > comboMax) comboMax = comboSix;
            } else {
                comboSix = 0;
            }
        }
        return comboMax >= 3;
    }
}