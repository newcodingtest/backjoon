import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            bf.write(chars[i]);
        }
        bf.flush();
        bf.close();
    }
}
