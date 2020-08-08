package week7;
import java.io.*;

public class DY16_2 {
	public static int arr[][];
	public static int zero;
	public static int one;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		arr = new int [41][2];
		arr[0][0] = 1;
		arr[1][1] = 1;
		
		for(int i=2;i<41;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = arr[i-1][j] + arr[i-2][j];
			}
		}
		
		for(int i=0;i<t;i++) {
			int a = Integer.parseInt(br.readLine());
			bw.write(arr[a][0]+" "+arr[a][1]+"\n");
		}
		bw.close();
		// TODO Auto-generated method stub

	}
}
