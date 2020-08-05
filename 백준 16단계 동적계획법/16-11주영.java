package back;
import java.io.*; 
import java.util.*;




/*
[����:]���� A�� �־����� ��, ���� �� �����ϴ� �κ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

          ���� ���, ���� A = {10, 20, 10, 30, 20, 50} �� ��쿡 ���� �� �����ϴ� �κ� ������ A = {10, 20, 10, 30, 20, 50} �̰�, ���̴� 4�̴�
      0   1   2  3  4   5
      
[�Է�:]
ù° �ٿ� ���� A�� ũ�� N (1 �� N �� 1,000)�� �־�����.

��° �ٿ��� ���� A�� �̷�� �ִ� Ai�� �־�����. (1 �� Ai �� 1,000)

[���:]
      

a[] 10 20 10 30 20 50 

d[] 1   2   2   3  3  4 

4
  
 
 * */

public class dp1610 {  //ū���� ������ +1  �޸�:13880 �ð�:96
	
	
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
