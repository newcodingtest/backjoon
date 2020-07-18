package back;
import java.io.*;

public class dp5 {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[][] price=new int[n][3];  //색시정
		int[][] dp=new int[n][3];
		
		for(int i=0; i<price.length; i++) {
			price[i][0]=Integer.parseInt(br.readLine());
			price[i][1]=Integer.parseInt(br.readLine());
			price[i][2]=Integer.parseInt(br.readLine());
		}
		
		dp[0][0]=price[0][0];  //첫번째
		dp[0][1]=price[0][1];  //두번째
		dp[0][2]=price[0][2];  //세번째 색깔이 다른 값을 지정
		
		for(int i=1; i<n; i++) {
			dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2]+price[i][0]); // 49   (40,83)
			dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2]+price[i][1]); // 60   (26,83)
			dp[i][2]=Math.min(dp[i-1][0],dp[i-1][1]+price[i][2]); // 57	  (26,40)
		}
		bw.write(Math.min(dp[n][1],Math.min(dp[n][2],dp[n][3])));
		bw.close();
	}

}
