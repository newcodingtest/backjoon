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

// 첫째 줄에는 두 전봇대 사이의 전깃줄의 개수가 주어진다. 전깃줄의 개수는 100 이하의 자연수이다. 
// 둘째 줄부터 한 줄에 하나씩 전깃줄이 A전봇대와 연결되는 위치의 번호와 B전봇대와 연결되는 위치의 번호가 차례로 주어진다. 
// 위치의 번호는 500 이하의 자연수이고, 같은 위치에 두 개 이상의 전깃줄이 연결될 수 없다.
public class DY16_13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[][] = new int [n+1][2]; // 0은 A 1은 B
		int dp[] = new int [n+1];
		
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// arr 배열 정렬 후 B를 왼쪽에서 시작하는 LIS로 만들어 계산한다.
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
