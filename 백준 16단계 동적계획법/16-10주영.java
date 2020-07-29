package back;
import java.io.*;
import java.util.StringTokenizer;

/*
[����:]
1.������ ���� �����ϸ� �� �ܿ� ����ִ� �����ִ� ��� ���ž� �ϰ�, ���� �Ŀ��� ���� ��ġ�� �ٽ� ���ƾ� �Ѵ�.
2.�������� ���� �ִ� 3���� ��� ���� ���� ����

1���� n������ ��ȣ�� �پ� �ִ� n���� ������ ���� ������� ���̺� ���� ���� �ְ�, �� ������ �ܿ� ����ִ� ��������
���� �־����� ��, ȿ�ָ� ���� ���� ���� ���� �����ָ� ���� �� �ֵ��� �ϴ� ���α׷��� �ۼ��Ͻÿ�. 

[�Է�:]

ù° �ٿ� ������ ���� ���� n�� �־�����. (1��n��10,000) ��° �ٺ��� n+1��° �ٱ��� ������ �ܿ� ����ִ�
�������� ���� ������� �־�����. �������� ���� 1,000 ������ ���� �ƴ� �����̴�.

[���:] 
ù° �ٿ� �ִ�� ���� �� �ִ� �������� ���� ����Ѵ�.

��ȭ��
0�����ǰ�� dp[n] = dp[n-1]
1�����ǰ�� dp[n] = dp[n-2]+p[n]
2�����ǰ�� dp[n]  = dp[n-3]+p[n-1]+p[n]



�޸�:15076 �ð�:120
  */

public class dp10 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); //������ ����
        int[] podo = new int[N];  //���� ��
        int[] dp = new int[N];     // ��ȭ�� ������
 
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            podo[i] = Integer.parseInt(st.nextToken());
        }
        
       
        dp[0] = podo[0];
 
        if(N > 2) {
 
            dp[1] = podo[0] + podo[1];
            dp[2] = Math.max(dp[1], Math.max(podo[0]+podo[2], podo[1]+podo[2])); // ���� 3���� ���
 
            for(int j=3; j<dp.length; j++) {
 
            	dp[j] = Math.max(podo[j] + dp[j-2], podo[j] + podo[j-1] + dp[j-3]);
            	dp[j] = Math.max(dp[j], dp[j-1]);
 
            }
            bw.write(String.valueOf(dp[N-1]));
 
        }else if(N == 2){ // ���� 2���� ���
            bw.write(String.valueOf(podo[0] + podo[1]));
        }else if(N == 1){ // ���� 1���� ���
            bw.write(String.valueOf(podo[0]));
        }
        bw.flush();
    }    
 
}
	 
