package week7;

import java.io.*;
import java.util.StringTokenizer;

public class DY16_6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int max = 0;
		int d[][] = new int [n+1][n+1];
		StringTokenizer st;
		
		for(int i=1;i<n+1;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<i+1;j++) {
				d[i][j]=Integer.parseInt(st.nextToken());
				// ù��° ���� d[i][1]�� �� ���� ���� 0�̹Ƿ� �׻� ������ �� d[i-1][1]��° ���� ������
				if(j==1) d[i][j] = d[i-1][j] + d[i][j];
				// ������ ���� d[i][i]�� ������ ���� 0�̹Ƿ� �׻� ���� �� d[i-1][i-1]��° ���� ������
				else if(j==i) d[i][j] = d[i-1][j-1] + d[i][j];
				// �߰� ���� ��, �� �� �� �� �� ū ���� ��� ���Ѵ�.
				else d[i][j] = Math.max(d[i-1][j-1], d[i-1][j]) + d[i][j];
				
				// �ִ� ��
				if(max<d[i][j]) max = d[i][j];
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}

}
