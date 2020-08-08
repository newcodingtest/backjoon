// 14123KB, 128ms
package week11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DY16_12 {

	public static void main(String[] args) throws IOException {
		// LIS라는 개념이 필요하다. 가장 긴 부분 "증가" 수열, 가장 긴 부분 "감소" 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int [n+1];
		int dp[][] = new int [2][n+1];
		int max = 0; //Integer.MIN_VALUE;
		
		for(int i=1;i<=n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[1][i] = 1;
			dp[0][i] = 1;
		}
		
		for(int i=1;i<=n;i++) { // 왼쪽에서 시작하는 LIS
			for(int j=1;j<i;j++) {
				if(arr[i]>arr[j]&&dp[0][i]<=dp[0][j]) {
					dp[0][i] = dp[0][j]+1;
				}
			}
		}
		
		for(int i=n;i>=0;i--) { // 오른쪽에서 시작하는 LIS
			for(int j=n;j>i;j--) {
				if(arr[i]>arr[j]&&dp[1][i]<=dp[1][j]) {
					dp[1][i] = dp[1][j]+1;
				}
			}
			dp[0][i] += dp[1][i]; // 두 배열의 값들을 더해준다.
//			max = Math.max(dp[0][i], max);
			if(max<dp[0][i]) max = dp[0][i];
		}
		
//		for(int i=1;i<=n;i++) { // 두 배열의 값들을 더해준다.
//			dp[0][i] += dp[1][i];
//			System.out.println(dp[0][i]);
//		}
		
//		for(int i=1;i<=n;i++) {
//			if(dp[0][i] > max) {
//				max = dp[0][i];	
//			}
//		}
		bw.write(String.valueOf(max-1));
		bw.flush();
		bw.close();		
	}
