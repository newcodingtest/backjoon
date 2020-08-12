//24428KB, 200ms, 726B
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합_내풀이_DP {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[]a = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) 
			a[i] = Integer.parseInt(st.nextToken());		
		
/*
		  음수가포함되더라도 길이가 길면 누적합이 더 클수 있다 -> 끝까지 누적합 
		  기존최대값 + 양수 = 최대값
		  기존최대값 + 음수 = 최대값은 아니지만 뒤에서 최대가 될수있음 -> 음수누적합저장x -> 이전최댓값 저장 (선택누적합)
		  
		  예제2)
		  값입력:  2 1 -4 3 4 -4 6 5 -5 1
		  단순누적: 2 3 -1 2 6 2 8 13 8 9
		  선택누적합:2 3 -1 3 7 3 9 14
		  
		 - 2차원배열로 모든경우의수
		 누적합이 음수가되면 a[i]의미:  대각선자리 새로운 행에서 누적합 시작
		  출처: https://nerogarret.tistory.com/40
		  
*/
		int[] dp = new int[n];
		int max = dp[0] = a[0];

		for (int i=1; i <n; i++) {

//			if (a[i] < 0) continue; 새로운 dp[i]값에 기존최대값을 넣을수가 없음
				
			
			dp[i] = Math.max(dp[i-1] + a[i], a[i]);//음수값이 더해지면 a[i]새로운행으로 시작하는것과 비교해서 더큰값으로 대입

			max = Math.max(max, dp[i]);

		}

		System.out.println(max);
	}
}

/*
 * 2중for문 O(n2) -> 시간초과
 */
public class 연속합_내풀이_이중for {
	static int maxSum=Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) 
			a[i] = Integer.parseInt(st.nextToken());		
		
		for (int i = 0; i < n; i++) {
			int sum= a[i];
			maxSum = Math.max(maxSum, sum);
			
			for (int j = i+1; j < n; j++) {
				sum += a[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
	}
}
