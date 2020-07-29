package back;
import java.io.*;
import java.util.StringTokenizer;

/*
[문제:]
1.포도주 잔을 선택하면 그 잔에 들어있는 포도주는 모두 마셔야 하고, 마신 후에는 원래 위치에 다시 놓아야 한다.
2.연속으로 놓여 있는 3잔을 모두 마실 수는 없다

1부터 n까지의 번호가 붙어 있는 n개의 포도주 잔이 순서대로 테이블 위에 놓여 있고, 각 포도주 잔에 들어있는 포도주의
양이 주어졌을 때, 효주를 도와 가장 많은 양의 포도주를 마실 수 있도록 하는 프로그램을 작성하시오. 

[입력:]

첫째 줄에 포도주 잔의 개수 n이 주어진다. (1≤n≤10,000) 둘째 줄부터 n+1번째 줄까지 포도주 잔에 들어있는
포도주의 양이 순서대로 주어진다. 포도주의 양은 1,000 이하의 음이 아닌 정수이다.

[출력:] 
첫째 줄에 최대로 마실 수 있는 포도주의 양을 출력한다.

점화식
0번마실경우 dp[n] = dp[n-1]
1번마실경우 dp[n] = dp[n-2]+p[n]
2번마실경우 dp[n]  = dp[n-3]+p[n-1]+p[n]



메모리:15076 시간:120
  */

public class dp10 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); //포도잔 개수
        int[] podo = new int[N];  //포도 값
        int[] dp = new int[N];     // 점화식 고정값
 
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            podo[i] = Integer.parseInt(st.nextToken());
        }
        
       
        dp[0] = podo[0];
 
        if(N > 2) {
 
            dp[1] = podo[0] + podo[1];
            dp[2] = Math.max(dp[1], Math.max(podo[0]+podo[2], podo[1]+podo[2])); // 잔이 3잔일 경우
 
            for(int j=3; j<dp.length; j++) {
 
            	dp[j] = Math.max(podo[j] + dp[j-2], podo[j] + podo[j-1] + dp[j-3]);
            	dp[j] = Math.max(dp[j], dp[j-1]);
 
            }
            bw.write(String.valueOf(dp[N-1]));
 
        }else if(N == 2){ // 잔이 2잔일 경우
            bw.write(String.valueOf(podo[0] + podo[1]));
        }else if(N == 1){ // 잔이 1잔일 경우
            bw.write(String.valueOf(podo[0]));
        }
        bw.flush();
    }    
 
}
	 
