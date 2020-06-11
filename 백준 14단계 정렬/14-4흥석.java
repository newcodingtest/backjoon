import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int arr[] = new int[input];
        int cntArr[] = new int[80001];


        for (int i = 0; i < input; i++){
            arr[i] = (Integer.parseInt(br.readLine()));
            if (arr[i] >= 0)
                cntArr[4000 + arr[i]]++;
            else
                cntArr[4000 + arr[i]]++; // -1 ->a[3999] , -4000->a[0]
        }


        int max = 0;
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] > max)
                max = cntArr[i];
        }

        int k = 0;
        int cnt = 0;
        for(int i=0;i<cntArr.length;i++){
            if (cntArr[i] == max) {
                ++cnt;
                k=i;
            }
            if (cnt == 2) {
                k=i;
                break;
            }
        }


        k = k - 4000;


        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < input; i++) {
            sum += arr[i];
        }


        bw.write(String.valueOf((int) (Math.floor((double) sum / input + 0.5))) + "\n");
        bw.write(String.valueOf(arr[(int) (input / 2)]) + "\n");
        bw.write(k + "\n");
        bw.write(String.valueOf(arr[input - 1] - arr[0]) + "\n");

        bw.flush();
        bw.close();

    }
}