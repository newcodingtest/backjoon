package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class DY13_3 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		int array[][] = new int [n][2];
		int rank[] = new int [n];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(bf.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
			rank[i] = 1;	
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(array[i][0]>array[j][0]&&array[i][1]>array[j][1]) {
					rank[j]++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			sb.append(rank[i]+" ");
		}
		System.out.println(sb);
	}
}
