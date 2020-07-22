package back;
import java.io.*;


/*3������ ������ �̿��Ͽ� 1�� ����� �ּ�Ƚ���� ����϶�*/

public class dp7 { //�޸�:17168 �ð�:104ms
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N=Integer.parseInt(br.readLine());
		int [] dp=new int[N+1];
		
		dp[0]=dp[1]=0;
		
		for(int i=2; i<=N; i++) {
			dp[i]=dp[i-1]+1;         //1������
			if( (i%2==0) && dp[i]>dp[i/2]+1) dp[i]=dp[i/2]+1; //x�� 2�� ������ ��������
			if((i%3==0) && dp[i]>dp[i/3]+1) dp[i]=dp[i/3]+1;  //x�� 3���� ������ ��������
            
		}
		bw.write(String.valueOf(dp[N]));
		bw.flush();
		bw.close();
		
	}

}
