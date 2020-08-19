package back;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

/*
����:  �ð�
1:  3��
2:  1��
3:  4��
4:  3��
5:  2��


1+(1+2)+(1+2+3)+(1+2+3+4)
*/

public class grid_3{ //�޸�:13560 �ð�:92ms
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	 
		
		
		int N=Integer.parseInt(br.readLine());
		int []dp=new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			
			dp[i]=Integer.parseInt(st.nextToken());
		}
		
		int sum=0;
		Arrays.sort(dp);
		
		for(int i=0; i<dp.length; i++) {
			for(int j=0; j<=i; j++) {
			sum+=dp[j];
			}	
		}
		bw.write(sum+"\n");
		bw.flush();
	
		
	}

}
