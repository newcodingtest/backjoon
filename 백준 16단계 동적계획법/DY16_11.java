// 13444KB, 100ms
package week11;

import java.io.*;
import java.util.StringTokenizer;

// ���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {"10", "20", 10, "30", 20, "50"} �̰�, ���̴� 4�̴�.
// �Է� : 6 (���� A�� ũ��)
// �Է� : 10 20 10 30 20 50 (���� A�� �̷�� �ִ� Ai)
// ��� : 4 (ù° �ٿ� ���� A�� ���� �� �����ϴ� �κ� ������ ���̸� ���.)
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
			dp[i]++; // dp �ʱⰪ�� 1�̴�.
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]&&dp[i]<=dp[j]) {
					// ���� ���ں��� ���� ��� ���� ����� ������ �ִ밪�� dp�� �ִ´�.
					// ���� dp�� ���� dp[i]���� ũ�ų� ���� ��츸 +1�� �Ѵ�.
					// ���� A[4]�� A[2]�� ���� �� dp[4] = 3�� �ȴ�.
					// ���� A[3]�� ���ϸ� dp[3] = 1�̹Ƿ�  dp[4] = 2�� ���ŵž� �ϳ�,
					// dp[i]>dp[j]�̹Ƿ� dp[i]<=dp[j]�� �������� �ʴ´�.
					// ���� �ִ밪�� �����ȴ�.
					dp[i] = dp[j] + 1;
				}
			}
			length = Math.max(length, dp[i]);
		}
		
//		for(int i:dp) { // for each��, �迭�� ����ϱ� ����. 43���� �ڵ� �ۼ����� ����
//			length = Math.max(length, i);
//		}
		
		bw.write(String.valueOf(length));
		bw.flush();
		bw.close();

	}
}
