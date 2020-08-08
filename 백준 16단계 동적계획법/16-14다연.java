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
		
		// �� ���ڿ��� ���̸�ŭ ����
		// �����ؾ� �� ���� ������ �������� ������ �������� ���� �� ������ �°� �������־�� �Ѵ�.
        // ���⼱ m�� �������� n�� ���ϰ� �ȴ�.
		int dp[][] = new int [m.length()+1][n.length()+1];
		
		for(int i=1;i<=m.length();i++) { // m�� ��������			
			for(int j=1;j<=n.length();j++) { // n�� ��				
				if(m.charAt(i-1) != n.charAt(j-1)) { // �ٸ� ���					
					dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]); //��ȭ��
				}else { // ���� ���
					dp[i][j] = dp[i-1][j-1]+1; // ��ȭ��
				}			
			}		
		}
		
		bw.write(String.valueOf(dp[m.length()][n.length()]));// �̰� ���� ����� �Ȱ��� ������־�� ��Ÿ�� ������ ���� �ʴ´�.
		bw.flush();
		bw.close();	
	}
}
