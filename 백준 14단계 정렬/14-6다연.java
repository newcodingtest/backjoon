package week4;

import java.io.*;
import java.util.*;

public class DY14_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int array[][] = new int [n][2];
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array, new Comparator<int[]>() {

			@Override
			public int compare(int[] arg0, int[] arg1) {
				if(arg0[0]==arg1[0]) return Integer.compare(arg0[1], arg1[1]);
				return Integer.compare(arg0[0], arg1[0]);
			}
		});

		for(int i=0;i<n;i++) {
			bw.write(array[i][0]+" "+ array[i][1]+"\n");
		}
		bw.flush();
		bw.close();
	}
}
