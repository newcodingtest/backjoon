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
				// 첫번째 값인 d[i][1]일 때 왼쪽 값은 0이므로 항상 오른쪽 값 d[i-1][1]번째 값과 더해짐
				if(j==1) d[i][j] = d[i-1][j] + d[i][j];
				// 마지막 값인 d[i][i]는 오른쪽 값이 0이므로 항상 왼쪽 값 d[i-1][i-1]번째 값과 더해짐
				else if(j==i) d[i][j] = d[i-1][j-1] + d[i][j];
				// 중간 값은 좌, 우 두 개 값 중 큰 값을 골라서 더한다.
				else d[i][j] = Math.max(d[i-1][j-1], d[i-1][j]) + d[i][j];
				
				// 최댓값 비교
				if(max<d[i][j]) max = d[i][j];
			}
		}
		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();
	}

}
