//14368KB	100ms
import java.io.*;
import java.util.Arrays;

public class MMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int F[][] = new int[N][3];
        String arr[] = new String[3];

        for (int i = 0; i < N; i++) {
            arr = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                F[i][j] = Integer.parseInt(arr[j]);
            }
        }
        int a=0;
        int b=0;

        for (int i = 1; i < N; i++) {
            for(int j = 0; j < 3; j++) {
                if(j==0) {a=1; b=2;}
                if(j==1) {a=0; b=2;}
                if(j==2) {a=0; b=1;}

                if(F[i-1][a]+F[i][j]<F[i-1][b]+F[i][j]){
                    F[i][j]=F[i-1][a]+F[i][j];
                }else{
                    F[i][j]=F[i-1][b]+F[i][j];
                }
            }
        }

        Arrays.sort(F[N-1]);
        bw.write(String.valueOf(F[N-1][0]));
        bw.flush();
        bw.close();
    }
}
