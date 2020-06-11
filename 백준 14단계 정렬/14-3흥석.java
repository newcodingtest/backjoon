import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int arr[] = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i=0;i<input;i++){
            bw.write(String.valueOf(arr[i])+"\n");
        }

        bw.flush();
        bw.close();
    }
}