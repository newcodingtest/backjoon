package week7;

import java.io.*;

public class DY16_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		long arr[] = new long[n+1];
		
		arr[1] = 1;
		arr[2] = 2;
		for(int i=3;i<=n;i++) {
			arr[i] = (arr[i-1]+arr[i-2])%15746;
		}
		bw.write(String.valueOf(arr[n]));
		bw.flush();
		bw.close();
		br.close();
	}

}
