// 17216KB, 108ms
package week9;

import java.io.*;

public class DY16_8 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int dp[] = new int[n+1];
		// ��� �ƴ� ���� ���� �迭 ���� +1
		for(int i=2;i<n+1;i++) {
			dp[i] = dp[i-1] + 1;
			if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
		}
		
		//2�� ������ �Ŷ� 1���� 3���� ������ �Ŷ� ��
		bw.write(String.valueOf(dp[n]));
		bw.close();

	}

}
