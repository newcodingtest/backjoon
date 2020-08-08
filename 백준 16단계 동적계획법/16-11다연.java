// 13444KB, 100ms
package week11;

import java.io.*;
import java.util.StringTokenizer;

// 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
// 예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {"10", "20", 10, "30", 20, "50"} 이고, 길이는 4이다.
// 입력 : 6 (수열 A의 크기)
// 입력 : 10 20 10 30 20 50 (수열 A를 이루고 있는 Ai)
// 출력 : 4 (첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력.)
// 30 10 20 30 40  
public class DY16_11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [n+1];
		int dp[] = new int[n+1];
		int length = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			dp[i]++; // dp 초기값은 1이다.
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]&&dp[i]<=dp[j]) {
					// 이전 숫자보다 작을 경우 전에 계산한 길이의 최대값을 dp에 넣는다.
					// 이전 dp가 현재 dp[i]보다 크거나 같은 경우만 +1을 한다.
					// 가령 A[4]는 A[2]와 비교한 뒤 dp[4] = 3이 된다.
					// 이후 A[3]과 비교하면 dp[3] = 1이므로  dp[4] = 2로 갱신돼야 하나,
					// dp[i]>dp[j]이므로 dp[i]<=dp[j]가 성립하지 않는다.
					// 따라서 최대값이 유지된다.
					dp[i] = dp[j] + 1;
				}
			}
			length = Math.max(length, dp[i]);
		}
		
//		for(int i:dp) { // for each문, 배열과 사용하기 좋다. 43라인 코드 작성으로 삭제
//			length = Math.max(length, i);
//		}
		
		bw.write(String.valueOf(length));
		bw.flush();
		bw.close();

	}
}
