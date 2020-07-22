package back;
import java.io.*;


/*3가지의 연산을 이용하여 1을 만드는 최소횟수를 출력하라*/

public class dp7 { //메모리:17168 시간:104ms
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		int [] dp=new int[N+1];
		
		dp[0]=dp[1]=0;
		
		for(int i=2; i<=N; i++) {
			dp[i]=dp[i-1]+1;         //1을뺀다
			if( (i%2==0) && dp[i]>dp[i/2]+1) dp[i]=dp[i/2]+1; //x가 2로 나누어 떨어지면
			if((i%3==0) && dp[i]>dp[i/3]+1) dp[i]=dp[i/3]+1;  //x가 3으로 나누어 떨어지면
            
		}
		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
		
	}

}
