package week11;
// 13176KB, 84ms

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// ù° �ٿ��� �� ������ ������ �������� ������ �־�����. �������� ������ 100 ������ �ڿ����̴�. 
// ��° �ٺ��� �� �ٿ� �ϳ��� �������� A������� ����Ǵ� ��ġ�� ��ȣ�� B������� ����Ǵ� ��ġ�� ��ȣ�� ���ʷ� �־�����. 
// ��ġ�� ��ȣ�� 500 ������ �ڿ����̰�, ���� ��ġ�� �� �� �̻��� �������� ����� �� ����.
public class DY16_13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[][] = new int [n+1][2]; // 0�� A 1�� B
		int dp[] = new int [n+1];
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// arr �迭 ���� �� B�� ���ʿ��� �����ϴ� LIS�� ����� ����Ѵ�.
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]<o2[0]) return -1;
				else if(o1[0]>o2[0]) return 1;
				return 0;
			}		
		});
        
		int max = 0;
		
		for(int i=1;i<=n;i++) {
			dp[i] = 1;
			for(int j=1;j<i;j++) {
				if(arr[i][1]>arr[j][1]&&dp[i]<=dp[j]) {
					dp[i] = dp[j]+1;
				}
			}     
			if(dp[i]>max) max = dp[i];
		}
        
		bw.write(String.valueOf(n-max));
		bw.flush();
		bw.close();
	}
// https://fbtmdwhd33.tistory.com/57
}
