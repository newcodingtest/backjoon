// 17528KB, 116ms
package week11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DY16_14 {	
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = br.readLine();
		String m = br.readLine();
		
		// 각 문자열의 길이만큼 선언
		// 주의해야 할 점은 무엇을 기준으로 무엇과 비교할지를 정한 후 순서에 맞게 선언해주어야 한다.
        // 여기선 m을 기준으로 n과 비교하게 된다.
		int dp[][] = new int [m.length()+1][n.length()+1];
		
		for(int i=1;i<=m.length();i++) { // m을 기준으로			
			for(int j=1;j<=n.length();j++) { // n과 비교				
				if(m.charAt(i-1) != n.charAt(j-1)) { // 다를 경우					
					dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]); //점화식
				}else { // 같을 경우
					dp[i][j] = dp[i-1][j-1]+1; // 점화식
				}			
			}		
		}
		
		bw.write(String.valueOf(dp[m.length()][n.length()]));// 이곳 역시 선언과 똑같이 출력해주어야 런타임 에러가 나지 않는다.
		bw.flush();
		bw.close();	
	}
}
