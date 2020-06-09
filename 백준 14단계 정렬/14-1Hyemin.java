import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] numbers = new int[10001];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[num]++;
        }

        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < numbers[i]; j++) {
                bf.write(i + "\n");
            }
        }

        bf.flush();
        bf.close();
    }
}
