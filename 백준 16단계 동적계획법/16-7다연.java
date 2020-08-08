// 13140KB, 80ms
package week9;

import java.io.*;

public class DY16_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		int stair[] = new int[n+1];
		
		for(int i=1;i<n+1;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		stair[1] = arr[1];
		if(n>1) stair[2] = arr[1] + arr[2];
		
		for(int i=3;i<n+1;i++) {
			stair[i] = Math.max(stair[i-3]+arr[i]+arr[i-1], stair[i-2]+arr[i]);
		}
		
		bw.write(String.valueOf(stair[n]));
		bw.close();

	};

}
