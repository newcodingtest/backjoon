import java.io.*;
import java.util.Scanner;

public class prr {
    public static void main(String[] args) throws IOException {

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //String[] nm = br.readLine().split(" ");
        //String[] num = br.readLine().split(" ");
        //int number[] = new int[num.length];
        //for (int i = 0; i < num.length; i++)
        //    number[i] = Integer.parseInt(num[i]);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];

        for(int i=0; i<num.length;i++)
            num[i]= sc.nextInt();

        int sum = 0;
        // int m = Integer.parseInt(nm[1]);
        int tmp = 0;

        for (int i = 0; i < m-2; i++) {
            for (int j = 1 + i; j < m-1; j++) {
                {
                    for (int k =1+j; k < m; k++) {
                        sum = num[i]+num[j]+num[k];
                        if (m - sum >= 0 && sum >= tmp) {
                            tmp = sum;
                        }
                    }
                }
            }
        }

        //bw.write(String.valueOf(tmp));
        //bw.flush();
        // bw.close();

    }
}