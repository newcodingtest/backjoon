package back;
import java.io.*; 
import java.util.*;




/*
[문제:]수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

          예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다
      0   1   2  3  4   5
      
[입력:]
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

[출력:]
      

a[] 10 20 10 30 20 50 

d[] 1   2   2   3  3  4 

4
  
 
 * */

public class dp1610 {  //큰값이 나오면 +1  메모리:13880 시간:96
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		int [] dp=new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());		
		}
		
		for(int i=0; i<n; i++) {
			dp[i]=1;
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j] && dp[j]>=dp[i]) {
				dp[i]++;
							}
			}
		}
		
		int max=0;
		for(int i=0; i<n; i++) {
			max=Math.max(max,dp[i]);
			
		}
		bw.write(String.valueOf(max));
	    bw.flush();
		
		
		
	}


}
